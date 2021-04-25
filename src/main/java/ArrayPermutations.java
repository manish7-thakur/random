import java.util.ArrayList;

public class ArrayPermutations {
    static ArrayList<String> permutate(char[] arr, int l) {
        ArrayList<String> permutations = new ArrayList<>();
        find(arr, new char[l], 0, 0, l, permutations);
        return permutations;
    }

    static void find(char[] arr, char[] per, int i, int p, int l, ArrayList<String> permutations) {
        if (p >= l) {
            permutations.add(new String(per));
            return;
        }
        if (i >= arr.length) {
            return;
        }
        per[p] = arr[i];
        find(arr, per, i + 1, p + 1, l, permutations);
        find(arr, per, i + 1, p, l, permutations);
    }
}