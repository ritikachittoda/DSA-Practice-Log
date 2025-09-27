package Day53;

//LeetCode Problem 812: https://leetcode.com/problems/largest-triangle-area/
//Time: O(n^3), Space: O(1) 

public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];

                    double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
                    maxArea = Math.max(area, maxArea);
                }
            }
        }

        return maxArea;
    }    
}