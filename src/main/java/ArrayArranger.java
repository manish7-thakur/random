import java.util.*;

public class ArrayArranger {
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
    static boolean isAnagram(String s, String t) {
      int[] map = new int[26];
      for(char c : t.toCharArray()) map[c - 'a']++;
      for(char c : s.toCharArray()) {
        if(--map[c - 'a'] < 0) return false;
      }
      for(int i : map) {
        if(i != 0) return false;
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
        else if(nums[m] > target) {
          if(nums[h] > nums[m] && nums[h] >= target) h = m - 1;
          else if(nums[h] < nums[m] && nums[h] < target) h = m - 1;
          else l = m + 1;
        } else {
          if(nums[h] > nums[m] && nums[h] >= target) l = m + 1;
          else if(nums[h] > nums[m] && nums[h] < target) h = m - 1;
          else if(nums[l] < nums[m] && nums[l] < target) l = m + 1;
          else h = m - 1;
        }
      }
      return -1;
    }
}
