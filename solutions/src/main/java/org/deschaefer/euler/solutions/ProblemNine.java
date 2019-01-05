package org.deschaefer.euler.solutions;

/**
 * A Pythagorean triplet is a set of three natural numbers,
 * a < b < c, for which,
 * <p>
 * a2 + b2 = c2
 * For example, 3(2) + 4(2) = 9 + 16 = 25 = 5(2).
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
@SuppressWarnings("PMD.SystemPrintln")
final class ProblemNine {

    /**
     * value to solve for
     */
    private static final int TARGET = 1000;

    /**
     * base ctor
     */
    /* package */ ProblemNine() {
    }

    /**
     * solve the problem
     *
     * @return the answer
     */
    /* package */ String solve() {

        for (long a = 2; a < TARGET; a++) {
            for (long b = a + 1; b < TARGET; b++) {

                final long asquared = a * a;
                final long bsquared = b * b;

                for (long c = b + 1; c < TARGET; c++) {

                    final long csquared = c * c;

                    if (csquared == asquared + bsquared) {

                        final long test = a + b + c;

                        if (test == TARGET) {
                            final Long rval = a * b * c;
                            return rval.toString();
                        }
                    }
                }
            }
        }

        return "AWSH*T";
    }

}
