package org.deschaefer.euler.solutions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Largest prime factor
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
final class ProblemThree {

    /**
     * private constructor
     */
    private ProblemThree() {
    }

    /**
     * @param args command line params
     */
    public static void main(final String[] args) {
        System.out.println("\n"+solve());
    }

    /**
     * solve the problem
     *
     * @return the answer
     */
    private static String solve() {

//        Long target = 600851475143L;
        Long target = 123100L;

        buildPrimes(target);

        if ( isPrime(target)) {
            return target.toString();
        }

        Long half = target / 2;

        Long biggest = 0L;

        List<Long> factors = new ArrayList<>();

        for ( Long outer : quickPrimes ) {
            for ( long inner = 2; inner < half; inner ++) {
                if (inner % 1000 == 0)
                {
                    System.out.print("[" + outer+","+inner+"]");
                }
                long multiple = outer * inner;
                int comp = target.compareTo(multiple);

                if ( comp == 0 ) {
                    System.out.println("\n" +inner + " - " + outer);
                    if ( isPrime(inner) && inner > biggest)
                    {
                        biggest = inner;
                    }
                    if ( isPrime(outer) && outer > biggest)
                    {
                        biggest = outer;
                    }
                } else if ( comp == -1 )
                {
                    break;
                }
            }
        }

        return biggest.toString();
    }

    static List<Long> quickPrimes = new ArrayList<>();


    static List<Long> buildPrimes(Long max) {

        long startTime = new Date().getTime();

        System.out.println("Build Primes Start : "+startTime);

        for (long x = 2;x<max;x++)
        {
            isPrime(x);
        }

        long sttopTime = new Date().getTime();
        System.out.println("Build Primes Finish : "+new Date().getTime()+ " : "+ (sttopTime - startTime));

        return quickPrimes;
    }

    static boolean isPrime(Long testMe) {

        if (quickPrimes.contains(testMe))
        {
            return true;
        }

        for ( Long prime : quickPrimes) {
            if ( testMe % prime == 0) {
                return false;
            }
        }

        Long half = testMe / 2;

        for ( long outer = 2; outer <= half; outer ++) {
            for ( long inner = outer; inner <= half; inner ++) {

//                if (inner % 1000 == 0)
//                {
//                    System.out.print("[ pr " + outer+","+inner+"]");
//                }

                long multiple = outer * inner;
                if ( testMe.equals(multiple) ) {
                    return false;
                }

                if (testMe < multiple)
                    break;
            }
        }

        quickPrimes.add(testMe);
//        System.out.println("new prime : "+testMe);

        return true;
    }
}
