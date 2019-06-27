/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * TODO: Class description
 */
public class CountAs
{
    /**
     * TODO: Method description
     *
     * @param s
     * @param n
     * @return
     */
    static long repeatedString(String s, long n)
    {
        long result = 0;

        if (s.length() == 1 && s.charAt(0) == Character.valueOf('a'))
        {
            return n;
        }
        else
        {
            result = (n / s.length()) * countAs(s);

            for (int j = 0; j < n % s.length(); j++)
            {
                result += s.charAt(j) == Character.valueOf('a') ? 1 : 0;
            }
        }

        return result;

    }

    private static long countAs(String s)
    {
        long result = 0;

        for (int j = 0; j < s.length(); j++)
        {
            if (s.charAt(j) == Character.valueOf('a'))
            {
                result++;
            }
        }
        return result;
    }

    /**
     * TODO: Method description
     *
     * @param args
     */
    public static void main(String[] args)
    {
        long result = repeatedString("aba", 10);

        System.out.println(result);
    }
}

