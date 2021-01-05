public class WallsAndGates {
    public static void calc(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == -2) {
                    dfs(mat, i, j, 0, visited);
                }
            }
    }

    static void dfs(int[][] mat, int i, int j, int dist, boolean[][] visited) {
        if (!safe(mat, i, j, visited)) {
            return;
        }
        if (mat[i][j] == 0 || mat[i][j] > dist) {
            mat[i][j] = dist;
        }
        visited[i][j] = true;
        dfs(mat, i - 1, j, dist + 1, visited);
        dfs(mat, i, j - 1, dist + 1, visited);
        dfs(mat, i + 1, j, dist + 1, visited);
        dfs(mat, i, j + 1, dist + 1, visited);
        visited[i][j] = false;
    }

    static boolean safe(int[][] mat, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || visited[i][j] || mat[i][j] == -1) {
            return false;
        }
        return true;
    }
}
