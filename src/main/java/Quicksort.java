public class Quicksort {
    static void sort(int[] arr, int l, int h) {
        if (l >= h) {
            return;
        }
        int p = partition(arr, l, h);
        sort(arr, l, p - 1);
        sort(arr, p + 1, h);
    }

    static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int pos = 0;
        for (int i = 1; i < arr.length; i++) {
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