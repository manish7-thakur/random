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
        if (set[i] > t) {
            return isPresent(set, t, k, i - 1);
        }
        return isPresent(set, t - set[i], k - 1, i - 1) || isPresent(set, t, k, i - 1);
    }

    public static int countWithSumLessOrEqualRec(double[] set, double t, int k) {
        Counter counter = new Counter();
        countWithSumLessOrEqual(set, t, k, set.length - 1, counter);
        return counter.getCount();
    }

    static class Counter {
        private int count;

        public void inc() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    static void countWithSumLessOrEqual(double[] set, double t, int k, int i, Counter counter) {
        if (i < 0) {
            return;
        }
        if (k <= 0) {
            return;
        }
        if (set[i] <= t && k == 1) {
            counter.inc();
            return;
        }
        if (set[i] > t) {
            countWithSumLessOrEqual(set, t, k, i - 1, counter);
        }
        countWithSumLessOrEqual(set, t - set[i], k - 1, i - 1, counter);
        countWithSumLessOrEqual(set, t, k, i - 1, counter);
    }
}