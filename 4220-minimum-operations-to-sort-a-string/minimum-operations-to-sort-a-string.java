class Solution {
    public int minOperations(String s) {
        int n = s.length();

        // Already sorted -> 0 operations
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;

        // Unsorted with n == 2: only length-1 substrings are allowed
        if (n == 2) return -1;

        char min = 'z', max = 'a';
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c < min) min = c;
            if (c > max) max = c;
        }

        // One operation: first char is already the min, or last char is already the max
        if (s.charAt(0) == min || s.charAt(n - 1) == max) return 1;

        // Two operations: min occurs before the last index, or max occurs after index 0
        if (s.indexOf(min) < n - 1 || s.lastIndexOf(max) > 0) return 2;

        // min only at the end and max only at the start (e.g. "cba")
        return 3;
    }
}