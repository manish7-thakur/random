import java.util.*;
public class DP2 {
  static boolean canPartition(int[] nums) {
    int sum = Arrays.stream(nums).sum();
    Map<String, Boolean> mem = new HashMap<>();
    return canPartitionRec(nums, sum, nums.length - 1, 0, mem);
  }
  static boolean canPartitionRec(int[] nums, int sum, int i, int otherSum, Map<String, Boolean> mem) {
    if(i < 0) return false;
    String key = getKey(i, otherSum);
    if(mem.containsKey(key)) return mem.get(key);
    if(sum == otherSum) return true;
    boolean res = canPartitionRec(nums, sum - nums[i], i - 1, otherSum + nums[i], mem) || canPartitionRec(nums, sum, i - 1, otherSum, mem);
    mem.put(key, res);
    return res;
  }
  static String getKey(int i, int j) {
    return i + "," + j;
  }
}
