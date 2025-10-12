package Day68;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//LeetCode Problem 3186: https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
//Time: O(n +mlogm + m^2), Space: O(m) where n = number of spells, m = number of distinct spell powers

public class SpellCasting {
    public long maximumTotalDamage(int[] power) {
        HashMap<Integer, Long> map = new HashMap<>();
        for (int p : power) {
            map.put(p, map.getOrDefault(p, 0L) + p);
        }

        ArrayList<Integer> unique = new ArrayList<>(map.keySet());
        Collections.sort(unique);
        int n = unique.size();

        long[] dp = new long[n];
        dp[0] = map.get(unique.get(0));

        for (int i = 1; i < n; i++) {
            long take = map.get(unique.get(i));
            int j = i - 1;
            while (j >= 0 && unique.get(j) >= unique.get(i) - 2) j--;
            if (j >= 0) take += dp[j];
            dp[i] = Math.max(dp[i - 1], take);
        }

        return dp[n - 1];
    }
}
