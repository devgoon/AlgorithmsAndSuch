/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * The sum of the squares of the first ten natural numbers is,
 * <p>
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * <p>
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference
{
    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args)
    {
        int numbers = 100;
        int squaredSum = 0;
        int sum = 0;

        for (long n = 1; n <= numbers; n++)
        {
            sum += n;
            squaredSum += n * n;
        }

        System.out.print("Answer :" + ((sum * sum) - squaredSum));
    }
}

