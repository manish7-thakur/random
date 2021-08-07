import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueensFinder {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] grid = new char[n][n];
        boolean[] colV = new boolean[n];
        boolean[] ld = new boolean[2 * n + 1];
        boolean[] rd = new boolean[2 * n + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(grid[i], '.');
        }
        addValidRes(grid, 0, n, result, colV, ld, rd);
        return result;
    }

    static void addValidRes(char[][] grid, int i, int n, List<List<String>> result, boolean[] colV, boolean[] ld, boolean[] rd) {
        if (i < n) {
            for (int j = 0; j < n; j++) {
                if (canPlaceQueen(i, j, n, colV, ld, rd)) {
                    grid[i][j] = 'Q';
                    colV[j] = true;
                    ld[i - j + n - 1] = true;
                    rd[i + j] = true;
                    addValidRes(grid, i + 1, n, result, colV, ld, rd);
                    grid[i][j] = '.';
                    colV[j] = false;
                    ld[i - j + n - 1] = false;
                    rd[i + j] = false;
                }
            }
            return;
        }
        List<String> gridList = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            gridList.add(new String(grid[j]));
        }
        result.add(gridList);
    }

    static boolean canPlaceQueen(int row, int col, int n, boolean[] colV, boolean[] ld, boolean[] rd) {
        return !colV[col] && !ld[row - col + n - 1] && !rd[row + col];
    }
}
