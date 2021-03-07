public class InversionCounter {

    static int count(int[] arr) {
        return countNow(arr, 0, arr.length - 1);
    }

    static int countNow(int[] arr, int l, int h) {
        if (l >= h) {
            return 0;
        }
        int m = (l + h) / 2;
        int left = countNow(arr, l, m);
        int right = countNow(arr, m + 1, h);
        return mergeCount(arr, l, m, h) + left + right;
    }

    static int mergeCount(int[] arr, int l, int m, int h) {
        int invCount = 0;
        int leftSize = m - l + 1;
        int[] merged = new int[h - l + 1];
        int iIterMirror = 0; // same as i but starting at 0 to keep track of i incrementation
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= h) {
            if (arr[i] <= arr[j]) {
                merged[k] = arr[i];
                i++;
                iIterMirror++;
            } else {
                merged[k] = arr[j];
                invCount += leftSize - iIterMirror;
                j++;
            }
            k++;
        }
        while (i <= m) {
            merged[k] = arr[i];
            k++;
            i++;
        }
        while (j <= h) {
            merged[k] = arr[j];
            j++;
            i++;
        }
        k = 0;
        for (i = l; i <= h; i++) {
            arr[i] = merged[k++];
        }
        return invCount;
    }
}
