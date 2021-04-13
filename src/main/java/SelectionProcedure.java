public class SelectionProcedure {
    static int findKthSmallest(int[] arr, int k) {
        return find(arr, 0, arr.length - 1, k);
    }

    static int find(int[] arr, int l, int h, int k) {
        // if (l > h) {
        //     return -1;
        // }
        while(l <= h) {
            int n = partition(arr, l, h);
            if (n == k) {
                return arr[k];
            } else if (n < k) {
                l = n+1;
            } else {
                h = n-1;
            }
        }
        return -1;
    }

    static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int pos = l;
        for (int i = l + 1; i <= h; i++) {
            if (arr[i] < pivot) {
                pos++;
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[pos];
        arr[pos] = temp;
        return pos;
    }
}