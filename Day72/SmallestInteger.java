package Day72;

import java.util.HashMap;

//LeetCode Problem 2598: https://leetcode.com/problems/smallest-missing-non-negative-integer-after-operations/
//Time: O(n), Space: O(value)

public class SmallestInteger {
    public int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int  num : nums) {
            num = ((num % value) + value) % value; 
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int i = 0;
        while (true) {
            int r = ((i % value) + value) % value;
            if (map.getOrDefault(r, 0) > 0) {
                map.put(r, map.get(r) - 1);
            } else {
                return i;
            }
            i++;
        }
    }
}
