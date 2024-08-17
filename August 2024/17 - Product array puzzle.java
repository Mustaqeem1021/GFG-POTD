class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        long[] res = new long[nums.length];
        long product = 1;
        int zeroCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zeroCnt++;
            else product *= nums[i];
        }
        int k = 0;
       if (zeroCnt>1) return res;
       for (int i = 0; i < nums.length; i++) {
            if (zeroCnt == 1) {
                res[i] = (nums[i] == 0) ? product : 0;
            } else {
                res[i] = product / nums[i];
            }
        }
       return res;
    }
}

