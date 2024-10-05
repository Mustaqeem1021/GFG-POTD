class Solution {
    public long findSmallest(int[] arr) {
        int n = arr.length;
        long unreachableNumber = 1;
        
        for(int i = 0; i < n; i++) {
            
            if(arr[i] > unreachableNumber) return unreachableNumber;
            
            unreachableNumber += arr[i];
            
        }
        
        return unreachableNumber;
        
    }
}
