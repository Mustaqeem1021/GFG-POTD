class Solution {
    ArrayList<String> ans;
    public ArrayList<String> findPath(int[][] mat) {
        int n=mat.length;
        ans = new ArrayList<>();
        solve(0,0,n,mat,"");
        return ans;
    }
    void solve(int i,int j,int n,int a[][],String s){
        if(i<0 || j<0 || i>=n || j>=n || a[i][j]==0)    return;
        
        if(i==n-1 && j==n-1){
            ans.add(new String(s));
            return;
        }
        
        a[i][j]=0;
        
        solve(i-1,j,n,a,s+"U");
        solve(i+1,j,n,a,s+"D");
        solve(i,j-1,n,a,s+"L");
        solve(i,j+1,n,a,s+"R");
        
        a[i][j]=1;
    }
}
