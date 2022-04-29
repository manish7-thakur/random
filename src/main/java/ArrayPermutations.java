import java.util.ArrayList;

public class ArrayPermutations {
    static ArrayList<String> permute(char[] arr, int l) {
        ArrayList<String> permutations = new ArrayList<>();
        find(arr, "", 0, l, permutations);
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

    static void find(char[] arr, String str, int start, int l, ArrayList<String> permutations) {
      if(str.length() == l) {
        permutations.add(str);
        return;
      }
      for(int i = start; i < arr.length; i++) {
        find(arr, str + arr[i], i + 1, l, permutations);
      }
    }

    static ArrayList<String> allCombinations(char[] arr) {
        ArrayList<String> res = new ArrayList<>();
        generateAll(arr, "", res);
        return res;
    }

    static void generateAll(char[] arr, String curr, ArrayList<String> res) {
        if (curr.length() >= arr.length) {
            res.add(curr);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            generateAll(arr, curr + arr[i], res);
        }
    }
}
