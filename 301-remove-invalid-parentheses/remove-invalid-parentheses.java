class Solution {
    private Set<String> res = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {
        // Minimum removals needed: unmatched '(' and unmatched ')'
        int remL = 0, remR = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                remL++;
            } else if (c == ')') {
                if (remL > 0) remL--;
                else remR++;
            }
        }
        dfs(s, 0, 0, remL, remR, new StringBuilder());
        return new ArrayList<>(res);
    }

    private void dfs(String s, int i, int open, int remL, int remR, StringBuilder sb) {
        if (i == s.length()) {
            if (open == 0 && remL == 0 && remR == 0) res.add(sb.toString());
            return;
        }

        char c = s.charAt(i);
        int len = sb.length();

        if (c == '(') {
            if (remL > 0) dfs(s, i + 1, open, remL - 1, remR, sb); // remove it
            sb.append(c);
            dfs(s, i + 1, open + 1, remL, remR, sb);               // keep it
        } else if (c == ')') {
            if (remR > 0) dfs(s, i + 1, open, remL, remR - 1, sb); // remove it
            if (open > 0) {                                        // keep only if it has a match
                sb.append(c);
                dfs(s, i + 1, open - 1, remL, remR, sb);
            }
        } else {
            sb.append(c);
            dfs(s, i + 1, open, remL, remR, sb);
        }

        sb.setLength(len); // backtrack
    }
}