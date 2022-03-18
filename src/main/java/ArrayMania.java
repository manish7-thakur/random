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
  static public int maxArea(int[] height) {
    int res = 0, i = 0, j = height.length - 1;
    while(i < j) {
      int area = Math.min(height[i], height[j]) * (j - i);
      if(area > res) res = area;
      if(height[i] < height[j]) i++;
      else j--;
    }
    return res;
  }
  static public int missingNumber(int[] nums) {
    int total = (nums.length * (nums.length + 1)) / 2;
    int sum = Arrays.stream(nums).reduce(0, Integer::sum);
    return total - sum;
  }
  static public List<List<Integer>> pacificAtlantic(int[][] heights) {
    List<List<Integer>> res = new ArrayList<>();
    var visited = new boolean[heights.length][heights[0].length];
    for(int i = 0; i < heights.length; i++) {
      for (int j = 0; j < heights[0].length; j++) {
        if(pacificAtlanticRec(heights, i, j, heights[i][j], visited)) res.add(List.of(i, j));
      }
    }
    return res;
  }
  static boolean pacificAtlanticRec(int[][] heights, int i, int j, int currHeight, boolean[][] visited) {
    if(end(heights, i, j)) return true;
    if(heights[i][j] > currHeight || visited[i][j]) return false;
    visited[i][j] = true;
    boolean pacific = pacificAtlanticRec(heights, i - 1, j, heights[i][j], visited) || pacificAtlanticRec(heights, i, j - 1, heights[i][j], visited);
    boolean atlantic = pacificAtlanticRec(heights, i + 1, j, heights[i][j], visited) || pacificAtlanticRec(heights, i, j + 1, heights[i][j], visited);
    visited[i][j] = false;
    return pacific && atlantic;
  }
  static boolean end(int[][] heights, int i, int j) {
    return i < 0 || j < 0 || i >= heights.length || j >= heights[0].length;
  }
}
