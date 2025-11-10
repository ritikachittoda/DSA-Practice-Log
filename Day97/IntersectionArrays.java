package Day97;

import java.util.HashSet;

//LeetCode Problem 349: https://leetcode.com/problems/intersection-of-two-arrays/
//Time: O(n1 + n2), Space: O(n1 + k) where k is the size of the intersection set.

public class IntersectionArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int i = 0;
        int res[] = new int[set2.size()];
        for (int num : set2) {
            res[i++] = num;
        }

        return res;
    }
}