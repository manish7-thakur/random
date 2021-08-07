import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueensFinder {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(grid[i], '.');
        }
        addValidRes(grid, 0, n, result);
        return result;
    }

    static void addValidRes(char[][] grid, int i, int n, List<List<String>> result) {
        if (i < n) {
            for (int j = 0; j < n; j++) {
                if (canPlaceQueen(grid, i, j, n)) {
                    grid[i][j] = 'Q';
                    addValidRes(grid, i + 1, n, result);
                    grid[i][j] = '.';
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

    static boolean canPlaceQueen(char[][] grid, int row, int col, int n) {
        for (int k = 0; k < row; k++) {
            if (grid[k][col] == 'Q') return false;
        }

        int k = row;
        int l = col;
        while (k >= 0 && l < n) {
            if (grid[k][l] == 'Q') return false;
            k--;
            l++;
        }

        k = row;
        l = col;
        while (k >= 0 && l >= 0) {
            if (grid[k][l] == 'Q') return false;
            k--;
            l--;
        }
        return true;
    }
}
