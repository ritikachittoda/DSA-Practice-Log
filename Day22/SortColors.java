package Day22;

// LeetCode Problem: https://leetcode.com/problems/sort-colors/
// Time: O(n)​, Space: O(1)

public class SortColors {
    public void sortColors(int[] nums) {
        int z_count = 0, o_count = 0, t_count = 0;

        for(int num : nums) {
            if(num == 0) z_count++;
            else if(num == 1) o_count++;
            else t_count++;
        }

        int i = 0;
        while(z_count-- > 0) nums[i++] = 0;
        while(o_count-- > 0) nums[i++] = 1;
        while(t_count-- > 0) nums[i++] = 2;
    }
}
