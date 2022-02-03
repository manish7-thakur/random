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

    static public int maxProfit(int[] prices) {
      int res = 0;
      int min = prices[0];
      for(int i = 1; i < prices.length; i++) {
        int curr = prices[i] - min;
        if(curr > res) res = curr;
        if(prices[i] < min) min = prices[i];
      }
      return res;
    }
}
