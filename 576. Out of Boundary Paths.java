class Solution
 {
       private static final int MOD = 1000000007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove + 1];
        for (int[][] grid : dp) {
            for (int[] row : grid) {
                Arrays.fill(row, -1);
            }
        }
        return dfs(m, n, maxMove, startRow, startColumn, dp);
    }

    private int dfs(int m, int n, int maxMove, int row, int col, int[][][] dp) {
        if (row < 0 || row >= m || col < 0 || col >= n) {
            return 1;
        }
        if (maxMove == 0) {
            return 0;
        }
        if (dp[row][col][maxMove] != -1) {
            return dp[row][col][maxMove];
        }
        int paths = 0;
        paths = (paths + dfs(m, n, maxMove - 1, row + 1, col, dp)) % MOD;
        paths = (paths + dfs(m, n, maxMove - 1, row - 1, col, dp)) % MOD;
        paths = (paths + dfs(m, n, maxMove - 1, row, col + 1, dp)) % MOD;
        paths = (paths + dfs(m, n, maxMove - 1, row, col - 1, dp)) % MOD;
        dp[row][col][maxMove] = paths;
        return paths;
    }
}