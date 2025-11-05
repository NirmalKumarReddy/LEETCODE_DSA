class Solution {
    public String largestOddNumber(String num) {
        // Scan from the end to find the rightmost odd digit
        for (int i = num.length() - 1; i >= 0; i--) {
            int d = num.charAt(i) - '0';
            if ((d & 1) == 1) {           // odd?
                return num.substring(0, i + 1);
            }
        }
        return ""; // no odd digit
    }
}
