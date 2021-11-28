public class MatrixTraverser {
  static public boolean searchMatrix(int[][] matrix, int target) {
    return visit(matrix, 0, 0, target);
  }
  static boolean visit(int[][] matrix, int i, int j, int target) {
    if(!safe(matrix, i , j)) return false;
    if(matrix[i][j] == target) return true;
    else if(matrix[i][j] < target && visit(matrix, i, j + 1, target)) {
      return true;
    }
    if(visit(matrix, i + 1, j, target)) return true;
    return false;
  }
  static boolean safe(int[][] matrix, int i, int j) {
    return i < matrix.length && j < matrix[0].length;
  }
}
