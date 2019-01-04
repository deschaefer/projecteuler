package org.deschaefer.euler.solutions;

/**
 * Largest palindrome product
 * Problem 4
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
@SuppressWarnings("PMD.SystemPrintln")
final class ProblemFour {

    /**
     * base ctor
     */
    /* package */ ProblemFour() {
    }

    /**
     * solve the problem
     *
     * @return the answer
     */
    /* package */ String solve() {

        int biggest = 0;

        for (int left = 100; left < 1000; left++) {
            for (int right = 100; right < 1000; right++) {
                final Integer product = right * left;

                final String productString = Integer.toString(product);
                final int productStrLen = productString.length();

                if (productStrLen % 2 == 0
                        && isPalindrome(productString)
                        && product > biggest) {
                    biggest = product;

                }
            }
        }
        return Integer.toString(biggest);
    }

    /**
     * is the string a palindrome
     *
     * @param productString the string to test
     * @return true if palindrome
     */
    /* package */ boolean isPalindrome(final String productString) {

        boolean rVal = true;

        final int productStrLen = productString.length();
        final int half = productStrLen / 2;

        final String leftString = productString.substring(0, half);
        final String rightString = productString.substring(half);

        for (int pos = 0; pos < half; pos++) {

            final char[] leftCharArray = leftString.toCharArray();
            final char leftChar = leftCharArray[pos];

            final char[] rightCharArray = rightString.toCharArray();
            final char rightChar = rightCharArray[(half - 1) - pos];

            if (leftChar != rightChar) {
                rVal = false;
                break;
            }
        }
        return rVal;
    }

}
