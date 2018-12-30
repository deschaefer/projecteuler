package org.deschaefer.euler.solutions;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("SpellCheckingInspection")
public class ProblemFourTest {

    @Test
    public void testIsPalindrome() {
        Assert.assertTrue(ProblemFour.isPalindrome("ABBA"));
        Assert.assertTrue(ProblemFour.isPalindrome("ABBBBA"));
        Assert.assertTrue(ProblemFour.isPalindrome("ABCCBA"));
        Assert.assertTrue(ProblemFour.isPalindrome("ABCDDCBA"));

        Assert.assertFalse(ProblemFour.isPalindrome("123"));
        Assert.assertFalse(ProblemFour.isPalindrome("123123"));
        Assert.assertFalse(ProblemFour.isPalindrome("12344322"));
    }
}
