class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int l=1;
      int n=arr.length;
      int r=n-2;
      if(n==1){
        return arr[0];
      }
      while(l<=r){
      int mid=l+(r-l)/2;
      if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
        return mid;
      }
      if(arr[mid]<arr[mid-1]){
        r=mid-1;
      }
      else{
        l=mid+1;
      }
      } 
      return -1; 
    }
}