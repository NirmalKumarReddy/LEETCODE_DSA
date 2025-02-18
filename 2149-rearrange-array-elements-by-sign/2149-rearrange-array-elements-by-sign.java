class Solution {
    public int[] rearrangeArray(int[] nums) {

     int n=nums.length;
     int[] ans = new int[n];

     int pos=0,neg=1;
    //  for (int i = 0; i < nums.length; i++) {
    // int num = nums[i]; // Get each element
    // Use num inside the loop
    //this isfor-each lop}
     for(int num : nums){ 
        if(num>0){ 
          ans[pos]=num;
          pos+=2;
        }
        else{
           ans[neg]=num;
           neg+=2;
        }
    }
    return ans;
}
}

//***Bruteforce*****
    //    ArrayList<Integer> pos = new ArrayList<>();
    //    ArrayList<Integer> neg = new ArrayList<>();
    //    int n = nums.length;
    //    for(int i=0;i<n;i++) {
    //     if(nums[i]>0){
    //         pos.add(nums[i]);        
    //     }
    //     else{
    //        neg.add(nums[i]);
    //     }   
    //    } 
    //    for(int i=0;i<n/2;i++){
    //      nums[2*i]=pos.get(i);
    //      nums[2*i+1]=neg.get(i);
    //     }
    //     return nums;