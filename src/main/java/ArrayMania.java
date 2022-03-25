import java.util.*;
import static java.util.stream.Collectors.*;
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
    return Arrays.stream(nums).reduce(0, (r, v) -> Integer.max(r, longestConsecutiveRec(v, mem)));
  }
  static int longestConsecutiveRec(int n, Map<Integer, Integer> mem) {
    if(!mem.containsKey(n)) return 0;
    return mem.computeIfAbsent(n, k -> 1 + longestConsecutiveRec(n + 1, mem));
  }
  static int[][] insertInterval(int[][] intervals, int[] newInterval) {
    List<int[]> res = new ArrayList<>();
    int i = 0;
    while(i < intervals.length && newInterval[0] > intervals[i][1]) {
      res.add(intervals[i]);
      i++;
    }
    while(i < intervals.length && newInterval[1] >= intervals[i][0]) {
      newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
      newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
      i++;
    }
    res.add(newInterval);
    while(i < intervals.length) {
      res.add(intervals[i]);
      i++;
    }
    int[][] resArr = new int[res.size()][2];
    for(int j = 0; j < resArr.length; j++) {
      resArr[j] = res.get(j);
    }
    return resArr;
  }
  static public int[][] merge(int[][] intervals) {
    List<int[]> list = new ArrayList<>();
    Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
    list.add(intervals[0]);
    for(int i = 1; i < intervals.length; i++) {
      int[] top = list.get(list.size() - 1);
      if(top[1] >= intervals[i][0]) {
        top[0] = Math.min(top[0], intervals[i][0]);
        top[1] = Math.max(top[1], intervals[i][1]);
      } else list.add(intervals[i]);
    }
    int[][] res = new int[list.size()][2];
    for(int i = 0; i < list.size(); i++) {
      res[i] = list.get(i);
    }
    return res;
  }
  static public int eraseOverlapIntervals(int[][] intervals) {
    int res = 0;
    Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[1]));
    int[] previous = intervals[0];
    for(int i = 1; i < intervals.length; i++) {
      if(previous[1] > intervals[i][0]) res++;
      else previous = intervals[i];
    }
    return res;
  }
  static public void setZeroes(int[][] matrix) {
    boolean firstColumnZero = false;
    for(int r = 0 ; r < matrix.length; r++) {
      for(int c = 0; c < matrix[0].length; c++) {
        if(c == 0 && matrix[r][c] == 0) firstColumnZero = true;
        else if(matrix[r][c] == 0) {
          matrix[0][c] = 0;
          matrix[r][0] = 0;
        }
      }
    }
    for(int c = 1; c < matrix[0].length; c++) {
      if(matrix[0][c] == 0) {
        for(int r = 1; r < matrix.length; r++) matrix[r][c] = 0;
      }
    }
    for(int r = 0; r < matrix.length; r++) {
      if(matrix[r][0] == 0) Arrays.fill(matrix[r], 0);
    }
    if(firstColumnZero) {
      for(int r = 0; r < matrix.length; r++) matrix[r][0] = 0;
    }
  }
}
