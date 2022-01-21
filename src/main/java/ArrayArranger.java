
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
      if(k == 0) return;
      int h = nums.length - (k + 1);
      int l = 0, m = h + 1;
      while(l < h) {
        swap(nums, l, h);
        l++;
        h--;
      }
      h = nums.length - 1;
      while(m < h) {
        swap(nums, m, h);
        m++;
        h--;
      }
      l = 0;
      h = nums.length - 1;
      while(l < h) {
        swap(nums, l, h);
        l++;
        h--;
      }
    }
}
