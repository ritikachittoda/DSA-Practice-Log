package Day62;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//LeetCode Problem 417: https://leetcode.com/problems/pacific-atlantic-water-flow/
//Time: O(m*n), Space: O(m*n)

public class WaterFlow {
    private int m,n;
    private int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for (int i = 0; i < m; i++) dfs(i, 0, heights, pacific); 
        for (int j = 0; j < n; j++) dfs(0, j, heights, pacific); 
        for (int i = 0; i < m; i++) dfs(i, n - 1, heights, atlantic); 
        for (int j = 0; j < n; j++) dfs(m - 1, j, heights, atlantic);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i,j));
                }
            }
        } 

        return result;
    }

    private void dfs(int i, int j, int[][] heights, boolean[][] visited) {
        if (visited[i][j]) return;
        visited[i][j] = true;

        for(int[] d : dirs) {
            int x = i + d[0], y = j + d[1];
            if(x < 0 || x >= m || y < 0 || y >= n) continue;
            if(heights[x][y] < heights[i][j]) continue;
            dfs(x, y, heights, visited);
        }
    }
}
