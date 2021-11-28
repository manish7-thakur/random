public class MatrixTraverser {
  static public boolean searchMatrix(int[][] matrix, int target) {
    boolean[][] visited = new boolean[matrix.length][matrix[0].length];
    return visit(matrix, 0, 0, target, visited);
  }
  static boolean visit(int[][] matrix, int i, int j, int target, boolean[][] visited) {
    if(!safe(matrix, i , j, visited)) return false;
    visited[i][j] = true;
    if(matrix[i][j] == target) return true;
    else if(matrix[i][j] < target && visit(matrix, i, j + 1, target, visited)) {
      return true;
    } else if(matrix[i][j] > target && visit(matrix, i, j - 1, target, visited)) {
      return true;
    }
    if(visit(matrix, i + 1, j, target, visited)) return true;
    return false;
  }
  static boolean safe(int[][] matrix, int i, int j, boolean[][] visited) {
    return i < matrix.length && i >= 0 && j < matrix[0].length && j >= 0 && !visited[i][j];
  }
}
