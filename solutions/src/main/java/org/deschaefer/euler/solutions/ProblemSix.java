package org.deschaefer.euler.solutions;

/**
 * Sum square difference
 * Problem 6
 * The sum of the squares of the first ten natural numbers is,
 * <p>
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * <p>
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 */
final class ProblemSix {

    /**
     * private constructor
     */
    private ProblemSix() {
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

        long sum = 0;
        long squareEachSum = 0;

        for (int x = 0; x <= 100; x++) {
            sum += x;

            squareEachSum += (x * x);
        }

        long squareSum = sum * sum;

        long diff = squareSum - squareEachSum;

        return Long.toString(diff);

    }

}
