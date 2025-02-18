class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


//optimized approch is Dutch National Flag Algorithm (Three Pointer Approach)

// bruteforce
//     int n=nums.length;
//         int temp;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-1-i;j++){
//                if(nums[j]>nums[j+1]){
//                 temp=nums[j];
//                 nums[j]=nums[j+1];
//                 nums[j+1]=temp;

//                }
//             }
//         }


// Counting Sort (or Frequency Count) Approach.

//     int n=nums.length;
//     int count1=0,count2=0,count3=0;
//     for(int i=0;i<n;i++){
//         if(nums[i]==0){ count1++;}
//         else if(nums[i]==1){count2++;}
//         else{count3++;}  
//     }
//     for(int i=0;i<count1;i++){
//    nums[i]=0;
//     }
//     for(int i=count1;i<count1+count2;i++){
//     nums[i]=1;
//     }
//     for(int i=count1+count2;i<count1+count2+count3;i++){
//      nums[i]=2;
//     }

    
