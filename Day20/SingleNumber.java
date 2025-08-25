package Day20;

// LeetCode Problem: https://leetcode.com/problems/single-number/
// Time: O(n)​, Space: O(1)

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            count ^= nums[i];
        }

        return count;
         
    }
}