public class SudokuSolver {

    public static void solveSudoku(char[][] board) {
        solveNow(board);
    }

    static boolean solveNow(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValidSudoku(board, i, j, c)) {
                            board[i][j] = c;
                            if (solveNow(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static public boolean isValidSudoku(char[][] board, int row, int col, char c) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == c || board[row][i] == c || board[3 * (row / 3) + (i / 3)][3 * (col / 3) + (i % 3)] == c) {
                return false;
            }
        }
        return true;
    }
}