public class InsertAndMergeHybridSorter {
    static void merge(int[] arr, int l, int m, int n) {
        int[] merged = new int[n - l];
        int i = l;
        int j = m;
        int k = 0;
        while (i < m && j < n) {
            if (arr[i] < arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            merged[k] = arr[i];
            i++;
            k++;
        }
        while (j < n) {
            merged[k] = arr[j];
            j++;
            k++;
        }
        for (i = l, k = 0; i < n && k < merged.length; i++, k++) {
            arr[i] = merged[k];
        }
    }
}