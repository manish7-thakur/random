public class DungeonGameHealthFinder {
  static class Pair {
    int minHealth;
    int totalHealth;
    public Pair(int minHealth, int totalHealth) {
      this.minHealth = minHealth;
      this.totalHealth = totalHealth;
    }
  }
  static public int calculateMinimumHP(int[][] dungeon) {
    return calculate(dungeon, 0, 0);
  }
  // static Pair calculate(int[][] mat, int i, int j) {
  //   if(i < 0 || j < 0) {
  //     return new Pair(Integer.MAX_VALUE, Integer.MAX_VALUE);
  //   }
  //   Pair p1 = calculate(mat, i - 1, j);
  //   Pair p2 = calculate(mat, i, j - 1);
  //   int t1 = p1.totalHealth + mat[i][j];
  //   int t2 = p2.totalHealth + mat[i][j];
  //   int m1 = p1.minHealth, m2 = p2.minHealth;
  //   if(t1 < 0) {
  //     m1 += -t1;
  //     t1 = 0;
  //   }
  //   if(t2 < 0) {
  //     m2 += -t2;
  //     t2 = 0;
  //   }
  //   if(m1 < m2) return new Pair(m1, t1);
  //   else return new Pair(m2, t2);
  // }

  static int calculate(int[][] mat, int i, int j) {
    if(i == 0 && j == 0) {
      return Math.max(1, 1 - mat[0][0]);
    }
    if(i <= 0 || j <= 0) return Integer.MAX_VALUE;
    int h1 = calculate(mat, i - 1, j);
    int h2 = calculate(mat, i, j - 1);
    int min1 = 0, min2 = 0;
    if(h1 == Integer.MAX_VALUE) min1 = mat[i][j];
    else min1 = Math.max(h1 - mat[i][j], 1);
    if(h2 == Integer.MAX_VALUE) min2 = mat[i][j];
    else min2 = Math.max(h2 - mat[i][j], 1);
    return Math.min(min1, min2);
  }
}
