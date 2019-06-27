/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * TODO: Class description
 */
public class CountingValleys
{
    // Complete the countingValleys function below.

    /**
     * TODO: Method description
     *
     * @param n
     * @param s
     * @return
     */
    static int countingValleys(int n, String s)
    {
        int level = 0;
        int valleyCount = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'D')
            {
                if (level == 0)
                {
                    valleyCount++;
                }
                level--;
            }

            if (s.charAt(i) == 'U')
            {
                level++;
            }
        }

        return valleyCount;

    }

    /**
     * TODO: Method description
     *
     * @param args
     */
    public static void main(String[] args)
    {
        int result = countingValleys(10, "UDUUUDUDDD");

        System.out.println(result);
    }
}

