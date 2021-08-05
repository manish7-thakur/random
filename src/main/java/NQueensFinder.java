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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(grid[j], '.');
            }
        }
        addValidRes(grid, n, result);
        return result;
    }

    static void addValidRes(char[][] grid, int n, List<List<String>> result) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (canPlaceQueue(grid, i, j, n)) {
                    grid[i][j] = 'Q';
                    addValidRes(grid, n, result);
                    grid[i][j] = '.';
                }
            }
            if (!new String(grid[i]).contains("Q")) {
                return;
            }
        }
        List<String> gridList = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            gridList.add(new String(grid[j]));
        }
        result.add(gridList);
        return;
    }

    static boolean canPlaceQueue(char[][] grid, int i, int j, int n) {
        for (int k = 0; k < n; k++) {
            if (grid[i][k] == 'Q') return false;
            if (grid[k][j] == 'Q') return false;
        }

        int k = i;
        int l = j;
        while (k >= 0 && l < n) {
            if (grid[k][l] == 'Q') return false;
            k--;
            l++;
        }

        k = i;
        l = j;
        while (k >= 0 && l >= 0) {
            if (grid[k][l] == 'Q') return false;
            k--;
            l--;
        }

        k = i;
        l = j;
        while (k < n && l >= 0) {
            if (grid[k][l] == 'Q') return false;
            k++;
            l--;
        }

        k = i;
        l = j;
        while (k < n && l < n) {
            if (grid[k][l] == 'Q') return false;
            k++;
            l++;
        }
        return true;
    }
}
