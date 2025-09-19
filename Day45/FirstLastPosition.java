package Day45;

//LeetCode Problem 34: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//Time: O(log n), Space: O(1)

public class FirstLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);        
        int last = findLast(nums, target);  
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == nums[mid]) {
                ans = mid;
                end = mid - 1;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private int findLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == nums[mid]) {
                ans = mid;
                start = mid + 1;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }    
}