package org.deschaefer.euler.solutions;

import java.util.List;

/**
 * Largest prime factor
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
@SuppressWarnings("PMD.SystemPrintln")
final class ProblemThree {

    /**
     * value to calculate against
     */
    private static final Long TARGET = 600851475143L;
//        final Long target = 123100L;

    /**
     * base ctor
     */
    /* package */ ProblemThree() {
    }


    /**
     * solve the problem
     *
     * @return the answer
     */
    /* package */ String solve() {

        final Double squareRoot = Math.sqrt(TARGET);

        final List<Long> primes =
                SolutionUtils.buildPrimes(squareRoot.longValue() + 1);

        if (primes.contains(TARGET)) {
            return TARGET.toString();
        }

        Long biggest = 0L;

        for (final Long outer : primes) {

            if (TARGET % outer == 0) {
                biggest = outer;
            }

        }

        return biggest.toString();
    }


}
