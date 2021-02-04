import java.util.Arrays;

public class KSetWithSumTFinder {
    public static boolean isPresent(double[] set, double t, int k) {
        if (set.length == 0) {
            return false;
        }
        Arrays.sort(set);
        double sum = 0;
        int i = 0;
        for (; i < k - 1; i++) {
            if (sum + set[i] < t) {
                sum += set[i];
            } else {
                return false;
            }
        }
        while (i < set.length) {
            if (Arrays.binarySearch(set, i, set.length, t - sum) >= 0) {
                return true;
            }
            sum -= set[i - k + 1];
            sum += set[i];
            if (sum >= t) {
                return false;
            }
            i++;
        }
        return false;
    }
}