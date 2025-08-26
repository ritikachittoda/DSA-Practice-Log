package Day21;

// LeetCode Problem: https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/
// Time: O(n)​, Space: O(1)

public class LongestDiag {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag = 0, maxArea = 0;

        for(int dim[] : dimensions) {
            int a = dim[0];
            int b = dim[1];
            int currDiag = a*a + b*b;
            int area = a * b;

            if(currDiag > maxDiag) {
                maxDiag = currDiag;
                maxArea = area;
            } else if (currDiag == maxDiag) {
                maxArea = Math.max(maxArea, area);
            }
        }
        
        return maxArea;
    }
}
