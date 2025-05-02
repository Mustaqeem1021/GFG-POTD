class Solution {
    public int findMaximum(int[] arr) {
        int ans=arr[0];
        int s=0;
        int e=arr.length-1;
        
        while(s<e){
            int mid=(s+e)>>1;
            
            if(arr[mid-1]<arr[mid]  && arr[mid+1]<arr[mid])return arr[mid];
            if(arr[mid-1]<arr[mid]){
               s=mid+1; 
            }else {
                e=mid-1;
            }
        }
        
        return arr[e];
        
    }
}
