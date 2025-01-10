class Solution {
    static int  find_distinct(int st,int end,int[] ar){
        HashSet<Integer> set=new HashSet<>();
        for(int i=st;i<end;i++) set.add(ar[i]);
        return set.size();
    }
    ArrayList<Integer> countDistinct(int arr[], int k) {
          ArrayList<Integer> al=new  ArrayList<Integer>();
        for(int i=0;i<=arr.length-k;i++){
            al.add(find_distinct(i,i+k,arr));
        }
        return al;
    }
}
