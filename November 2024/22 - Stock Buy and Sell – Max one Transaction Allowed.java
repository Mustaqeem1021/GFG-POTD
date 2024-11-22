class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int maxProfit = 0;
        int bp = prices[0];
        
        for(int i = 1; i < prices.length; i++){
            if(bp >= prices[i]){
                bp = prices[i];
            }
            else{
                maxProfit = Math.max(maxProfit,prices[i]-bp);
            }
        }
        
        return maxProfit;
    }
}

