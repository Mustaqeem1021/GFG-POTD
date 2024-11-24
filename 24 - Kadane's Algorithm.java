class Solution {

    int maxSubarraySum(int[] arr) {
        int start= 0, max= arr[0];
        for(int i=0 ; i<arr.length; i++){
            if(start+arr[i]>0){
                start+= arr[i];
                max = Math.max(max, start);
            }else{
                if(arr[i]>max) max = arr[i];
                start=0;
            }
            
        }
        
        return max;
    }
}
