package Day84;

//LeetCode Problem 3354: https://leetcode.com/problems/make-array-elements-equal-to-zero/
//Time: O(n^2), Space: O(n)

public class ElementEqualToZero {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int valid = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (isValid(nums, i, -1)) valid++;
                if (isValid(nums, i, 1)) valid++;
            }
        }
        return valid;
    }

    private boolean isValid(int[] nums, int start, int dir) {
        int n = nums.length;
        int[] arr = nums.clone();
        int curr = start;

        while (curr >= 0 && curr < n) {
            if (arr[curr] == 0) {
                curr += dir;
            } else {
                arr[curr]--;
                dir = -dir;
                curr += dir;
            }
        }

        for (int x : arr) {
            if (x != 0) return false;
        }
        return true;
    }
}
