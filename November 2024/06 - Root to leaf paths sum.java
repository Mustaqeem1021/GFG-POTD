class Solution {
    public static int res=0;
    public static void Cal(Node root,int ans){
        if(root==null) return;
        if(root.left==null && root.right==null) {
            res+=(ans*10+root.data);
            return;
        }
        Cal(root.left,ans*10+root.data);
        Cal(root.right,ans*10+root.data);
    }    
    public static int treePathsSum(Node root) {
        res=0;
      Cal(root,0);
      return res;
    }
}
