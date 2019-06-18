/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromicNumber
{
    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args)
    {
        //System.out.println(larrgestPalindrome(3));
        // Loop to calculate upper bound
        // (largest number    of n-digit)
        int upperLimit=0;
        for (int i=1; i<=3; i++)
        {
            upperLimit  *= 10;
            upperLimit  += 9;
        }

        // largest number of n-1 digit.
        // One plus this number
        // is lower limit which is
        // product of two numbers.
        int lowerLimit = 1 + upperLimit / 10;

        int max = 0;
        for (int i = upperLimit; i>=lowerLimit; i--)
        {
            for(int j = i; j>=lowerLimit; j--)
            {
                int test = j * i;
                if (isPalindromic(test))
                {
                    if(test>max){
                        max = test;
                    }

                }
            }
        }
        System.out.println("MAX Found: " + max);
    }

    private static boolean isPalindromic(int number)
    {
        char[] original = String.valueOf(number).toCharArray();

        for (int i = 0; i < original.length; i++)
        {
            if (original[i] != original[original.length - 1 - i])
            {
                return false;
            }
        }
        return true;
    }
}

