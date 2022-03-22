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
    int rows = heights.length;
    int columns = heights[0].length;
    var pacific = new boolean[rows][columns];
    var atlantic = new boolean[rows][columns];
    //going from oceans to cells, like flood problem
    for(int r = 0; r < rows; r++) {
        pacificAtlanticRec(heights, r, 0, heights[r][0], pacific);
        pacificAtlanticRec(heights, r, columns - 1, heights[r][columns - 1], atlantic);
    }
    for(int c = 0; c < columns; c++) {
        pacificAtlanticRec(heights, 0, c, heights[0][c], pacific);
        pacificAtlanticRec(heights, rows - 1, c, heights[rows - 1][c], atlantic);
    }
    for(int r = 0; r < rows; r++) {
      for(int c = 0; c < columns; c++) {
        if(pacific[r][c] && atlantic[r][c]) res.add(List.of(r, c));
      }
    }
    return res;
  }
  static void pacificAtlanticRec(int[][] heights, int i, int j, int currHeight, boolean[][] visited) {
    if(!safe(heights, i, j, currHeight, visited)) return;
    visited[i][j] = true;
    pacificAtlanticRec(heights, i - 1, j, heights[i][j], visited);
    pacificAtlanticRec(heights, i, j - 1, heights[i][j], visited);
    pacificAtlanticRec(heights, i + 1, j, heights[i][j], visited);
    pacificAtlanticRec(heights, i, j + 1, heights[i][j], visited);
  }
  static boolean safe(int[][] heights, int i, int j, int currHeight, boolean[][] visited) {
    return i >= 0 && j >= 0 && i < heights.length && j < heights[0].length && heights[i][j] >= currHeight && !visited[i][j]; //since we are moving from oceans to cells, inverted condition
  }

  static public int numIslands(char[][] grid) {
    int count = 0;
    var visited = new boolean[grid.length][grid[0].length];
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[0].length; j++) {
        if(grid[i][j] == '1' && !visited[i][j]) {
          numIslandsRec(grid, i, j, visited);
          count++;
        }
      }
    }
    return count;
  }
  static void numIslandsRec(char[][] grid, int i, int j, boolean[][] visited) {
    if(!safe(grid, i, j, visited)) return;
    visited[i][j] = true;
    numIslandsRec(grid, i - 1, j, visited);
    numIslandsRec(grid, i, j - 1, visited);
    numIslandsRec(grid, i + 1, j, visited);
    numIslandsRec(grid, i, j + 1, visited);
  }
  static boolean safe(char[][] grid, int i, int j, boolean[][] visited) {
    return i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == '1' && !visited[i][j];
  }
  static public int longestConsecutive(int[] nums) {
    Map<Integer, Integer> mem = new HashMap<>();
    for(int n : nums) mem.put(n, null);
    int res = 0;
    for(int n: nums) {
      int curr = longestConsecutiveRec(n, mem);
      if(curr > res) res = curr;
    }
    return res;
  }
  static int longestConsecutiveRec(int n, Map<Integer, Integer> mem) {
    if(!mem.containsKey(n)) return 0;
    mem.computeIfAbsent(n, k -> 1 + longestConsecutiveRec(n + 1, mem));
    return mem.get(n);
  }
}
