class Solution
{
    public int minOperations(String str1, String str2) 
    { 
        // Your code goes here
        int n=str1.length(),m=str2.length();
        int dp[][]=new int[n+1][m+1];
        
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return n+m-2*dp[0][0];

    } 
}
