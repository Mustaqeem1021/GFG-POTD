class Solution {
    public int findMin(int[] arr) 
    {
        // complete the function here
        int low = 0;
        int high = arr.length - 1;
        
        while(low < high) {
            int mid = (low + high) / 2;
            
            if(arr[mid] < arr[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return arr[low];
    }
}

