package Day52;

//LeetCode Problem 2149: https://leetcode.com/problems/rearrange-array-elements-by-sign/
//Time: O(n), Space: O(n) 

public class ArrayBySign {
    public int[] rearrangeArray(int[] nums) {
        int positive[] = new int [nums.length / 2];
        int negative[] = new int [nums.length / 2]; 

        int i = 0, j = 0;
        for(int num : nums) {
            if (num > 0) positive[i++] = num;
            if (num < 0) negative[j++] = num;
        }

        i = 0;
        j = 0;
        for(int k = 0; k < nums.length; k++) {
            if (k % 2 == 0) nums[k] = positive[i++];
            if (k % 2 == 1) nums[k] = negative[j++];
        }

        return nums;
    }
}
