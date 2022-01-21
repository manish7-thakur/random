
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
}
