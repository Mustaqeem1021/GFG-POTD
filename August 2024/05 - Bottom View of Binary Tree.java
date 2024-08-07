class Solution
{
    int maxLeft;
    int maxRight;
    public ArrayList <Integer> bottomView(Node root)
    {
        if(root==null)
            return new ArrayList<Integer>();
        maxLeft=0;
        maxRight=0;
        HashMap<Integer,int[]> map=new HashMap<>();
        solve(root,0,0,map);
        ArrayList<Integer> ans=new ArrayList<>();
        while(maxLeft<=maxRight)
            ans.add(map.get(maxLeft++)[1]);
        return ans;
    }
    void solve(Node root,int pos,int height,HashMap<Integer,int[]> map){
        if(root==null)
            return;
        maxLeft=Math.min(maxLeft,pos);
        maxRight=Math.max(maxRight,pos);
        if(map.get(pos)==null || map.get(pos)[0]<=height)
        map.put(pos,new int[]{height,root.data});
        solve(root.left,pos-1,height+1,map);
        solve(root.right,pos+1,height+1,map);
    }
}

