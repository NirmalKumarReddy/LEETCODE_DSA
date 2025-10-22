class Solution {
    public List<Integer> majorityElement(int[] nums) {
           int count1=0;
            int element1=0;
            int count2=0;
            int element2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i] != element2){
                element1=nums[i];
                count1++;
            }
            else if(count2==0 && nums[i] != element1){
                element2=nums[i];
                count2++;
            }
            else if(nums[i]== element1){
                count1++;
            }
            else if(nums[i]==element2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
     List<Integer> res = new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element1){
                count1++;
            }
            else if(nums[i]==element2){
                count2++;
            }      
        }
         int min=nums.length/3;
            if(count1>min){
                res.add(element1);
            }
            if(count2>min){
                res.add(element2);
            }
        return res;
    }
}