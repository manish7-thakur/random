import java.util.*;
public class FirstMissingPositiveFinder {
  public static int find(int[] nums) {
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != i+1) {
        int curr = nums[nums[i]-1];
        nums[nums[i]-1] = nums[i];
        nums[i] = 0;
        while(curr > 0 && curr <= nums.length && nums[curr - 1] != curr) {
          int temp = nums[curr - 1];
          nums[curr - 1] = curr;
          curr = temp;
        }
      } else if(nums[i] < 0 || nums[i] > nums.length) {
        nums[i] = 0;
      }
    }
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] == 0) {
        return i + 1;
      }
    }
    return nums.length + 1;
  }
}
