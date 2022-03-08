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
    Map<String, Integer> mem = new HashMap();
    int val = coinsNeeded(coins, 0, amount, mem);
    if(val == Integer.MAX_VALUE) return -1;
    return val;
  }

  static int coinsNeeded(int[] coins, int start, int amount, Map<String, Integer> mem) {
    if(amount > 0 && start >= coins.length) return Integer.MAX_VALUE;
    if(amount == 0) return 0;
    String key = amount + "," + start;
    if(mem.containsKey(key)) return mem.get(key);
    int count1 = Integer.MAX_VALUE;
    if(coins[start] <= amount) {
      count1 = coinsNeeded(coins, start, amount - coins[start], mem);
      if(count1 != Integer.MAX_VALUE) count1 += 1;
    }
    int count2 = coinsNeeded(coins, start + 1, amount, mem);
    int res = count1 == Integer.MAX_VALUE && count2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(count1, count2);
    mem.put(key, res);
    return res;
  }
}
