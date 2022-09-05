import java.util.*;
public class DP2 {
  static boolean canPartition(int[] nums) {
    int sum = Arrays.stream(nums).sum();
    Map<String, Boolean> mem = new HashMap<>();
    if(sum % 2 != 0) return false;
    return canPartitionRec(nums, sum / 2, nums.length - 1, mem);
  }
  static boolean canPartitionRec(int[] nums, int sum, int i, Map<String, Boolean> mem) {
    if(i < 0) return false;
    String key = getKey(i, sum);
    if(mem.containsKey(key)) return mem.get(key);
    if(sum == 0) return true;
    boolean res = false;
    if(nums[i] <= sum) {
      res = canPartitionRec(nums, sum - nums[i], i - 1, mem);
    }
    res = res || canPartitionRec(nums, sum, i - 1, mem);
    mem.put(key, res);
    return res;
  }
  static String getKey(int i, int j) {
    return i + "," + j;
  }
  static int longestArithSeqLength(int[] nums) {
    int max = 0;
    Map<String, Integer> mem = new HashMap<>(nums.length);
    for(int i = nums.length - 1; i >= 0 ; i--) {
      for(int j = i - 1; j >= 0; j--) {
        int diff = nums[j] - nums[i];
        max = Math.max(max, 2 + longestArithSeqLengthRec(nums, j - 1, j, diff, mem));
      }
    }
    return max;
  }
  static int longestArithSeqLengthRec(int[] nums, int i, int previous, int diff, Map<String, Integer> mem) {
    if(i < 0) return 0;
    String key = getKey(previous, diff);
    if(mem.containsKey(key)) return mem.get(key);
    if(nums[i] - nums[previous] == diff) {
      int res = 1 + longestArithSeqLengthRec(nums, i - 1, i, diff, mem);
      mem.put(key, res);
      return res;
    }
    int res = longestArithSeqLengthRec(nums, i - 1, previous, diff, mem);
    mem.put(key, res);
    return res;
  }
  static int numSquares(int n) {
    List<Integer> squares = new ArrayList<>();
    Integer[] mem = new Integer[n + 1]; // Using Map here caused TLE.
    int sq = 0;
    for(int i = 1; sq <= n; i++) {
      sq = i * i;
      if(sq <= n) squares.add(sq);
      else break;
    }
    return numSquaresRec(squares, n, mem);
  }
  static int numSquaresRec(List<Integer> squares, int n, Integer[] mem) {
    if(n == 0) return 0;
    int min = Integer.MAX_VALUE;
    if(mem[n] != null) return mem[n];
    for(int i = squares.size() - 1; i >= 0; i--) {
      if(squares.get(i) <= n) {
        int curr = numSquaresRec(squares, n - squares.get(i), mem);
        if(curr != Integer.MAX_VALUE) min = Math.min(1 + curr, min);
      }
    }
    mem[n] = min;
    return min;
  }
  static int maxProfit(int[] prices) {
    Integer[][] mem = new Integer[prices.length][1001];
    return maxProfitRec(prices, 1, prices[0], mem);
  }
  static int maxProfitRec(int[] prices, int i, int min, Integer[][] mem) {
    if(i >= prices.length) return 0;
    if(mem[i][min] != null) return mem[i][min];
    int profit = 0;
    if(prices[i] > min) profit += Math.max(prices[i] - min + maxProfitRec(prices, i + 2, 1000, mem), maxProfitRec(prices, i + 1, min, mem));
    else profit += maxProfitRec(prices, i + 1, prices[i], mem);
    mem[i][min] = profit;
    return profit;
  }
  /**
  MultiSource BFS or DFS, in this case we don't use DP recursion.
  we use queue for each element that changes.
  https://www.vldb.org/pvldb/vol8/p449-then.pdf
  */
  static int maxDistance(int[][] grid) {
    int res = -1;
    record Pair(int i, int j){}
    Queue<Pair> queue = new LinkedList<>();
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[0].length; j++) {
        if(grid[i][j] == 1) queue.add(new Pair(i, j));
      }
    }
    while(!queue.isEmpty()) {
      int count = queue.size();
      while(count > 0) {
        Pair p = queue.remove();
        int i = p.i;
        int j = p.j;
        if(i - 1 >= 0 && grid[i - 1][j] == 0) queue.add(new Pair(i - 1, j));
        if(j - 1 >= 0 && grid[i][j - 1] == 0) queue.add(new Pair(i, j - 1));
        if(j + 1 < grid[0].length && grid[i][j + 1] == 0) queue.add(new Pair(i, j + 1));
        if(i + 1 < grid.length && grid[i + 1][j] == 0) queue.add(new Pair(i + 1, j));
        grid[i][j] = 2; // act as visited
        count--;
      }
      res += 1;
    }
    if(res > 0) return res;
    return -1;
  }
}
