public class NoOfIslands {

    public static int noOfIslands(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return find(grid, visited);
    }

    static int find(int[][] grid, boolean[][] visited) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    visit(grid, visited, i, j, grid.length, grid[0].length);
                    count++;
                }
            }
        }
        return count;
    }

    static void visit(int[][] grid, boolean[][] visited, int i, int j, int l, int b) {
        if (!isSafe(grid, i, j, l, b, visited)) {
            return;
        }
        visited[i][j] = true;
        visit(grid, visited, i + 1, j, l, b);
        visit(grid, visited, i, j + 1, l, b);
        visit(grid, visited, i - 1, j, l, b);
        visit(grid, visited, i, j - 1, l, b);
        visit(grid, visited, i - 1, j - 1, l, b);
        visit(grid, visited, i - 1, j + 1, l, b);
        visit(grid, visited, i + 1, j + 1, l, b);
        visit(grid, visited, i + 1, j - 1, l, b);
    }

    static boolean isSafe(int[][] grid, int i, int j, int l, int b, boolean[][] visited) {
        return i >= 0 && i < l && j >= 0 && j < b && !visited[i][j] && grid[i][j] == 1;
    }
}
