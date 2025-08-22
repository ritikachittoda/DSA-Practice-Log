package Day17;

// LeetCode Problem: https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
// Time: O(m*n)​, Space: O(1)

public class MinRectangleArea {
    public int minimumArea(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int minRow =rows, maxRow = -1;
        int minCol = cols, maxCol = -1;  
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 1) {
                    if(minRow > i) minRow = i;
                    if(maxRow < i) maxRow = i;
                    if(minCol > j) minCol = j;
                    if(maxCol < j) maxCol = j;
                }
            }
        }

        if(maxRow == -1) return 0;
        
        return (maxRow - minRow + 1) * (maxCol - minCol + 1); 
    }
}