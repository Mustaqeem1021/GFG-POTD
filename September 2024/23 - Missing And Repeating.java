class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        TreeMap<Integer,Integer>mp=new TreeMap<>();
        int a=0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer>i:mp.entrySet()){
            if(i.getValue()==2){
                b=i.getKey();
                break;
            }
        }
      int cnt=1;
        for(Map.Entry<Integer,Integer>i:mp.entrySet()){
            if(cnt!=i.getKey()){
                a=cnt;
                break;
            }
            cnt++;
        }
        if(a==0)
        a=arr.length;
        int res[]=new int[2];
        res[0]=b;
        res[1]=a;
        return res;
    }
}
