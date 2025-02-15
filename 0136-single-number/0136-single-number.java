class Solution {
    public int singleNumber(int[] nums) {
        int x = nums[0];
        for(int i=1;i<nums.length;i++){
            x = x ^ nums[i];

        }
        return  x;
    }
}


//  int x;
//  for(int i=0;i<nums.length;i++){
//             x = nums[i] ^ nums[i+1];

//         }
//         return  x;
//     } why giving error