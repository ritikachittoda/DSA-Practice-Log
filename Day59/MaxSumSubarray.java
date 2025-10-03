package Day59;

//LeetCode Problem 53: https://leetcode.com/problems/maximum-subarray/
//Time: O(n), Space: O(1) 

public class MaxSumSubarray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < n; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
