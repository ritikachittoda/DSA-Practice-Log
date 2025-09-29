package Day55;

//LeetCode Problem 1039: https://leetcode.com/problems/minimum-score-triangulation-of-polygon/
//Time: O(n^3), Space: O(n^2)

public class MinScoreTriangulation {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int dp[][] = new int[n][n];

        for (int len = 2; len < n; len++) {
            for (int i = 0; i + len < n; i++) {
                int j = i + len;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j] + (values[i] * values[k] * values[j])); 
                }
            }
        }

        return dp[0][n - 1];
    }    
}