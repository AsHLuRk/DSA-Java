class Solution {
    public int uniquePaths(int[][] grid) {
        final int MOD = 1_000_000_007;
        int m = grid.length, n = grid[0].length;

        // dp[i][j][0]: arrived moving right, dp[i][j][1]: arrived moving down
        long[][][] dp = new long[m][n][2];
        dp[0][0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                long r = dp[i][j][0];
                long d = dp[i][j][1];
                if (r == 0 && d == 0) continue;

                if (grid[i][j] == 0) {
                    long t = (r + d) % MOD;
                    if (j + 1 < n) dp[i][j + 1][0] = (dp[i][j + 1][0] + t) % MOD; // go right
                    if (i + 1 < m) dp[i + 1][j][1] = (dp[i + 1][j][1] + t) % MOD; // go down
                } else {
                    // mirror: moving right -> turn down, moving down -> turn right
                    if (i + 1 < m) dp[i + 1][j][1] = (dp[i + 1][j][1] + r) % MOD;
                    if (j + 1 < n) dp[i][j + 1][0] = (dp[i][j + 1][0] + d) % MOD;
                }
            }
        }

        // If the destination is a mirror, any arrival is deflected out of the grid
        if (grid[m - 1][n - 1] == 1) return 0;
        return (int) ((dp[m - 1][n - 1][0] + dp[m - 1][n - 1][1]) % MOD);
    }
}