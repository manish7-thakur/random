public class MergeSort {
    static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    static void mergeSort(int[] arr, int l, int h) {
        if (l >= h) {
            return;
        }
        int m = (l + h) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, h);
        merge(arr, l, m, h);
    }

    static void merge(int[] arr, int l, int m, int h) {
        int[] a = new int[h - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= h) {
            if (arr[i] < arr[j]) {
                a[k] = arr[i];
                i++;
            } else {
                a[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
            a[k] = arr[i];
            i++;
            k++;
        }
        while (j <= h) {
            a[k] = arr[j];
            j++;
            k++;
        }
        k = 0;
        for (i = l; i <= h; i++) {
            arr[i] = a[k++];
        }
    }

    static public int[] sortedSquares(int[] nums) {
      int end = nums.length - 1;
      int[] res = new int[nums.length];
      int l = 0, r = end, ri = end;
      while(l <= r) {
        if(Math.abs(nums[l]) > nums[r]) {
          res[ri] = nums[l] * nums[l];
          l++;
        } else {
          res[ri] = nums[r] * nums[r];
          r--;
        }
        ri--;
      }
      return res;
    }
}
