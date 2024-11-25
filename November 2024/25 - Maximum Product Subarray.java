class Solution {
    int maxProduct(int[] arr) {
        int max=Integer.MIN_VALUE;
        int pStart=1;
        int pEnd=1;
        for(int i=0; i<arr.length; i++){
            pStart*=arr[i];
            pEnd*=arr[arr.length-1-i];
            max=Math.max(max,Math.max(pStart,pEnd));
            if(pEnd==0) pEnd=1;
            if(pStart==0) pStart=1;
        }
        
        return max;
    }
}
