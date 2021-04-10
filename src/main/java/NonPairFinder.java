import java.util.HashSet;
import java.util.Set;

public class NonPairFinder {
    public static Integer[] find(int[] arr) {
        Set<Integer> set = new HashSet<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                set.remove(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        Integer[] res = new Integer[set.size()];
        return set.toArray(res);
    }
}