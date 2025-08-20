package Day15;

// LeetCode Problem: https://leetcode.com/problems/rotate-array/
// Time: O(n)​, Space: O(1)

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public int[] reverse(int[] arr, int i, int j){
        while(i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }
}