public class DuplicateFinder {
    static public int find(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                int curr = arr[i];
                int ridx = arr[i] - 1; // Storing this value is imp, try inlining to see bug
                if (curr == arr[ridx]) {
                    return curr;
                }
                arr[i] = arr[ridx];
                arr[ridx] = curr;
            }
        }
        return -1;
    }
}