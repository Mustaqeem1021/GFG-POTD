class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int del = 0;
        while(arr.size() != 1)
        {
            int a = arr.remove(arr.size()-1);
            arr.add(0,a);
            int k = 0;
            
            if(del < arr.size())
            {
                k = arr.size() - 1 - del;
            }
            
            arr.remove(k);
            del++;
        }
        
        return arr.get(0);
    }
}

