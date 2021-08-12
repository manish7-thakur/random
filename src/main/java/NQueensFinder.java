import java.util.*;

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
        addValidResIter(grid, 0, n, result, colV, ld, rd);
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

    static void addValidResIter(char[][] grid, int i, int n, List<List<String>> result, boolean[] colV, boolean[] ld, boolean[] rd) {
        class Snapshot {
            int i, j;
            int stage;

            public Snapshot(int i, int stage) {
                this.i = i;
                this.stage = stage;
            }
        }
        Deque<Snapshot> stack = new ArrayDeque<>();
        Snapshot csp = new Snapshot(i, 0);
        stack.push(csp);
        while (!stack.isEmpty()) {
            csp = stack.pop();
            switch (csp.stage) {
                case 0: {
                    if (csp.i < n) {
                        for (int j = csp.j; j < n; j++) {
                            if (canPlaceQueen(csp.i, j, n, colV, ld, rd)) {
                                grid[csp.i][j] = 'Q';
                                colV[j] = true;
                                ld[csp.i - j + n - 1] = true;
                                rd[csp.i + j] = true;
                                csp.stage = 1;
                                csp.j = j;
                                stack.push(csp);
                                Snapshot nsp = new Snapshot(csp.i + 1, 0);
                                stack.push(nsp);
                                break;
                            }
                        }
                        continue;
                    }
                    List<String> gridList = new ArrayList<>();
                    for (int j = 0; j < n; j++) {
                        gridList.add(new String(grid[j]));
                    }
                    result.add(gridList);
                    break;
                }
                case 1: {
                    grid[csp.i][csp.j] = '.';
                    colV[csp.j] = false;
                    ld[csp.i - csp.j + n - 1] = false;
                    rd[csp.i + csp.j] = false;
                    csp.j++;
                    csp.stage = 0;
                    stack.push(csp);
                    break;
                }
            }
        }
    }

    static boolean canPlaceQueen(int row, int col, int n, boolean[] colV, boolean[] ld, boolean[] rd) {
        return !colV[col] && !ld[row - col + n - 1] && !rd[row + col];
    }
}
