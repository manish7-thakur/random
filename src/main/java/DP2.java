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
    int sq = 0;
    for(int i = 1; sq <= n; i++) {
      sq = i * i;
      if(sq <= n) squares.add(sq);
      else break;
    }
    return numSquaresRec(squares, squares.size() - 1, n);
  }
  static int numSquaresRec(List<Integer> squares, int i, int n) {
    if(n == 0) return 0;
    if(n < 0 || i < 0) return Integer.MAX_VALUE;
    int max = numSquaresRec(squares, i , n - squares.get(i));
    if(max != Integer.MAX_VALUE) max = 1 + max;
    max = Math.min(max, numSquaresRec(squares, i - 1, n));
    return max;
  }
}
