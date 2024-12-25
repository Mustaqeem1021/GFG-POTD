class Solution {
    public static void setMatrixZeroes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Determine which rows and columns need to be zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    if (i == 0) firstRowZero = true;
                    if (j == 0) firstColZero = true;
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }

        // Step 2: Use the markers to set elements to zero
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        // Step 3: Handle the first row
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                mat[0][j] = 0;
            }
        }

        // Step 4: Handle the first column
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                mat[i][0] = 0;
            }
        }
    }
}
