class Solution {
    public long findMaxProduct(List<Integer> arr) {
        // code here
         long pro = 1;
        long min = Integer.MAX_VALUE;
        boolean hasZero = false; 
        boolean hasPositive = false; 
        if(arr.size()==1){
            return arr.get(0);
        }
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if(num==0){
                hasZero = true;
                continue;
            }
            else if (num < 0) {
                if (Math.abs(num) < Math.abs(min)) {
                    min = num;
                }
                pro*=num;
                pro%=1000000007;
            }
            else{
                hasPositive = true;
                pro*=num;
                pro%=1000000007;
            }
            
        }
        if(arr.size()==2){
            if(hasPositive==false && hasZero==true){
                return 0;
            }
        }
        if (pro < 0 ) {
            pro /= min;
        }
        
        return pro%1000000007;
    }
}
