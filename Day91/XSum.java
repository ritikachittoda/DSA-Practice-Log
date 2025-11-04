package Day91;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//LeetCode Problem 3318: https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-i/
//Time: O(n * k log k), Space: O(k)

public class XSum {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            Map<Integer, Integer> freq = new HashMap<>();

            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            List<int[]> list = new ArrayList<>();
            for (var entry : freq.entrySet()) {
                list.add(new int[]{entry.getKey(), entry.getValue()});
            }

            list.sort((a, b) -> {
                if (b[1] == a[1]) return b[0] - a[0];
                return b[1] - a[1];
            });

            int count = 0, sum = 0;
            for (int[] pair : list) {
                if (count == x) break;
                sum += pair[0] * pair[1];
                count++;
            }

            ans[i] = sum;
        }

        return ans;
    }
}