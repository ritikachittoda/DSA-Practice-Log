package Day46;

//LeetCode Problem 540: https://leetcode.com/problems/single-element-in-a-sorted-array/
//Time: O(log n), Space: O(1)

public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        int lp = 0, rp = nums.length - 1;

        while(lp < rp) {
            int mid = lp + (rp - lp) / 2;
            if(mid % 2 != 0) {
                mid--;
            }
            if(nums[mid] == nums[mid + 1]) {
                lp = mid + 2;
            } else {
                rp = mid;
            }
        }
        
        return nums[lp];
    }
}
