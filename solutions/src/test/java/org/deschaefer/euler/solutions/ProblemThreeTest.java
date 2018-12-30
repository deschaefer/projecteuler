package org.deschaefer.euler.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.deschaefer.euler.solutions.ProblemThree.buildPrimes;
import static org.junit.Assert.*;

public class ProblemThreeTest {

    @Test
    public void isPrime() {
        org.junit.Assert.assertTrue(ProblemThree.isPrime(2L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(3L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(5L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(7L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(11L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(13L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(17L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(19L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(23L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(29L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(31L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(37L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(43L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(53L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(59L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(127L));
        org.junit.Assert.assertTrue(ProblemThree.isPrime(131L));

    }

    @Test
    public void isNotPrime() {
        org.junit.Assert.assertFalse(ProblemThree.isPrime(4L));
        org.junit.Assert.assertFalse(ProblemThree.isPrime(6L));
        org.junit.Assert.assertFalse(ProblemThree.isPrime(8L));
        org.junit.Assert.assertFalse(ProblemThree.isPrime(9L));
        org.junit.Assert.assertFalse(ProblemThree.isPrime(15L));
        org.junit.Assert.assertFalse(ProblemThree.isPrime(21L));
    }

    @Test
    public void buildPrimesTest() {
        List<Long> primes = ProblemThree.buildPrimes(25L);

        Long[] test = {2L,3L,5L,7L,11L,13L,17L,19L,23L};
        Assert.assertArrayEquals(test,primes.toArray());
    }

    @Test
    public void buildPrimesTest2() {
        List<Long> primes = ProblemThree.buildPrimes(1000000L);
    }

}