package Day16;

// LeetCode Problem: https://leetcode.com/problems/word-search/
// Time: O(m * n * 3^(L - 1))​, Space: O(L)

public class WordSearch {
    public boolean exist(char[][] board, String word) {

        int n = board.length;
        int m = board[0].length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (backtrack(i, j, 0, board, word)) return true;
            }
        }

        return false;
    }

    public boolean backtrack(int i, int j, int k, char[][] board, String word) {
        if(k == word.length()) {
            return true;
        }

        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(k)) {
            return false;
        } 

        char temp = board[i][j];
        board[i][j] = '#';

        if(backtrack(i-1, j, k+1, board, word) || 
        backtrack(i+1, j, k+1, board, word) || 
        backtrack(i, j-1, k+1, board, word) || 
        backtrack(i, j+1, k+1, board, word)) {
            return true; 
        }

        board[i][j] = temp;
        return false;
    }
}
