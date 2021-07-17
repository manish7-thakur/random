public class TrapRainWaterCalc {
  public static int calc(int[] height) {
    int res = 0;
    for(int i = 0; i < height.length; i++) {
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
}
