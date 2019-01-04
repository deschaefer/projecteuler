package org.deschaefer.euler.solutions;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("SpellCheckingInspection")
public class ProblemFourTest {

    @Test
    public void testIsPalindrome() {
        Assert.assertTrue(new ProblemFour().isPalindrome("ABBA"));
        Assert.assertTrue(new ProblemFour().isPalindrome("ABBBBA"));
        Assert.assertTrue(new ProblemFour().isPalindrome("ABCCBA"));
        Assert.assertTrue(new ProblemFour().isPalindrome("ABCDDCBA"));

        Assert.assertFalse(new ProblemFour().isPalindrome("123"));
        Assert.assertFalse(new ProblemFour().isPalindrome("123123"));
        Assert.assertFalse(new ProblemFour().isPalindrome("12344322"));
    }
}
