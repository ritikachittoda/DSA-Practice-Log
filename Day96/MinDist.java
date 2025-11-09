package Day96;

//LeetCode Problem 3740: https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/
//Time: O(n ^ 3), Space: O(1)

public class MinDist {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int dist = 0, minDist = Integer.MAX_VALUE;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] == nums[j] && nums[j] == nums[k]) {
                        dist = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                        minDist = Math.min(dist, minDist);
                    }
                }
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}