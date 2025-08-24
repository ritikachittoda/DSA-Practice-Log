package Day19;

// LeetCode Problem: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
// Time: O(n)​, Space: O(1)

public class longestSubarrDeleteOne {

    public int longestSubarray(int[] nums) {
        int left = 0;
        int maxLen = 0;
        int zeros = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zeros++;
            }
            while(zeros > 1) {
                if(nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            maxLen = Math.max(maxLen,i - left + 1);
        }
        
        return maxLen-1;
    }
}