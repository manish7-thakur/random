public class DungeonGameHealthFinder {
  static public int calculateMinimumHP(int[][] dungeon) {
    int[][] mem = new int[dungeon.length][dungeon[0].length];
    return calculate(dungeon, 0, 0, mem);
  }

  static int calculate(int[][] mat, int i, int j, int[][] mem) {
    if(i == mat.length - 1 && j == mat[0].length - 1) {
      return Math.max(1, 1 - mat[i][j]);
    }
    if(i >= mat.length || j >= mat[0].length) return Integer.MAX_VALUE;
    if(mem[i][j] != 0) return mem[i][j];
    int health = Math.min(calculate(mat, i + 1, j, mem), calculate(mat, i, j + 1, mem)) - mat[i][j];
    mem[i][j] = Math.max(1, health);
    return mem[i][j];
  }
}
