public class KthPermutationFinder {
    public static String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        return findPermFor(sb, n, k - 1);
    }

    private static String findPermFor(StringBuilder sb, int n, int k) {
        int[] factordicSeq = getFactoradicSeq(n, k);
        StringBuilder res = new StringBuilder(n);
        for (int idx : factordicSeq) {
            res.append(sb.charAt(idx));
            sb.deleteCharAt(idx);
        }
        return res.toString();
    }

    private static int[] getFactoradicSeq(int n, int k) {
        int[] seq = new int[n];
        int i = 1;
        while (k > 0) {
            seq[n - i] = k % i;
            k /= i;
            i++;
        }
        return seq;
    }
}
//https://medium.com/@aiswaryamathur/find-the-n-th-permutation-of-an-ordered-string-using-factorial-number-system-9c81e34ab0c8
