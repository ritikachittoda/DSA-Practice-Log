package Day24;

import java.util.Arrays;

// LeetCode Problem: https://leetcode.com/problems/assign-cookies/
// Time: O(n log n)​, Space: O(1)

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;
        while(i < g.length && j < s.length) {
            if(g[i] <= s[j]) {
                i++;
            } 
            j++;
        }

        return i;
    }
}
