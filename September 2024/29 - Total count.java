class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            
            int element = arr[i];
            int count = 0;
            
            while(element > k){
                element = element-k;
                count++;
            }
            
            sum = sum+count+1;
        }
        
        return sum;
    }
}

