import java.util.*;
public class TrapRainWaterCalc {
  public static int calc(int[] height) {
    int res = 0;
    for(int i = 1; i < height.length - 1; i++) {
      int leftMax = 0;
      int rightMax = 0;
      for(int j = i-1; j>= 0; j--) {
        leftMax = Math.max(leftMax, height[j]);
      }
      for(int j = i+1; j < height.length; j++) {
        rightMax = Math.max(rightMax, height[j]);
      }
      int value = Math.min(leftMax, rightMax) - height[i];
      if(value > 0) {
        res += value;
      }
    }
    return res;
  }

  public static int calcDp(int[] height) {
    int res = 0;
    if(height.length == 0) {
      return 0;
    }
    int[] leftArr = new int[height.length];
    int[] rightArr = new int[height.length];
    leftArr[0] = height[0];
    for(int i = 1; i < height.length; i++) {
      leftArr[i] = Math.max(height[i], leftArr[i-1]);
    }
    rightArr[height.length-1] = height[height.length-1];
    for(int i = height.length - 2; i >= 0; i--) {
      rightArr[i] = Math.max(height[i], rightArr[i+1]);
    }
    for(int i = 0; i < height.length; i++) {
      res += Math.min(leftArr[i], rightArr[i]) - height[i];
    }
    return res;
  }

  public static int calc2Pointer(int[] height) {
    if(height.length == 0) {
      return 0;
    }
    int left = 0;
    int right = height.length - 1;
    int leftMax = height[left];
    int rightMax = height[right];
    int res = 0;
    while(left < right) {
      if(leftMax <= rightMax) {
        res += leftMax - height[left];
        left++;
        if(height[left] > leftMax) {
          leftMax = height[left];
        }
      } else {
        res += rightMax - height[right];
        right--;
        if(height[right] > rightMax) {
          rightMax = height[right];
        }
      }
    }
    return res;
  }
}
