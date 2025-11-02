package Day89;

//LeetCode Problem 2257: https://leetcode.com/problems/count-unguarded-cells-in-the-grid/
//Time: O(G * (m + n) + m * n), Space: O(m * n)

public class UnguardedCells {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int grid[][] = new int[m][n];

        for (int[] g : guards) {
            grid[g[0]][g[1]] = 1;
        }
        for (int[] w : walls) {
            grid[w[0]][w[1]] = 2;
        }

        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        for (int[] g : guards) {
            int r = g[0];
            int c = g[1];
            for (int[] dir : dirs) {
                int dr = dir[0];
                int dc = dir[1];

                int row = r + dr;
                int col = c + dc;

                while (row >= 0 && row < m && col >= 0 && col < n) {
                    if (grid[row][col] == 1 || grid[row][col] == 2)
                        break;
                    if (grid[row][col] == 0)
                        grid[row][col] = 3;
                    row += dr;
                    col += dc;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0)
                    count++;
            }
        }

        return count;
    }
}