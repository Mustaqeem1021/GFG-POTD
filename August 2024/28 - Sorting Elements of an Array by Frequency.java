class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        
        for(int num:arr)
        {
            list.add(num);
        }
        
        Collections.sort(list,(a,b)->{
            int cmp=freq.get(b).compareTo(freq.get(a));
            if(cmp==0)
            {
                return a.compareTo(b);
            }
            else{
                return cmp;
            }
        });
        
        return list;
        
    }
}

