class Solution {
    public int maxDepth(String s) {
        int depth = 0, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                depth++;
                if (depth > ans) ans = depth;
            } else if (c == ')') {
                depth--;
            }
            // all other characters are ignored
        }
        return ans;
    }
}
