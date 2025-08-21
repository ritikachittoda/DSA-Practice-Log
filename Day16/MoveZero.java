package Day16;

// LeetCode Problem: https://leetcode.com/problems/move-zeroes/
// Time: O(n)​, Space: O(1)

public class MoveZero {

    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int num: nums){
            if(num != 0){
                nums[i++] = num;
            }
        }
        while(i < nums.length){
            nums[i++] = 0;
        }
    }   
}