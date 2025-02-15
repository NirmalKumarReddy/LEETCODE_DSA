class Solution {
    public int missingNumber(int[] nums) {
       int range = nums.length;
       int AS; int CS=0; int n;
       AS = (range * (range+1))/2;

       for(int i=0;i<range;i++){
         CS+=nums[i];
       }
        n=AS-CS;
        return n;
    }
    
}