class Solution {
    public boolean check(int[] nums) {
        int n= nums.length;
        boolean isIncreasing = true;
        
        int flag=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                flag=i;
                isIncreasing= false;
                break;
            }
        }
        if(isIncreasing){
        return true;
        }
    int x = n-flag;
    int[] rotatedArray = new int[n];
    for(int i=0;i<n;i++){
         rotatedArray[(i+x)%n]=nums[i];
    }

    for(int i=1;i<n;i++){
        if(rotatedArray[i]<rotatedArray[i-1]){
            return false;
        }
    }
    
     return true;   
    }

}