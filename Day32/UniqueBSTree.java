package Day32;

// LeetCode Problem: https://leetcode.com/problems/unique-binary-search-trees/
// Time: O(n^2)​, Space: O(n)

public class UniqueBSTree {
    public int numTrees(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < n + 1; i++) {
            for(int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i-j-1];
            }
        }

        return dp[n];
    }
}
