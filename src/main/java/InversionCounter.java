public class InversionCounter {
    static int mergeCount(int[] arr, int l, int m, int h) {
        int invCount = 0;
        int[] merged = new int[h - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= h) {
            if (arr[i] <= arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                invCount += m - l + 1 - i;
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
        return invCount;
    }
}
