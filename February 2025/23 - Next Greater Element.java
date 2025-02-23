class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList();        for(int i=0; i<n; i++){
            int j=i;
            int k=i+1;
            int find = 0;
            while(k<n){
                if(arr[k]>arr[j]){
                    list.add(arr[k]);
                    find = 1;
                    break;
                }
                k++;
            }
            if(find == 0){
                list.add(-1);
            }
        }
        if(list.size()!= arr.length)list.add(-1);
        return list;
    }
}
