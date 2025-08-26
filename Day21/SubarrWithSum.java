package Day21;

import java.util.HashMap;
import java.util.Map;

// GFG Problem: https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
// Time: O(n)​, Space: O(n)

public class SubarrWithSum {
    public int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1; // whole subarray from 0 to i
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i); // store first occurrence
            }

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }
        }

        return maxLen;
    }
}
