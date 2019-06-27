/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class FactorsOfAPrimeNumber
{
    /**
     * TODO: Method description
     *
     * @param args
     */
    public static void main(String[] args)
    {
        long n = 28;
        for (int i = 1; i <= Math.round(Math.sqrt(n)); i++)
        {
            if (n % i == 0)
            {
                if (isPrime(i))
                {
                    System.out.printf("%d ", i);
                }

            }
        }
    }

    // checks whether an int is prime or not.
    private static boolean isPrime(int n)
    {
        for (int i = 2; 2 * i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

