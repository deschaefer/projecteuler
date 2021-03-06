package org.deschaefer.euler.solutions;

/**
 * Smallest multiple
 * Problem 5
 * 2520 is the smallest number that can be divided by each of the numbers from
 * 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 */
@SuppressWarnings("PMD.SystemPrintln")
/* package */ final class ProblemFive {

    /**
     * base ctor
     */
    /* package */ ProblemFive() {
    }

    /**
     * solve the problem
     *
     * @return the answer
     */
    /* package */ String solve() {

        boolean notfound = true;
        int target = 40;

        while (notfound) {

            boolean allGood = true;
            for (int x = 1; x <= 20; x++) {
                final int modulo = target % x;

                if (modulo > 0) {
                    allGood = false;
                }
            }
            if (allGood) {
                notfound = false;
            } else {
                target++;
            }
        }

        return Integer.toString(target);

    }

}
