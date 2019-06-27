/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * The following iterative sequence is defined for the set of positive integers:
 * <p>
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * <p>
 * Using the rule above and starting with 13, we generate the following sequence:
 * <p>
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * <p>
 * with 3
 * 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * <p>
 * Which starting number, under one million, produces the longest chain?
 */
public class LongestCollatzSequence
{
    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args)
    {
        long chainLength = 1;
        long result = 0;
        for (int i = 1; i <= 1_000_000; i++)
        {
            long lastNumber = i;
            while (lastNumber != 1)
            {
                chainLength++;

                if (lastNumber % 2 == 0)
                {
                    lastNumber = lastNumber / 2;
                }
                else
                {
                    lastNumber = 3 * lastNumber + 1;
                }
            }
            if (result < chainLength)
            {
                result = chainLength;
                System.out.println(String.format("Chain length of %s is %s", i, result));
            }

            chainLength = 1;
        }
    }
}

