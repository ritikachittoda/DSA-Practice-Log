package Day64;

import java.util.LinkedList;
import java.util.Queue;

//LeetCode Problem 778: https://leetcode.com/problems/swim-in-rising-water/
//Time: O(n² log n), Space: O(n²)

public class SwimInRisingWater {
    public int swimInWater(int[][] grid) {
        int n = grid.length;

        int low = Math.max(grid[0][0], grid[n-1][n-1]);
        int high = 0;
        for (int[] row : grid) {
            for (int val : row) {
                high = Math.max(high, val);
            }
        }

        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isReachable(grid, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;  
            }
        }
        return ans;
    }

    private boolean isReachable(int[][] grid, int t) {
        int n = grid.length;
        if (grid[0][0] > t) return false;

        boolean[][] visited = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = true;

        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int x = cell[0], y = cell[1];

            if (x == n - 1 && y == n - 1) return true;

            for (int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n &&
                    !visited[nx][ny] && grid[nx][ny] <= t) {
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        return false;
    }
}
