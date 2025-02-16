class Solution {
    public int[] twoSum(int[] nums, int target) {
    
    Map<Integer,Integer> map = new HashMap<>();
    int n = nums.length;
    
    
    for(int i=0;i<n;i++){
    int num=nums[i];
    int extraNeeded= target - num;
    if(map.containsKey(extraNeeded)){
        return new int[] {map.get(extraNeeded),i};
    }
    map.put(num,i);

    }
    return new int[] {-1, -1};
    }
}


// bruteforce

    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]+nums[j]==target){
    //                 return new int[] {i,j};
    //             }
    //         }
    //     }
    //   return new int[] {};

// 2 pointer approch but i got wrong 3rd test case passsed i need to correct it 