package Day71;

import java.util.List;

//LeetCode Problem 3350: https://leetcode.com/problems/adjacent-increasing-subarrays-detection-ii/
//Time: O(n log n), Space: O(n)

public class IncreasingSubarrayII {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int incCount[] = new int[n];
        incCount[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                incCount[i] = 1 + incCount[i + 1];
            } else {
                incCount[i] = 1;   
            }
        }

        int left = 1, right = n / 2;
        int ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (existsTwoAdjacent(mid, incCount, n)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private boolean existsTwoAdjacent(int k, int[] incCount, int n) {
        for (int i = 0; i + k < n; i++) {
            if (incCount[i] >= k && incCount[i + k] >= k) return true;
        }
        return false;
    }
}