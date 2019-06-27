/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p>
 * What is the 10 001st prime number?
 */
public class L10001stPrime
{
    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args)
    {
        int count = 10_001;
        int number = 0;
        int found = 0;
        while (count != 0)
        {
            if (isPrime(++number))
            {
                found = number;
                count--;
            }
        }
        System.out.println("Found: " + found);
    }

    // checks whether an int is prime or not.
    private static boolean isPrime(int n)
    {
        // check if n is a multiple of 2
        if (n % 2 == 0)
        {
            return false;
        }
        // if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;

    }
}

