/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * TODO: Class description
 */
public class JumpingOnClouds
{
    // Complete the countingValleys function below.

    /**
     * TODO: Method description
     *
     * @param c
     * @return
     */
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c)
    {
        int jump = 0;
        int i = 0;
        while (i < c.length - 1)
        {
            jump++;

            if (i + 2 <= c.length - 1 && c[i + 2] == 0)
            {
                i += 2;
            }
            else
            {
                i++;
            }
        }
        return jump;
    }

    /**
     * TODO: Method description
     *
     * @param args
     */
    public static void main(String[] args)
    {
        int[] clouds = new int[]
            {
                0, 0, 0, 0, 1, 0
            };

        int result = jumpingOnClouds(clouds);

        System.out.println(result);
    }
}

