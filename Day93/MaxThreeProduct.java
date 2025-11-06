package Day93;

import java.util.Arrays;

//LeetCode Problem 3732: https://leetcode.com/problems/maximum-product-of-three-elements-after-one-replacement/
//Time: O(n log n), Space: O(n)

public class MaxThreeProduct {
    public long maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        long ll = 1L * nums[n - 1] * nums[n - 2] * 100000;
        ll = Math.max(ll, 1L * nums[0] * -100000 * nums[n - 1]);
        ll = Math.max(ll, 1L * nums[0] * nums[1] * 100000);
        
        return ll;
    }
}
