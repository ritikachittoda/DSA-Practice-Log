package Day3;

// LeetCode Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Time: O(n), Space: O(1)

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}