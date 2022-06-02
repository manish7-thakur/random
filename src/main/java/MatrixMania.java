public class MatrixMania {
  static int[][] nearestZeroCell(int[][] mat) {
    boolean[][] visited = new boolean[mat.length][mat[0].length];
    Integer[][] mem = new Integer[mat.length][mat[0].length];
    for(int i = 0; i < mat.length; i++) {
      for(int j = 0; j < mat[0].length; j++) {
        if(mat[i][j] == 1) nearestZeroCellRec(mat, i, j, visited);
      }
    }
    return mat;
  }
  static int nearestZeroCellRec(int[][] mat, int i, int j, boolean[][] visited) {
    if(!safe(mat, i, j, visited)) return Integer.MAX_VALUE;
    if(mem[i][j] != null) return mem[i][j];
    if(visited[i][j]) return mat[i][j];
    visited[i][j] = true;
    if(mat[i][j] == 0) return 0;
    int min1 = Math.min(nearestZeroCellRec(mat, i - 1, j, visited), nearestZeroCellRec(mat, i, j - 1, visited));
    int min2 = Math.min(nearestZeroCellRec(mat, i + 1, j, visited), nearestZeroCellRec(mat, i, j + 1, visited));
    int min = Math.min(min1, min2);
    mat[i][j] = 1 + min;
    mem[i][j] = mat[i][j];
    visited[i][j] = false;
    return mat[i][j];
  }
  static boolean safe(int[][] mat, int i, int j, boolean[][] visited) {
    return i >= 0 && i < mat.length && j >= 0 && j < mat[0].length;
  }
}
