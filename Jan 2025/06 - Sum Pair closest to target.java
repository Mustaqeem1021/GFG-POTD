class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();
        
        // If the array has less than 2 elements, return an empty list
        if (arr.length < 2) {
            return result;
        }
        
        // Sort the array
        Arrays.sort(arr);
        
        // Initialize variables
        int closestDiff = Integer.MAX_VALUE; // To track the closest difference to the target
        int maxAbsDiff = Integer.MIN_VALUE;  // To track the maximum absolute difference
        int left = 0, right = arr.length - 1;
        
        while (left < right) { // Ensure left < right to satisfy a <= b
            int sum = arr[left] + arr[right];
            int diff = Math.abs(target - sum);
            
            if (diff < closestDiff || (diff == closestDiff && (arr[right] - arr[left]) > maxAbsDiff)) {
                // Update result when a closer sum is found or when the max absolute difference is greater
                closestDiff = diff;
                maxAbsDiff = arr[right] - arr[left];
                result = Arrays.asList(arr[left], arr[right]);
            }
            
            // Move pointers based on the current sum
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return result;
    }
}