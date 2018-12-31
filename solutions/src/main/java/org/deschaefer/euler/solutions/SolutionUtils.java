package org.deschaefer.euler.solutions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * general utility class for problem solutions.
 */
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
    static List<Long> buildPrimes(final Long max) {

        List<Long> primes = new ArrayList<>();
        primes.add(2L);
        long startTime = new Date().getTime();

        System.out.println("Build Primes Start : " + startTime);

        for (long x = 3; x < max; x = x + 2) {

            if (isPrime(x, primes)) {
                primes.add(x);
            }
        }

        long stopTime = new Date().getTime();
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
    static List<Long> findPrimes(final int numberToFind) {

        List<Long> primes = new ArrayList<>();

        primes.add(2L);

        long startTime = new Date().getTime();

        System.out.println("Find Primes Start : " + startTime);

        long test = 3;

        while (primes.size() < numberToFind) {

            if (isPrime(test, primes)) {
                primes.add(test);
            }

            test++;
        }

        long stopTime = new Date().getTime();
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
    static boolean isPrime(final Long testMe) {
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

        for (Long prime : primes) {
            if (testMe % prime == 0) {
                return false;
            }
        }

        Long startWith = 2L;

        if (primes.size() > 0) {
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
