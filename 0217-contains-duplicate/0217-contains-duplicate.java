class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> map= new HashSet<>();
      for(int num : nums){
        if(map.contains(num)){
            return true;
        }
        else{
          map.add(num);
        }

      }
      return false;
    }
}

//bruteforce
        //  int n= nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
            
        // }
        // return false;