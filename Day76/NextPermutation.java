package Day76;

//LeetCode Problem 31: https://leetcode.com/problems/next-permutation/
//Time: O(n), Space: O(1)

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i =  n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        reverse(nums, pivot + 1, n - 1);
    }

    private void reverse(int[] nums, int lp, int rp) {
        while (lp < rp) {
            swap(nums, lp, rp);
            lp++;
            rp--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
