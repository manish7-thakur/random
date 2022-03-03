import java.util.*;

public class ArrayMania {
  static public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    for(int i = 0; i < nums.length - 2; i++) {
      if(i > 0 && nums[i] == nums[i - 1]) continue;
      int j = i + 1, k = nums.length - 1;
      while(j < k) {
        int sum = nums[j] + nums[k];
        if(sum == -nums[i]) {
          res.add(List.of(nums[i], nums[j], nums[k]));
          j++;
          while(nums[j] == nums[j - 1] && j < k) j++;
        }
        else if(sum < -nums[i]) j++;
        else k--;
      }
    }
    return res;
  }
}
