public class Quicksort {
    static void sort(int[] arr, int l, int h) {
        while (l < h) {
            int p = partition(arr, l, h);
            if (p < Math.floor((l + h) / 2)) {
                sort(arr, l, p - 1);
                l = p + 1;
            } else {
                sort(arr, p + 1, h);
                h = p - 1;
            }
        }
    }

    static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int pos = 0;
        for (int i = 1; i <= h; i++) {
            if (arr[i] <= pivot) {
                pos++;
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[pos];
        arr[pos] = pivot;
        arr[l] = temp;
        return pos;
    }
}