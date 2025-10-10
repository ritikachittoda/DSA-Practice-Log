package Day66;

//LeetCode Problem 3147: https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon/
//Time: O(n), Space: O(n)

public class MysticDungeon {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int dp[] = new int[n];
        int ans = Integer.MIN_VALUE;

        for (int i = n -1; i >= 0; i--) {
            if (i + k < n) {
                dp[i] = dp[i + k] + energy[i];
            } else {
                dp[i] = energy[i];
            }
            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }
}