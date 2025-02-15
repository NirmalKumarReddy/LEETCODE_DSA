class Solution {
    public int maxSubArray(int[] nums) {
    //given me worng answer only second test case passed
    int sum=0;
    int maxi = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
      sum+=nums[i];
      maxi = Math.max(sum,maxi);
      if(sum<0){
        sum=0;
      }
    }
    return maxi;
    }
}


    // int n = nums.length;
    //  int maxi = Integer.MIN_VALUE;
    //  int sum = 0;
    //  for(int i=0;i<n;i++){
    //     for(int j=i;j<n;j++){
    //       sum+= nums[j];
    //       maxi=Math.max(sum, maxi);    
    //     }
    //     sum = 0;
    //  }
    //  return maxi;