class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int count=0; int max=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            count++;
            max = Math.max(max, count);
            //max=count why iam getting error iam just trying update max;
        }
        else{
            count=0;
        }
      } 
    return max;
    }
}