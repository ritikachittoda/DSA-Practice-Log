package Day26;

// LeetCode Problem: https://leetcode.com/problems/sudoku-solver/
// Time: O(9^m) m = empty cells​, Space: O(1)

public class SudokuSolver {

    public void solveSudoku(char[][] board) {
        sudokuSolver(board, 0, 0);
    }

    private boolean sudokuSolver(char[][] board, int row, int col) {
        if (row == 9) return true;

        int nextRow = row, nextCol = col + 1;
        if (col == 8) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (board[row][col] != '.') {
            return sudokuSolver(board, nextRow, nextCol);
        }

        for (char ch = '1'; ch <= '9'; ch++) {
            if (isSafe(board, row, col, ch)) {
                board[row][col] = ch;
                if (sudokuSolver(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = '.'; 
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch || board[row][i] == ch) {
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == ch) {
                    return false;
                }
            }
        }
        return true;
    }
}