package Day65;

//LeetCode Problem 3494: https://leetcode.com/problems/find-the-minimum-amount-of-time-to-brew-potions/
//Time: O(n * m), Space: O(n)

public class BrewPotions {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length, m = mana.length;

        long dp[] = new long[n + 1];

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                dp[i + 1] = Math.max(dp[i + 1], dp[i]) + (long) skill[i] * mana[j];
            }
            for (int i = n - 1; i > 0; i--) {
                dp[i] = dp[i + 1] - (long) skill[i] * mana[j];
            }
        }

        return dp[n];
    }
}
