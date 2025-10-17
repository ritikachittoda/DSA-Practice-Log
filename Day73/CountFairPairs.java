package Day73;

import java.util.Arrays;

//LeetCode Problem 2563: https://leetcode.com/problems/count-the-number-of-fair-pairs/
//Time: O(n log n), Space: O(1)

public class CountFairPairs {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        Arrays.sort(nums);

        int lp = 0, rp = n - 1;
        long upperCount = 0;

        while (lp < rp) {
            if (nums[lp] + nums[rp] <= upper) {
                upperCount += (rp - lp); 
                lp++;
            } else {
                rp--;
            }
        }

        lp = 0;
        rp = n - 1;
        long lowerCount = 0;

        while (lp < rp) {
            if (nums[lp] + nums[rp] < lower) {
                lowerCount += (rp - lp); 
                lp++;
            } else {
                rp--;
            }
        }

        return upperCount - lowerCount;
    }
}