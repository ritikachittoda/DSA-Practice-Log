package Day75;

//LeetCode Problem 48: https://leetcode.com/problems/rotate-image/
//Time: O(n ^ 2), Space: O(1)

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int lp = 0;
            int rp = n - 1;
            while (lp < rp) {
                int temp = matrix[i][lp];
                matrix[i][lp] = matrix[i][rp];
                matrix[i][rp] = temp;
                lp++;
                rp--;
            }
        }
    }
}