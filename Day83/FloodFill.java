package Day83;

//LeetCode Problem 733: https://leetcode.com/problems/flood-fill/
//Time: O(n * m), Space: O(n * m)

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public void helper (int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        image[sr][sc] = color;
        vis[sr][sc] = true;
        helper(image, sr, sc - 1, color, vis, orgCol);
        helper(image, sr, sc + 1, color, vis, orgCol);
        helper(image, sr - 1, sc, color, vis, orgCol);
        helper(image, sr + 1, sc, color, vis, orgCol);
    }
}
