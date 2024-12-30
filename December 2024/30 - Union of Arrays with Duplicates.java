class Solution {
    public static int findUnion(int a[], int b[]) {
        int sizea = a.length;
        int sizeb = b.length;
        HashMap<Integer,Integer> map = new HashMap<>(sizea+sizeb);
        for (int i = 0; i < sizea; i++) {
            map.put(a[i], 0);  
        }
        for(int i = 0 ;i<sizeb;i++){
            map.put(b[i],0);
        }
        return map.size();
    }
}

