import java.util.*;
public class FirstMissingPositiveFinder {
  public static int find(int[] nums) {
    int arrLen = nums.length;
    for(int i = 0; i < arrLen; i++) {
        int curr = nums[i];
        nums[i] = 0;
        while(curr > 0 && curr <= arrLen && nums[curr - 1] != curr) {
          int temp = nums[curr - 1];
          nums[curr - 1] = curr;
          curr = temp;
        }
    }
    for(int i = 0; i < arrLen; i++) {
      if(nums[i] == 0) {
        return i + 1;
      }
    }
    return arrLen + 1;
  }
}
