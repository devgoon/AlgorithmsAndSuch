/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
 *
 * How many such routes are there through a 20×20 grid?
 */
public class LatticePaths
{
    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args)
    {
        int gridSize = 2;
        long[][] grid = new long[gridSize+1][gridSize+1];
        grid[0][0] = 0;

        for (int i = 1; i <=gridSize; i++)
        {
            grid[i][0] = 1;
            grid[0][i] = 1;
        }

        for (int i = 1; i <= gridSize; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                grid[i][j] = grid[j][i] = grid[j - 1][i] + grid[j][i - 1];
            }
        }

        System.out.println(grid[gridSize-1][gridSize-1]);
    }
}

