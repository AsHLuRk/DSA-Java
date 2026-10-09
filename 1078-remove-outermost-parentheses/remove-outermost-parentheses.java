class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int counter = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (counter > 0) {
                    result.append(c);   // not the outer '('
                }
                counter++;
            } else {
                counter--;
                if (counter > 0) {
                    result.append(c);   // not the outer ')'
                }
            }
        }
        return result.toString();
    }
}