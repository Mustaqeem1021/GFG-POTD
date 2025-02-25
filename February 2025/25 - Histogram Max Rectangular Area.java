class Pair{
    int index;
    int height;
    public Pair(int index,int height)
    {
        this.index=index;
        this.height=height;
    }
    
}
class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        int max=0;
        int currMax=0;
        Stack<Pair>s=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            Pair temp=new Pair(i,arr[i]);
            while(!s.isEmpty()&&s.peek().height>temp.height)
            {
                temp.index=s.peek().index;
                max=Math.max(max,(i-s.peek().index)*(s.peek().height));
                s.pop();
                
               
            }
            s.add(temp);
        }
        while(!s.isEmpty())
        {
            max=Math.max(max,(arr.length-s.peek().index)*s.peek().height);
            s.pop();
        }
        return max;
    }
}
