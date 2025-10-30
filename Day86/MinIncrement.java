package Day86;

//LeetCode Problem 1526: https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/
//Time: O(n), Space: O(1)

public class MinIncrement {
    public int minNumberOperations(int[] target) {
        int n = target.length;
        int count = target[0];

        for (int i = 1; i < n; i++) {
            if (target[i] > target[i - 1]) {
                count += target[i] - target[i - 1];
            }
        }

        return count;
    }
}