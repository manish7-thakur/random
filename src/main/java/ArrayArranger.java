
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
    static public void merge(int[] a, int m, int[] b, int n) {
      int i = 0, j = 0;
      while(j < n) {
        a[i] = b[j];
        i++;
        j++;
      }
    }
}
