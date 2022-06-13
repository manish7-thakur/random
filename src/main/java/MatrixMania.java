import java.util.*;

public class MatrixMania {
  static int[][] nearestZeroCell(int[][] mat) {
    record Pair(int i, int j){};
    Queue<Pair> queue = new LinkedList<>();
    for(int i = 0; i < mat.length; i++) {
      for(int j = 0; j < mat[0].length; j++) {
        if(mat[i][j] == 1) mat[i][j] = Integer.MAX_VALUE;
        else if(mat[i][j] == 0) queue.add(new Pair(i, j));
      }
    }
    while(!queue.isEmpty()) {
      Pair p = queue.remove();
      int i = p.i;
      int j = p.j;
      if(i - 1 >= 0 && 1 + mat[i][j] < mat[i - 1][j]) {
        mat[i - 1][j] = 1 + mat[i][j];
        queue.add(new Pair(i - 1, j));
      }
      if(i + 1 < mat.length && 1 + mat[i][j] < mat[i + 1][j]) {
        mat[i + 1][j] = 1 + mat[i][j];
        queue.add(new Pair(i + 1, j));
      }
      if(j - 1 >= 0 && 1 + mat[i][j] < mat[i][j - 1]) {
        mat[i][j - 1] = 1 + mat[i][j];
        queue.add(new Pair(i, j - 1));
      }
      if(j + 1 < mat[0].length && 1 + mat[i][j] < mat[i][j + 1]) {
        mat[i][j + 1] = 1 + mat[i][j];
        queue.add(new Pair(i, j + 1));
      }
    }
    return mat;
  }
}
