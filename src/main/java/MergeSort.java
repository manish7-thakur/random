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
      int[] res = new int[nums.length];
      int i = firstPositive(nums);
      int j = i - 1, r = 0;
      while(j >= 0 && i < nums.length) {
        int numI = nums[i] * nums[i];
        int numJ = nums[j] * nums[j];
        if(numI < numJ) {
          res[r] = numI;
          i++;
        } else {
          res[r] = numJ;
          j--;
        }
        r++;
      }
      while(j >= 0) {
        res[r] = nums[j] * nums[j];
        j--;
        r++;
      }
      while(i < nums.length) {
        res[r] = nums[i] * nums[i];
        i++;
        r++;
      }
      return res;
    }
    static public int firstPositive(int[] nums) {
      int l = 0, h = nums.length;
      while(l < h) {
        int mid = (l + h) / 2;
        if(nums[mid] < 0) l = mid + 1;
        else h = mid;
      }
      return l;
    }
}
