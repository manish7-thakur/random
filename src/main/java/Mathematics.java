import java.util.*;

public class Mathematics {
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
    Arrays.sort(coins);
    return coinNeeded(coins, coins.length - 1, amount);
  }
  static int coinNeeded(int[] coins, int i, int amount) {
    if(amount <= 0) return 0;
    if(i < 0 && amount > 0) return -1;
    int count = 0;
    if(coins[i] > amount) {
      count = coinNeeded(coins, i - 1, amount);
      if(count == -1) return -1;
      return count;
    }
    else {
      count = coinNeeded(coins, i, amount - coins[i]);
      if(count == -1) return -1;
      return 1 + count;
    }
  }
}
