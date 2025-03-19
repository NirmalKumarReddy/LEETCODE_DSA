class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> window = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            // If we encounter a duplicate character, shrink the window from the left
            while (window.contains(s.charAt(right))) {
                window.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character to the window
            window.add(s.charAt(right));
            
            // Update the maximum length of the substring
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength; 
    }
}