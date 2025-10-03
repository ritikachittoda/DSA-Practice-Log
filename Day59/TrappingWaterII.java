package Day59;

import java.util.PriorityQueue;

//LeetCode Problem 407: https://leetcode.com/problems/trapping-rain-water-ii/
//Time: O(m*n*log(m*n)), Space: O(m*n) 

public class TrappingWaterII {
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;
        boolean visited[][] = new boolean[m][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int totalWater = 0;

        if(m < 3 || n < 3) return 0;

        for(int i = 0; i < m; i++) {
            pq.offer(new int[]{heightMap[i][0], i, 0});
            pq.offer(new int[]{heightMap[i][n - 1], i, n - 1});
            visited[i][0] = true;
            visited[i][n - 1] = true; 
        }

        for(int j = 0; j < n; j++) {
            pq.offer(new int[]{heightMap[0][j], 0, j});
            pq.offer(new int[]{heightMap[m - 1][j], m - 1, j});
            visited[0][j] = true;
            visited[m - 1][j] = true; 
        }

        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while(!pq.isEmpty()) {
            int cell[] = pq.poll();
            int h = cell[0], r = cell[1], c = cell[2];
            for(int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if(nr < 0 || nr >= m || nc < 0 || nc >= n || visited[nr][nc]) continue;
                visited[nr][nc] = true;

                if(heightMap[nr][nc] < h) {
                    totalWater += h - heightMap[nr][nc];
                }
                pq.offer(new int[]{Math.max(heightMap[nr][nc], h), nr, nc});
            }
        } 
        
        return totalWater;
    }
}
