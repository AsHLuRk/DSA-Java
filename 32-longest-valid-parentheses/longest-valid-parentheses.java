class Solution {
    int[] memo;

    public int longestValidParentheses(String s) {
        int n = s.length();
        memo = new int[n];
        Arrays.fill(memo, -1);
        int best = 0;
        for (int i = 0; i < n; i++) {
            best = Math.max(best, ans(s, i));
        }
        return best;
    }

    // longest valid substring ending exactly at index i
    int ans(String s, int i) {
        if (i < 0) return 0;
        if (memo[i] != -1) return memo[i];

        int res = 0;
        if (s.charAt(i) == ')' && i > 0) {
            if (s.charAt(i - 1) == '(') {
                // "...()" : pair up the last two, add whatever ends before them
                res = 2 + ans(s, i - 2);
            } else {
                // "...))" : skip over the valid block ending at i-1 and look at what's before it
                int j = i - ans(s, i - 1) - 1;
                if (j >= 0 && s.charAt(j) == '(') {
                    res = ans(s, i - 1) + 2 + ans(s, j - 1);
                }
            }
        }
        return memo[i] = res;
    }
}