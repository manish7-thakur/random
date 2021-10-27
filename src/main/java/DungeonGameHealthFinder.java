public class DungeonGameHealthFinder {
  static public int calculateMinimumHP(int[][] dungeon) {
    return calculate(dungeon, 0, 0);
  }

  static int calculate(int[][] mat, int i, int j) {
    if(i == mat.length - 1 && j == mat[0].length - 1) {
      return Math.max(1, 1 - mat[i][j]);
    }
    if(i >= mat.length || j >= mat[0].length) return Integer.MAX_VALUE;
    int health = Math.min(calculate(mat, i + 1, j), calculate(mat, i, j + 1)) - mat[i][j];
    return Math.max(1, health);
  }
}
