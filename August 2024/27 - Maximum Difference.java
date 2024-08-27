class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n=arr.length,ans=0,ls[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
            ls[i]=st.isEmpty()?0:st.peek();
            st.push(arr[i]);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
            int rs=st.isEmpty()?0:st.peek();
            ans=Math.max(ans,Math.abs(ls[i]-rs));
            st.push(arr[i]);
        }
        return ans;
    }
}
