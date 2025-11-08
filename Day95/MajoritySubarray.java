package Day95;

//LeetCode Problem 3737: https://leetcode.com/problems/count-subarrays-with-majority-element-i/
//Time: O(n ^ 2), Space: O(1)

public class MajoritySubarray {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == target) freq++;
                int len = j - i + 1;
                if (freq > len / 2) {
                    count++;
                }
            }
        }

        return count;
    }
}