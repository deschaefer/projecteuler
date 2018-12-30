package org.deschaefer.euler.solutions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Largest prime factor
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
final class ProblemThree {

    /**
     * private constructor
     */
    private ProblemThree() {
    }

    /**
     * @param args command line params
     */
    public static void main(final String[] args) {
        System.out.println("\n" + solve());
    }

    /**
     * solve the problem
     *
     * @return the answer
     */
    private static String solve() {

        Long target = 600851475143L;
//        final Long target = 123100L;
        final Double squareroot = Math.sqrt(target);

        List<Long> primes = buildPrimes(squareroot.longValue() + 1);

        if (primes.contains(target)) {
            return target.toString();
        }

        Long biggest = 0L;

        for (Long outer : primes) {

            if (target % outer == 0) {
                biggest = outer;
            }

        }

        return biggest.toString();
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

        long sttopTime = new Date().getTime();
        System.out.println("Build Primes Finish : "
                + new Date().getTime()
                + " : "
                + (sttopTime - startTime));

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
    static boolean isPrime(final Long testMe, final List<Long> primes) {

        if (primes.contains(testMe)) {
            return true;
        }

        for (Long prime : primes) {
            if (testMe % prime == 0) {
                return false;
            }
        }

        Long startwith = 2L;

        if (primes.size() > 0) {
            startwith = primes.get(primes.size() - 1);
        }

        final Long half = testMe / 2;

        for (long outer = startwith; outer <= half; outer++) {

            if (testMe % outer == 0) {
                return false;
            }

        }

        return true;
    }
}
