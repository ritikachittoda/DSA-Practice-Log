package Day33;

// LeetCode Problem: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
// Time: O(n)​, Space: O(1)

public class SumUptoZero {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int i = 0;

        if(n % 2 == 1) {
            ans[i++] = 0;
        }
        
        for(int x = 1; i < n; x++) {
            ans[i++] = -x;
            ans[i++] = x;
        }

        return ans;
    }
}
