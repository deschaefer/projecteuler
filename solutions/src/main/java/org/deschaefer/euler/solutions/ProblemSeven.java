package org.deschaefer.euler.solutions;

import java.util.List;

/**
 * 10001st prime
 * Problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * <p>
 * What is the 10 001st prime number?
 */
final class ProblemSeven {

    /**
     * private constructor
     */
    private ProblemSeven() {
    }

    /**
     * @param args command line params
     */
    public static void main(final String[] args) {
        System.out.println(solve());
    }

    /**
     * solve the problem
     *
     * @return the answer
     */
    private static String solve() {

        List<Long> primes = SolutionUtils.findPrimes(10001);

        Long lastPrime = primes.get(primes.size() - 1);

        return Long.toString(lastPrime);
    }

}
