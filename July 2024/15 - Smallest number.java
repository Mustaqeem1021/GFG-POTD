class Solution {
   public String smallestNumber(int s, int d) {
        if (s > 9 * d) {
            return "-1";
        }

        int[] digits = new int[d];
        s--;  // Reserve 1 for the most significant digit to ensure we form a valid number

        for (int i = d - 1; i > 0; i--) {
            if (s > 9) {
                digits[i] = 9;
                s -= 9;
            } else {
                digits[i] = s;
                s = 0;
            }
        }

        digits[0] = s + 1;  // Add back the reserved 1 to the most significant digit

        StringBuilder result = new StringBuilder();
        for (int digit : digits) {
            result.append(digit);
        }

        return result.toString();
    }
}
