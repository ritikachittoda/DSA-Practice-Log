package Day81;

import java.util.Arrays;

//LeetCode Problem 1283: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
//Time: O(n(log n + log M)) where M = max integer in nums, Space: O(1) 

public class SmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int n = nums.length;
        int lp = 1;
        int rp = nums[n - 1];
        int ans = rp;

        while (lp <= rp) {
            int sum = 0;
            int mid = (lp + rp) / 2;

            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }

            if (sum <= threshold) {
                    ans = mid;
                    rp = mid - 1;
                } else {
                    lp = mid + 1;
                }
        }

        return ans;
    }
}
