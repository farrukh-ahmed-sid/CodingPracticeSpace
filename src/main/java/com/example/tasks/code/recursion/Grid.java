package com.example.tasks.code.recursion;

public class Grid {

    // i, j = 0,0 index start position
    // m, n size of grid
    // 2^m+n complexity
    public int countPathsInGrid(int i, int j, int m, int n) {

        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        int down = countPathsInGrid(i + 1, j, m, n);
        int right = countPathsInGrid(i, j + 1, m, n);

        return down + right;
    }

    // memoization
    // m*n complexity
    public int countPathsInGridMemo(int i, int j, int m, int n, int[][] memo) {

        if (memo == null) {
            memo = new int[m][n];

            for (int x = 0; x < m; x++) {
                for (int y = 0; y < n; y++) {
                    memo[x][y] = -1;
                }
            }
        }

        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        memo[i][j] = countPathsInGridMemo(i + 1, j, m, n, memo) + countPathsInGridMemo(i, j + 1, m, n, memo);

        return memo[i][j];
    }

    public int countPathsInGridIterative(int m, int n) {

        int[][] grid = new int[m][n];

        //base case: single way to reach this grid block
        grid[0][0] = 1;

        // Fill the table
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {

                if (row == 0 && col == 0) {
                    continue;  // Skip the cell since it's already set to 1
                }

                // get prev row and col value
                int up = (row > 0) ? grid[row - 1][col] : 0;
                int left = (col > 0) ? grid[row][col - 1] : 0;

                // adding them to get count of path on this grid block
                grid[row][col] = up + left;
            }
        }

        return grid[m-1][n-1];
    }
}
