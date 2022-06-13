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

  static int[][] kClosest(int[][] points, int k) {
    int l = 0, h = points.length - 1, n = k - 1;
    while(l < h) {
      int pos = partition(points, l, h);
      if(pos == n) break;
      else if(pos < n) l = pos + 1;
      else h = pos - 1;
    }
    return Arrays.stream(points).limit(k).toArray(int[][]::new);
  }

  static int partition(int[][] points, int l, int h) {
    int pivot = points[l][0] * points[l][0] + points[l][1] * points[l][1];
    int pos = l;
    for(int i = l + 1; i <= h; i++) {
      if(points[i][0] * points[i][0] + points[i][1] * points[i][1] < pivot) {
        pos++;
        swap(points, i, pos);
      }
    }
    swap(points, l, pos);
    return pos;
  }

  static void swap(int[][] points, int i, int j) {
    int[] temp = points[i];
    points[i] = points[j];
    points[j] = temp;
  }
}
