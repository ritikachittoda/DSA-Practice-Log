package Day54;

import java.util.Arrays;

//LeetCode Problem 976: https://leetcode.com/problems/largest-perimeter-triangle/
//Time: O(nlogn), Space: O(1) 

public class LargestPerimeter {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }
}
