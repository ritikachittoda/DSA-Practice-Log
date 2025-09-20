package Day46;

//LeetCode Problem 153: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
//Time: O(log n), Space: O(1)

public class MinInRotatedArray {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }
}