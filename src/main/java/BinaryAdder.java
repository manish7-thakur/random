public class BinaryAdder {
    static int[] add(int[] a, int[] b) {
        int carr = 0;
        int[] res = new int[b.length + 1];
        for (int i = a.length - 1; i >= 0; i--) {
            int sum = a[i] + b[i] + carr;
            res[i + 1] = sum % 2;
            if (sum >= 2) {
                carr = 1;
            } else {
                carr = 0;
            }
        }
        if (carr == 1) {
            res[0] = 1;
        }
        return res;
    }
}