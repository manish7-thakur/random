public class DigitSplitter {
    public static int[] split(int i) {
        int[] arr = new int[String.valueOf(i).length()];
        int pos = arr.length - 1;
        while (i > 0) {
            arr[pos] = i % 10;
            i = i / 10;
            pos--;
        }
        return arr;
    }
}
