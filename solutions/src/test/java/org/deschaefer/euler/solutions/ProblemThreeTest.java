package org.deschaefer.euler.solutions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProblemThreeTest {

    private final Long[] primes = {2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L, 31L, 37L, 43L, 53L,
            59L, 127L, 131L};

    @Test
    public void isPrime() {

        for ( Long p : primes )
        {
            org.junit.Assert.assertTrue(ProblemThree.isPrime(p));
        }
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

        Integer primesLength = primes.size();
        Integer testLength = test.length;

        assertEquals(primesLength, testLength);
    }

    @Test
    public void buildPrimesTest2() {

        for ( long x = 1; x < 100001; x = x * 10) {
            System.out.println(x);
            ProblemThree.buildPrimes(x);
        }
    }

}