package Day80;

import java.util.HashSet;

//LeetCode Problem 3718: https://leetcode.com/problems/smallest-missing-multiple-of-k/
//Time: O(n + m), Space: O(n)

public class MissingMultiple {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int i = 1;
        while(set.contains(k * i)) {
            i++;
        }

        return k * i;
    }
}
