class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList<Integer> co = new ArrayList<>(); 
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            if(arr[i]==arr[i+1] && arr[i]!=0){
                co.add(arr[i]+arr[i+1]);
                i++;
            }
            else if(arr[i]>0) co.add(arr[i]);
        }
        if(arr[n-1]!=arr[n-2]) co.add(arr[n-1]);
        int cosize = co.size();
        int count = n-cosize;
        if(count == 0) return co;
        else{
            for(int i=0;i<count;i++){
                co.add(0);
            }
        }
        return co;
    }
}
