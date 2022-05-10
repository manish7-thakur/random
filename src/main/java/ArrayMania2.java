import java.util.*;
import java.util.function.Function;
import static java.util.stream.Collectors.*;

public class ArrayMania2 {
  /**
   * Arrange elements in such a way that in any pair of 3 the middle element greater than both left & right
   * 7,5,3,6,2,4 -> 5<=7>=3<=6>=2<=4
   */
    public static int[] arrange(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 != 0) {
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rotate(int[] nums, int k) {
       k = k % nums.length;
       int m = nums.length - (k + 1);
       reverse(nums, 0, m);
       reverse(nums, m + 1, nums.length - 1);
       reverse(nums, 0, nums.length - 1);
    }
    static void reverse(int[] nums, int start, int end) {
      while(start < end) {
        swap(nums, start, end);
        start++;
        end--;
      }
    }
    static public int maxSubArray(int[] nums) {
      int currSum = 0;
      int res = Integer.MIN_VALUE;

      for(int i = 0; i < nums.length; i++) {
        currSum += nums[i];
        if(currSum > res) res = currSum;
        if(currSum < 0) currSum = 0;
      }
      return res;
    }
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i = m - 1, j = n - 1, k = m + n - 1;
      while(i >= 0 && j >= 0) {
        if(nums1[i] > nums2[j]) {
          nums1[k] = nums1[i];
          i--;
        } else {
          nums1[k] = nums2[j];
          j--;
        }
        k--;
      }
      while(j >= 0) {
        nums1[k] = nums2[j];
        k--;
        j--;
      }
    }
    public static List<Integer> intersect(int[] a, int[] b) {
      int[] arr;
      Map<Integer, Integer> occMap = new HashMap<>();
      if(a.length > b.length) {
        arr = a;
        Arrays.stream(b).forEach(e -> occMap.merge(e, 1, Integer::sum));
      } else {
        arr = b;
        Arrays.stream(a).forEach(e -> occMap.merge(e, 1, Integer::sum));
      }
      List<Integer> interList = new ArrayList<>();
      Arrays.stream(arr).forEach(e -> occMap.computeIfPresent(e, (k, v) -> {
          interList.add(e);
          return --v == 0 ? null: v;
        }));
      return interList;
    }

