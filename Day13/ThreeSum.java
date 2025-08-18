package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// LeetCode Problem: https://leetcode.com/problems/3sum/
// Time: O(n²)​, Space: O(1)

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < n-2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int lp = i + 1, rp = n - 1;
            while(lp < rp){
                int sum = nums[i] + nums[lp] + nums[rp];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[lp], nums[rp]));
                    lp++;
                    rp--;

                    while(lp < rp && nums[lp] == nums[lp-1]) lp++;
                    while(lp < rp && nums[rp] == nums[rp+1]) rp--;
                } else if (sum < 0){
                    lp++;
                } else {
                    rp--;
                }
            }
        }

        return ans;

    }
}
