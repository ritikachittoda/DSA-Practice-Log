package Day56;

//LeetCode Problem 2221: https://leetcode.com/problems/find-triangular-sum-of-an-array/
//Time: O(n^2), Space: O(1) 

public class TriangularSum {
    public int triangularSum(int[] nums) {
        int n = nums.length;

        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            n--;
        }

        return nums[0];
    }
}