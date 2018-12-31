package org.deschaefer.euler.solutions;

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
        final Double squareRoot = Math.sqrt(target);

        List<Long> primes =
                SolutionUtils.buildPrimes(squareRoot.longValue() + 1);

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


}
