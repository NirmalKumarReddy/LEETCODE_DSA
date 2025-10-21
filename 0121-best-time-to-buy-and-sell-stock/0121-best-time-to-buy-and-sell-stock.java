class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            profit=prices[i]-min;
            maxProfit=Math.max(maxProfit,profit);
            if(min>prices[i]){
                min=prices[i];
            }
            
        }
        return maxProfit;
    }
}