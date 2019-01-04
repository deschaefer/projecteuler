package org.deschaefer.euler.solutions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * general utility class for problem solutions.
 */
@SuppressWarnings("PMD.SystemPrintln")
final class SolutionUtils {

    /**
     * hidden ctor
     */
    private SolutionUtils() {
    }

    /**
     * populate the set of primes.
     *
     * @param max max value to determine prime.
     * @return list of primes
     */
    /* package */ static List<Long> buildPrimes(final Long max) {

        final List<Long> primes = new ArrayList<>();
        primes.add(2L);
        final long startTime = new Date().getTime();

        System.out.println("Build Primes Start : " + startTime);

        for (long x = 3; x < max; x = x + 2) {

            if (isPrime(x, primes)) {
                primes.add(x);
            }
        }

        final long stopTime = new Date().getTime();
        System.out.println("Build Primes Finish : "
                + new Date().getTime()
                + " : "
                + (stopTime - startTime));

        return primes;
    }

    /**
     * find a number of primes
     *
     * @param numberToFind number of primes, starting with 2 to find
     * @return list or primes in the order found.
     */
    /* package */ static List<Long> findPrimes(final int numberToFind) {

        final List<Long> primes = new ArrayList<>();

        primes.add(2L);

        final long startTime = new Date().getTime();

        System.out.println("Find Primes Start : " + startTime);

        long test = 3;

        while (primes.size() < numberToFind) {

            if (isPrime(test, primes)) {
                primes.add(test);
            }

            test++;
        }

        final long stopTime = new Date().getTime();
        System.out.println("Find Primes Finish : "
                + new Date().getTime()
                + " : "
                + (stopTime - startTime));

        return primes;
    }

    /**
     * is the number provided prime
     *
     * @param testMe number to test
     * @return true if prime
     */
    /* package */ static boolean isPrime(final Long testMe) {
        return isPrime(testMe, new ArrayList<>());

    }

    /**
     * is the number provided prime
     *
     * @param testMe number to test
     * @param primes list of known primes
     * @return true if prime
     */
    private static boolean isPrime(
            final Long testMe,
            final List<Long> primes) {

        if (primes.contains(testMe)) {
            return true;
        }

        for (final Long prime : primes) {
            if (testMe % prime == 0) {
                return false;
            }
        }

        Long startWith = 2L;

        if (!primes.isEmpty()) {
            startWith = primes.get(primes.size() - 1);
        }

        final long half = testMe / 2;

        for (long outer = startWith; outer <= half; outer++) {

            if (testMe % outer == 0) {
                return false;
            }

        }

        return true;
    }
}
