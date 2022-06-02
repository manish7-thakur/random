public class MatrixMania {
  static int[][] nearestZeroCell(int[][] mat) {
    for(int i = 0; i < mat.length; i++) {
      for(int j = 0; j < mat[0].length; j++) {
        if(mat[i][j] == 1) mat[i][j] = Integer.MAX_VALUE;
      }
    }
    boolean goAgain = true;
    while(goAgain) {
      goAgain = false;
      for(int i = 0; i < mat.length; i++) {
        for(int j = 0; j < mat[0].length; j++) {
          int min = getMin(mat, i, j);
          if(min != Integer.MAX_VALUE && min + 1 < mat[i][j]) {
            goAgain = true;
            mat[i][j] = 1 + min;
          }
        }
      }
    }
    return mat;
  }
  static int getMin(int[][] mat, int i , int j) {
    int min = Integer.MAX_VALUE;
    if(i - 1 >= 0) min = Math.min(min, mat[i - 1][j]);
    if(j - 1 >= 0) min = Math.min(min, mat[i][j - 1]);
    if(i + 1 < mat.length) min = Math.min(min, mat[i + 1][j]);
    if(j + 1 < mat[0].length) min = Math.min(min, mat[i][j + 1]);
    return min;
  }
}
