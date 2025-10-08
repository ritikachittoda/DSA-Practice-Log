package Day64;

import java.util.Arrays;

//LeetCode Problem 2300: https://leetcode.com/problems/successful-pairs-of-spells-and-potions/
//Time: O((m + n) log m), Space: O(n)

public class SpellAndPotion {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int ans[] = new int[n];

        Arrays.sort(potions);
        
        for (int i = 0; i < n; i++) {
            long spell = spells[i];
            int lp = 0, rp = m - 1;
            int pos = m;

            while (lp <= rp) {
                int mid = lp + (rp - lp) / 2;
                if(spell  * (long) potions[mid] >= success) {
                    pos = mid;
                    rp = mid -1;
                } else {
                    lp = mid + 1;
                }
            }

            ans[i] = m - pos;
        }

        return ans;
    }
}
