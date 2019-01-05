package org.deschaefer.euler.solutions;

import java.util.List;

/**
 * Summation of primes
 * Problem 10
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 */
@SuppressWarnings("PMD.SystemPrintln")
final class ProblemTen {

    /**
     * target
     */
    private static final long MAX = 2000000L;

    /**
     * base ctor
     */
    /* package */ ProblemTen() {
    }

    /**
     * solve the problem
     *
     * @return the answer
     */
    /* package */ String solve() {

        final List<Long> primes = SolutionUtils.findPrimes(MAX);

        long sum = 0;
        for (final Long prime : primes) {
            sum += prime;
        }
        return Long.toString(sum);
    }

}
