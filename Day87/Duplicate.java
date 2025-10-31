package Day87;

import java.util.ArrayList;
import java.util.List;

//LeetCode Problem 442: https://leetcode.com/problems/find-all-duplicates-in-an-array/
//Time: O(n), Space: O(1)

public class Duplicate {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for (int num : nums) {
            int idx = Math.abs(num) - 1;
            if (nums[idx] < 0) {
                ans.add(Math.abs(num));
            } else {
                nums[idx] = -nums[idx];
            }
        }

        return ans;
    }
}