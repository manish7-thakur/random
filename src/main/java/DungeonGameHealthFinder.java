public class DungeonGameHealthFinder {
  static public int calculateMinimumHP(int[][] dungeon) {
    return calculate(dungeon, dungeon.length - 1, dungeon[0].length - 1);
  }
  static int calculate(int[][] mat, int i, int j) {
    if(i < 0 || j < 0) {
      return 1;
    }
    int min = Math.min(calculate(mat, i - 1, j), calculate(mat, i, j - 1));
    if(mat[i][j] < 0) min = -mat[i][j] + 1;
    return min;
  }
}