    static public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> res = new ArrayList<>();
      for(int r = 0; r < numRows; r++) {
        List<Integer> curr = new ArrayList<>();
        for(int c = 0; c <= r; c++) {
          if(c == 0 || c == r) curr.add(1); // first & last element at each row is always 1
          else {
            List<Integer> previousRow = res.get(r - 1);
            curr.add(previousRow.get(c - 1) + previousRow.get(c));
          }
        }
        res.add(curr);
      }
      return res;
    }
    static boolean searchMatrix(int[][] matrix, int target) {
      int r = 0, c = matrix[0].length - 1;
      while(r < matrix.length) {
        int[] row = matrix[r];
        if(row[c] == target) return true;
        else if(row[c] > target) return binarySearch(row, target);
        r++;
      }
      return false;
    }
    static boolean binarySearch(int[] row, int target) {
      int l = 0, h = row.length - 1;
      while(l <= h) {
        int m = (l + h) / 2;
        if(target == row[m]) return true;
        else if(target < row[m]) h = m - 1;
        else l = m + 1;
      }
      return false;
    }
    static boolean canConstruct(String ransomNote, String magazine) {
      int[] map = new int[26];
      for(char c : magazine.toCharArray()) map[c - 'a']++;
      for(char c : ransomNote.toCharArray()) {
        if(--map[c - 'a'] < 0) return false;
      }
      return true;
    }

  static public int[] productExceptSelf(int[] nums) {
      int[] res = new int[nums.length];
      int prefix = nums[0];
      res[0] = 1;
      for(int i = 1; i < nums.length; i++) {
        res[i] = prefix;
        prefix *= nums[i];
      }
      prefix = nums[nums.length - 1];
      for(int i = nums.length - 2; i >= 0; i--) {
        res[i] *= prefix;
        prefix *= nums[i];
      }
      return res;
    }

    static public int maxProduct(int[] nums) {
      int res = nums[0];
      int pMax = 1;
      int pMin = 1;
      for(int i = 0; i < nums.length; i++) {
        int p1 = nums[i] * pMax;
        int p2 = nums[i] * pMin;
        pMax = Math.max(p1, Math.max(nums[i], p2));
        pMin = Math.min(p1, Math.min(nums[i], p2));
        res = Math.max(res, pMax);
      }
      return res;
    }
    static public int findMinInRotatedSortedArray(int[] nums) {
      int l = 0, h = nums.length - 1;
      while(l < h) {
        int m = (l + h) / 2;
        if(nums[m] > nums[h]) l = m + 1;
        else h = m;
      }
      return nums[l];
    }
    static public int searchInRotatedSortedArray(int[] nums, int target) {
      int l = 0, h = nums.length - 1;
      while(l <= h) {
        int m = (l + h) / 2;
        if(nums[m] == target) return m;
        else if(nums[m] < nums[h]) {
          if(nums[m] < target && target <= nums[h]) l = m + 1;
          else h = m - 1;
        } else {
          if(nums[l] <= target && target < nums[m]) h = m - 1;
          else l = m + 1;
        }
      }
      return -1;
    }
    static int[] frequencySort(int[] nums) {
      record Pair(int val, int occ){}
      Map<Integer, Integer> map = Arrays.stream(nums).boxed().collect(groupingBy(Function.identity(), collectingAndThen(counting(), Long::intValue)));
      Queue<Pair> queue = new PriorityQueue<>((p1, p2) -> {
        if(p1.occ != p2.occ) return p1.occ - p2.occ;
        return p2.val - p1.val;
      });
      map.forEach((k, v) -> queue.add(new Pair(k, v)));
      int idx = 0;
      while(!queue.isEmpty()) {
        Pair p = queue.remove();
        for(int i = 0; i < p.occ; i++) {
          nums[idx] = p.val;
          idx++;
        }
      }
      return nums;
    }
    static int uniquePathsWithObstacles(int[][] obstacleGrid) {
      Integer[][] mem = new Integer[obstacleGrid.length][obstacleGrid[0].length];
      return uniquePathsWithObstacles(obstacleGrid, obstacleGrid.length - 1, obstacleGrid[0].length - 1, mem);
    }
    static int uniquePathsWithObstacles(int[][] obstacleGrid, int i, int j, Integer[][] mem) {
      if(i == 0 && j == 0) {
        if(obstacleGrid[i][j] == 1) return 0;
        return 1;
      }
      if(mem[i][j] != null) return mem[i][j];
      int paths = 0;
      if(i > 0 && obstacleGrid[i][j] != 1) paths += uniquePathsWithObstacles(obstacleGrid, i - 1, j, mem);
      if(j > 0 && obstacleGrid[i][j] != 1) paths += uniquePathsWithObstacles(obstacleGrid, i, j - 1, mem);
      mem[i][j] = paths;
      return paths;
    }
    static List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
      ArrayList<Integer> curr = new ArrayList<>();
      for(int i = 0; i <= nums.length; i++) {
        subsetsRec(nums, 0, curr, i, res);
      }
      return res;
    }
    static void subsetsRec(int[] nums, int start, List<Integer> curr, int len, List<List<Integer>> res) {
      if(curr.size() == len) {
        res.add(new ArrayList<>(curr));
        return;
      }
      for(int i = start; i < nums.length; i++) {
        curr.add(nums[i]);
        subsetsRec(nums, i + 1, curr, len, res);
        curr.remove(curr.size() - 1);
      }
    }
    static List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>> res = new ArrayList<>();
      List<Integer> curr = new ArrayList<>();
      combinationRecLoop(k, n, 1, res, curr);
      return res;
    }
    static void combinationRec(int k, int n, int num, List<List<Integer>> res, List<Integer> curr) {
      if(n == 0 && k == 0) {
        res.add(new ArrayList<>(curr));
        return;
      }
      if(k <= 0 || num < 1) return;
      if(num <= n) {
        curr.add(num);
        combinationRec(k - 1, n - num, num - 1, res, curr);
        curr.remove(curr.size() - 1);
      }
      combinationRec(k, n, num - 1, res, curr); //this creates loop
    }

    static void combinationRecLoop(int k, int n, int start, List<List<Integer>> res, List<Integer> curr) {
      if(k == 0 && n == 0) {
        res.add(new ArrayList<>(curr));
        return;
      }
      if(k < 0 || start > n) return; // to make it more efficient, made runtime to be zero millis
      for(int i = start; i < 10; i++) {
        if(i <= n) {
          curr.add(i);
          combinationRecLoop(k - 1, n - i, i + 1, res, curr);
          curr.remove(curr.size() - 1);
        }
      }
    }
    static List<List<Integer>> subsetsWithDup(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
      List<Integer> curr = new ArrayList<>();
      Arrays.sort(nums);
      for(int i = 0; i <= nums.length; i++) {
        subsetsWithDupRec(nums, 0, i, res, curr);
      }
      return res;
    }
    static void subsetsWithDupRec(int[] nums, int start, int len, List<List<Integer>> res, List<Integer> curr) {
      if(curr.size() == len) {
        res.add(new ArrayList<>(curr));
        return;
      }
      for(int i = start; i < nums.length; i++) {
          if(i == start || nums[i] != nums[i - 1]) { //can be written as if(i != start && nums[i] == nums[i-1]) continue;
          curr.add(nums[i]);
          subsetsWithDupRec(nums, i + 1, len, res, curr);
          curr.remove(curr.size() - 1);
        }
      }
    }

}
