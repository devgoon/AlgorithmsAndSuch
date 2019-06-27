/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class SpecialPythagoreanTriplet
{
    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args)
    {

        for (int a = 1; a <= 1000; a++)
        {
            for (int b = 1; b <= 1000; b++)
            {
                for (int c = 1; c <= 1000; c++)
                {
                    if (pythagoreanTriplet(a, b, c) && (a + b + c) == 1000)
                    {
                        int product = a * b * c;
                        System.out.println("Product " + product);
                    }
                }
            }
        }

    }

    private static boolean pythagoreanTriplet(int a, int b, int c)
    {
        int aplusb = (a * a) + (b * b);
        int see = c * c;
        // System.out.println(String.format("A=%s B=%s C=%s", a,b,c));
        return aplusb == see;
    }
}

