class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)!=-1&&arr.get(i)!=i)
            {
                int temp=arr.get(arr.get(i));
                arr.set(arr.get(i),arr.get(i));
                arr.set(i,temp);
            }
        }
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)!=-1&&arr.get(i)!=i)
            {
                int temp=arr.get(arr.get(i));
                arr.set(arr.get(i),arr.get(i));
                arr.set(i,temp);
            }
        }
        return arr;
    }
}
