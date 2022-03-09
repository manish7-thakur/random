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
      if(coins[i] <= amount) {
        int count = coinsNeededL(coins, amount - coins[i], mem);
        if(count != Integer.MAX_VALUE) count += 1;
        min = Math.min(min, count);
      }
    }
    mem.put(amount, min);
    return min;
  }
}
