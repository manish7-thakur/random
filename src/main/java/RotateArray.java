public class RotateArray {
    public static int[] reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static int[] rotate(int[] arr, int times) {
        reverse(arr, 0, times - 1);
        reverse(arr, times, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        return arr;
    }
}