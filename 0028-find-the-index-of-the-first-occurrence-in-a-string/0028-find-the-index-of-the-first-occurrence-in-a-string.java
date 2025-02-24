class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();
        if (n == 0) return 0;

        // Compute LPS (Longest Prefix Suffix) array
        int[] lps = computeLPS(needle); // FIXED: Store the returned LPS array

        int i = 0, j = 0; // i -> haystack, j -> needle
        while (i < m) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++; j++;
                if (j == n) return i - n; // Found needle in haystack
            } else if (j > 0) {
                j = lps[j - 1]; // Use LPS to avoid redundant comparisons
            } else {
                i++;
            }
        }
        return -1; // No match found
    }

    private int[] computeLPS(String needle) { // FIXED: Changed return type to int[]
        int n = needle.length();
        int[] lps = new int[n];
        int len = 0, i = 1;

        while (i < n) {
            if (needle.charAt(i) == needle.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        return lps;
    }
}
