class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(piles,h,mid)){
             r=mid-1;
            }
            else{
             l=mid+1;
            }
        }
        return l;

    }
   public static  boolean ispossible(int[] piles,int h, int k){
         for(int i=0;i<piles.length;i++){
           int value=piles[i];
           int temp=value/k;
           if(value % k != 0){
            temp++;
           }
           h=h-temp;
           if(h<0){
            return false;
           }            
         }
         return true;
    }
}