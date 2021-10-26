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
    if(i == mat.length - 1 && j == mat[0].length - 1) {
      return Math.max(1, 1 - mat[i][j]);
    }
    if(i >= mat.length || j >= mat[0].length) return Integer.MAX_VALUE;
    int h1 = calculate(mat, i + 1, j);
    int h2 = calculate(mat, i, j + 1);
    int health = Math.min(h1, h2) - mat[i][j];
    return Math.max(1, health);
  }
}
