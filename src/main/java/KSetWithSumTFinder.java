public class KSetWithSumTFinder {
    public static boolean isPresentRec(double[] set, double t, int k) {
        return isPresent(set, t, k, set.length - 1);
    }

    static boolean isPresent(double[] set, double t, int k, int i) {
        if (i < 0) {
            return false;
        }
        if (set[i] == t && k == 1) {
            return true;
        }
        return isPresent(set, t - set[i], k - 1, i - 1) || isPresent(set, t, k, i - 1);
    }
}