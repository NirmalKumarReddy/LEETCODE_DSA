class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=r){
          int mid=l+(r-l)/2;
          if(nums[l]<=nums[mid]){
             ans=Math.min(nums[l],ans);
             l=mid+1;
          }
          else{
            ans=Math.min(ans,nums[mid]);
            r=mid-1;
          }
        }
       return ans;
    }
}

        //   int mid=l+(r-l)/2;
        //     if(nums[mid]<=nums[l]){
        //         ans=min(nums[i],ans)
        //         r=mid-1; 
        //         if(nums[r]<temp){
        //             temp=nums[r];
        //         }                            
        //     }
        //     else{
        //         l=mid+1;
        //     }