class Solution {
    public static int maxProfit(int[] prices) {
        // code here
          int k = 2;
        int n = prices.length;
        int [][][] dp = new int[n][2][k + 1];
        for(int i = 0; i < n; i++) 
            for(int j = 0; j < 2; j++) 
                for(int l = 0; l <= k; l++) 
                    dp[i][j][l] = -1;
        return f(0, 1, prices, k, dp);
        
    }
    static int f(int idx, int buy, int prices[], int k, int dp[][][]) {
        if(k < 0) 
            return 0;
        if(idx == prices.length) 
            return 0;
        if(dp[idx][buy][k] != -1) 
            return dp[idx][buy][k];
        int profit = 0;
        if(buy == 1){
            int pick = f(idx + 1, 0, prices, k - 1, dp) - prices[idx];
            int skip = f(idx + 1, 1, prices, k, dp);
            profit = Math.max(pick, skip);
        }
        else{
            int sell = f(idx + 1, 1, prices, k, dp) + prices[idx];
            int skip = f(idx + 1, 0, prices, k, dp);
            profit  = Math.max(sell, skip);
        }
        return dp[idx][buy][k] = profit;
    }
}
