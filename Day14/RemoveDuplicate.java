package Day14;

// LeetCode Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Time: O(n)​, Space: O(1)

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {

        int i = 1; 

        for(int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[j-1]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
