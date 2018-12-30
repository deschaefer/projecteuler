package org.deschaefer.euler.solutions;

/**
 * Largest palindrome product
 * Problem 4
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
final class ProblemFour {

    /**
     * private constructor
     */
    private ProblemFour() {
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

        int biggest = 0;

        for (int left = 100; left < 1000; left++) {
            for (int right = 100; right < 1000; right++) {
                int product = right * left;

                String productString = Integer.toString(product);
                int productStringLength = productString.length();

                if (productStringLength % 2 == 0) {

                    if (isPalindrome(productString) && product > biggest) {
                        biggest = product;
                    }
                }
            }
        }
        return Integer.toString(biggest);
    }

    /**
     * is the string a palindrome
     * @param productString the string to test
     * @return true if palindrome
     */
    static boolean isPalindrome(final String productString) {

        int productStringLength = productString.length();
        int half = productStringLength / 2;

        String leftString = productString.substring(0, half);
        String rightString = productString.substring(half);

        for (int pos = 0; pos < half; pos++) {

            char leftChar = leftString.toCharArray()[pos];
            char rightChar = rightString.toCharArray()[(half - 1) - pos];

            if (!(leftChar == rightChar)) {
                return false;
            }
        }
        return true;
    }

}
