class Solution {
    public int subarraySum(int[] nums, int k) {
        int n= nums.length; 
        int count =0, prefix=0;
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
       // Map mpp = new HashMap();
        for(int i=0;i<n;i++){
            prefix += nums[i];
            int diff= prefix-k;
            count += map.getOrDefault(diff, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
    return count;
    }
}

//bruteforce
        //    for(int i=0;i<n;i++){ 
        //     int sum=0;    
        //     for(int j=i;j<n;j++){
        //         sum=sum+nums[j];
        //       if(sum==k){
        //        count++;
        //       }
        //     }
         