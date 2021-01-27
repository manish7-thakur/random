public class LongestPalindromicSubsequence {
    public static int find(String s, int i) {
        return findNow(s, 0, i);
    }

    static int findNow(String s, int i, int j) {
        if (i == j) {
            return 1;
        }
        if (i > j) {
            return 0;
        }
        if (s.charAt(i) == s.charAt(j)) {
            return 2 + findNow(s, i + 1, j - 1);
        }
        return Math.max(findNow(s, i, j - 1), findNow(s, i + 1, j));
    }
}