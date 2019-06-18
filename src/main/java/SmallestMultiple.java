/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple
{
    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args)
    {
        int[] multiples = new int[]{20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};

        long minNumber = 10_000_000_000L;

        for(long n = 1; n<10_000_000_000L; n++)
        {
            for (int i = 0; i < multiples.length; i++)
            {
                if (n % multiples[i] == 0)
                {
                    if(i==multiples.length-1)
                    {
                        minNumber = minNumber>n ? n : minNumber;

                    }
                }else
                {
                    break;
                }
            }
        }

        System.out.print("Found :" + minNumber);

    }
}

