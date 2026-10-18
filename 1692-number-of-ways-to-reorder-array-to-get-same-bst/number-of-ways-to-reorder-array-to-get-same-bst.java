class Solution {
    public int numOfWays(int[] nums) {
        final long MOD = 1_000_000_007L;
        int n = nums.length;

        long[][] C = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD;
            }
        }

        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (int x : nums) list.add(x);

        return (int) ((count(list, C, MOD) - 1 + MOD) % MOD);
    }

    private long count(java.util.List<Integer> list, long[][] C, long MOD) {
        int size = list.size();
        if (size <= 2) return 1;

        int root = list.get(0);
        java.util.List<Integer> left = new java.util.ArrayList<>();
        java.util.List<Integer> right = new java.util.ArrayList<>();
        for (int i = 1; i < size; i++) {
            int v = list.get(i);
            if (v < root) left.add(v);
            else right.add(v);
        }

        long ways = C[size - 1][left.size()];
        ways = ways * count(left, C, MOD) % MOD;
        ways = ways * count(right, C, MOD) % MOD;
        return ways;
    }
}