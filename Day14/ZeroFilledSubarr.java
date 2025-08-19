package Day14;

// LeetCode Problem: https://leetcode.com/problems/number-of-zero-filled-subarrays/
// Time: O(n)​, Space: O(1)

public class ZeroFilledSubarr {

    public long zeroFilledSubarray(int[] nums) {
       
        long count = 0;
        long current = 0;

        for (int num : nums) {
            if (num == 0 ) {
                current++;
                count += current;
            } 
            else current = 0;
        }

        return count;
    }
}