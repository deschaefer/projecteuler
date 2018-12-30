package org.deschaefer.euler.solutions;

/**
 *
https://projecteuler.net/problem=1

Multiples of 3 and 5
Problem 1
    If we list all the natural numbers below 10 that are multiples of
    3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.

 */
final class ProblemOne {

    /**
     * private constructor
     */
    private ProblemOne() { }

    /**
     * @param args command line params
     */
    public static void main(final String[] args) {
        System.out.println(solve());
    }

    /**
     * solve the problem
     * @return the answer
     */
    private static int solve() {
        int total = 0;

        for (int x = 0; x < 1000; x++) {
            if ((x % 3) == 0) {
                total = total + x;
            } else if ((x % 5) == 0) {
                total = total + x;
            }
        }
        return total;
    }
}
