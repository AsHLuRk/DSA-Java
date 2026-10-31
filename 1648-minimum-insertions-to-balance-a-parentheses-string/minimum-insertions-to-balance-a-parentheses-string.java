class Solution {
    public int minInsertions(String s) {
        int res = 0;   // insertions made so far
        int need = 0;  // ')' still required by the '(' seen so far

        for (char c : s.toCharArray()) {
            if (c == '(') {
                need += 2;
                // need is odd: the previous '(' got only one ')' before this '(' arrived,
                // so insert a ')' to finish it
                if (need % 2 == 1) {
                    res++;
                    need--;
                }
            } else {
                need--;
                // a ')' with nothing waiting for it: insert a '(' before it.
                // That new '(' still needs one more ')'
                if (need == -1) {
                    res++;
                    need = 1;
                }
            }
        }
        return res + need; // leftover need must be filled with ')' at the end
    }
}