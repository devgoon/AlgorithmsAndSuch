/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * TODO: Class description
 */
public class HourGlass
{
    // / Complete the hourglassSum function below.

    /**
     * TODO: Method description
     * @param arr
     * @return
     */
    static int hourglassSum(int[][] arr)
    {
        int result = Integer.MIN_VALUE;
        for (int x = 0; x < arr[0].length - 2; x++)
        {
            for (int y = 0; y < arr[1].length - 2; y++)
            {
                int sum = arr[x][y] + arr[x][y + 1] + arr[x][y + 2] + arr[x + 1][y + 1] + arr[x + 2][y] + arr[x + 2][y + 1] + arr[x + 2][y + 2];

                if (sum > result)
                {
                    result = sum;
                }

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
        //String stringArray2 = "-1 -1 0 -9 -2 -2\n" + "-2 -1 -6 -8 -2 -5\n" + "-1 -1 -1 -2 -3 -4\n" + "-1 -9 -2 -4 -4 -5\n" + "-7 -3 -3 -2 -9 -9\n" + "-1 -3 -1 -2 -4 -5";
        String stringArray = "1 1 1 0 0 0\n" + "0 1 0 0 0 0\n" + "1 1 1 0 0 0\n" + "0 0 2 4 4 0\n" + "0 0 0 2 0 0\n" + "0 0 1 2 4 0";

        int[][] array = new int[6][6];
        for (int i = 0; i < 6; i++)
        {
            String[] temp = stringArray.split(System.lineSeparator());
            String[] arrRowItems = temp[i].split(" ");
            for (int j = 0; j < 6; j++)
            {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                array[i][j] = arrItem;
            }
        }

        long result = hourglassSum(array);
        System.out.println(result);
    }
}

