package Day62;

import java.util.ArrayList;
import java.util.List;

//LeetCode Problem 78: https://leetcode.com/problems/subsets/
//Time: O(2^n), Space: O(2^n)

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        subset(nums, new ArrayList<>(), res, 0);
        return res;
    }

    public void subset(int nums[], List<Integer> current, List<List<Integer>> res, int i) {
        if (i == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        subset(nums,current,res,i+1);
        
        current.remove(current.size()-1);
        subset(nums,current,res,i+1);
    }    
}