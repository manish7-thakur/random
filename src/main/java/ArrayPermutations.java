import java.util.*;

public class ArrayPermutations {
	static ArrayList<String> permutate(char[] arr, int l) {
		ArrayList<String> permutations = new ArrayList<>();
		return find(arr, new char[l], 0, 0, l, permutations);
	}

	static ArrayList<String> find(char[] arr, char[] per, int i, int p, int l, ArrayList<String> permutations) {
		if(p >=l) {
			permutations.add(new String(per));
			return permutations;
		}
		if(i >= arr.length) {
			return permutations;
		}
		per[p] = arr[i];
		find(arr, per, i + 1, p+1, l, permutations);
		find(arr, per, i + 1, p, l, permutations);
		return permutations;
	}
}