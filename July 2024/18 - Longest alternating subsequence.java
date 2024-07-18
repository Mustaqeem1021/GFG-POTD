class Solution {
    public int alternatingMaxLength(int[] arr) {
        int inc = 1;
        int dec = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                inc = dec + 1;
            }
            if (arr[i] < arr[i - 1]) {
                dec = inc + 1;
            }
        }
        
        return Math.max(inc, dec);
    }
}
