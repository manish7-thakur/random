import java.util.*;

public class DP {
  static public int climbStairs(int n) {
    int[] mem = new int[n + 1];
    return climb(n, mem);
  }
  static public int climb(int n, int[] mem) {
    if(n <= 1) return 1;
    if(mem[n] != 0) return mem[n];
    int count = climb(n - 1, mem) + climb(n - 2, mem);
    mem[n] = count;
    return count;
  }

  static int coinChange(int[] coins, int amount) {
    Map<Integer, Integer> mem = new HashMap();
    int val = coinsNeededL(coins, amount, mem);
    if(val == Integer.MAX_VALUE) return -1;
    return val;
  }

  static int coinsNeededL(int[] coins, int amount, Map<Integer, Integer> mem) {
    if(amount <= 0) return 0;
    if(mem.containsKey(amount)) return mem.get(amount);
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < coins.length; i++) {
      if(coins[i] <= amount) { // this will never let amount go negative and min will remain Integer.MAX_VALUE
        int count = coinsNeededL(coins, amount - coins[i], mem);
        if(count != Integer.MAX_VALUE) count += 1;
        min = Math.min(min, count);
      }
    }
    mem.put(amount, min);
    return min;
  }
  static public int longestCommonSubsequence(String text1, String text2) {
    int[][] mem = new int[text1.length()][text2.length()];
    Arrays.stream(mem).forEach(arr -> Arrays.fill(arr, -1));
    return lcs(text1, text2, text1.length() - 1, text2.length() - 1, mem);
  }
  static public int lcs(String text1, String text2, int i, int j, int[][] mem) {
    if(i < 0 || j < 0) return 0;
    if(mem[i][j] != -1) return mem[i][j];
    int count = 0;
    if(text1.charAt(i) == text2.charAt(j)) count = 1 + lcs(text1, text2, i - 1, j - 1, mem);
    else count = Math.max(lcs(text1, text2, i - 1, j, mem), lcs(text1, text2, i, j - 1, mem));
    mem[i][j] = count;
    return count;
  }
}
