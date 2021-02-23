public class InsertionSort {
    static void sortRec(int[] arr, int l, int h) {
        if (h <= l) {
            return;
        }
        sortRec(arr, l, h - 1);
        while (h > 0 && arr[h] < arr[h - 1]) {
            int temp = arr[h - 1];
            arr[h - 1] = arr[h];
            arr[h] = temp;
            h--;
        }
    }
}