class Solution {
    public int majorityElement(int[] nums) {

    //moore's voting algorithm.
     int n=nums.length;
     int vote=1;
     int majority=nums[0];
     for(int i=1;i<n;i++){
        if(vote == 0){
           vote++;
           majority = nums[i];
        }
        else if(majority == nums[i]){
            vote++;
        }
        else{
            vote--;

        }     
     }
    return majority;
    }
}

// BRUTEFORCE

    //     int count=0; int n=nums.length;
    //    for(int i=0;i<n;i++){
    //      for(int j=0;j<n;j++){
    //        if(nums[i]==nums[j]){
    //         count++;
    //        }  
    //      }
    //      if(count > (n/2)){
    //         return nums[i];
    //      }
    //    } 
    //    return -1;

//HASHMAP
    //     HashMap<Integer, Integer> map = new HashMap<>();

    //    for (int num : nums) {
    //         map.put(num, map.getOrDefault(num, 0) + 1); // Increment count
            
    //         if (map.get(num) > n / 2) { // If majority found, return immediately
    //             return num;
    //         }
    //     }
        
    //     return -1;
