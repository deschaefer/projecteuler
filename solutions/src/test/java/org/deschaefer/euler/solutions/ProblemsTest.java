package org.deschaefer.euler.solutions;

import org.junit.Assert;
import org.junit.Test;

public class ProblemsTest {

    @Test
    public void testOne() {

        Assert.assertEquals("233168",new ProblemOne().solve());
    }

    @Test
    public void testTwo() {

        Assert.assertEquals("4613732",new ProblemTwo().solve());
    }

    @Test
    public void testThree() {

        Assert.assertEquals("6857",new ProblemThree().solve());
    }
    @Test
    public void testFour() {

        Assert.assertEquals("906609",new ProblemFour().solve());
    }
    @Test
    public void testFive() {

        Assert.assertEquals("232792560",new ProblemFive().solve());
    }
    @Test
    public void testSix() {

        Assert.assertEquals("25164150",new ProblemSix().solve());
    }
    @Test
    public void testSeven() {

        Assert.assertEquals("104743",new ProblemSeven().solve());
    }

    @Test
    public void testEight() {

        Assert.assertEquals("23514624000",new ProblemEight().solve());
    }

}
