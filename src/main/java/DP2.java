import java.util.*;
public class DP2 {
  static boolean canPartition(int[] nums) {
    int sum = Arrays.stream(nums).sum();
    return canPartitionRec(nums, sum, nums.length - 1, 0);
  }
  static boolean canPartitionRec(int[] nums, int sum, int i, int otherSum) {
    if(i < 0) return false;
    if(sum == otherSum) return true;
    return canPartitionRec(nums, sum - nums[i], i - 1, otherSum + nums[i]) || canPartitionRec(nums, sum, i - 1, otherSum);
  }
}
