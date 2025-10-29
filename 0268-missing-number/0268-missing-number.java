public class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        // XOR all indices 0..n and all values in array
        for (int i = 0; i < n; i++) {
            xor ^= i;        // xor with index
            xor ^= nums[i];  // xor with value
        }
        xor ^= n; // include n because indices run 0..n
        return xor;
    }

    // quick test
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.missingNumber(new int[]{3,0,1})); // prints 2
        System.out.println(s.missingNumber(new int[]{0,1}));   // prints 2
        System.out.println(s.missingNumber(new int[]{9,6,4,2,3,5,7,0,1})); // prints 8
    }
}
