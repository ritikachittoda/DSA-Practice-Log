package Day23;

import java.util.HashMap;

// LeetCode Problem: https://leetcode.com/problems/majority-element/
// Time: O(n)​, Space: O(n)

public class MajorityElements {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > nums.length / 2){
                return key;
            }
        }

        return -1;
    }
}
