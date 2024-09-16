class Solution{
    static int maxLength(String s){
        // code here
        Stack<Character> stack = new Stack<>();
        int[] dp = new int[s.length()];
        int max = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(')
                stack.push('(');
            else{
                if(stack.isEmpty())continue;
                int len = 2;
                if(i>=2)
                    len += dp[i-1];
                if(i-len>=0)
                    len += dp[i-len];
                dp[i] = len;
                max = Math.max(max,dp[i]);
                stack.pop();
            }
        }
        return max;
    }
}
