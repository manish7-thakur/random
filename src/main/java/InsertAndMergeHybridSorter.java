public class InsertAndMergeHybridSorter {

    static void sort(int[] arr) {
        sortNow(arr, 0, arr.length);
    }

    static void sortNow(int[] arr, int l, int h) {
        if (h - l < 10) {
            InsertionSort.sortRec(arr, l, h - 1);
            return;
        }
        int m = (h + l) / 2;
        sortNow(arr, l, m);
        sortNow(arr, m, h);
        merge(arr, l, m, h);
    }

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