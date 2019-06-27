/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * TODO: Class description
 */
public class NewYearChaos
{
    // Complete the minimumBribes function below.

    /**
     * TODO: Method description
     * @param q
     */
    static void minimumBribes(int[] q)
    {
        int bribes = 0;
        boolean tooChaotic=false;
        for (int i = 0; i < q.length - 1; i++)
        {
            if(q[i]>q[i+1])
            {
                bribes+=Math.abs(q[i]-i);
            }
            if(bribes>4)
            {
                tooChaotic=true;
            }
        }
        System.out.println(bribes);
        if(tooChaotic)
        {
            System.out.println("Too chaotic");
        }else
        {

        }
    }

    /**
     * TODO: Method description
     *
     * @param args
     */
    public static void main(String[] args)
    {
        //int[] array = { 2, 1, 5, 3, 4 };
        int[] array = { 1,2,5,3,4,7,8,6 };
        minimumBribes(array);
    }
}

