public class PatternFinder {
    /**
     * Find the first occ of pattern in the given text, all characters in the pattern must be unique
     */
    static int find(String text, String pat) {
        char patFirstChar = pat.charAt(0);
        for (int i = 0; i < text.length() - pat.length() + 1; i++) {
            if (patFirstChar == text.charAt(i)) {
                int k;
                for (k = 1; k < pat.length() && pat.charAt(k) == text.charAt(i + k); k++) ;
                if (k >= pat.length()) {
                    return i;
                }
                i += k - 1;
            }
        }
        return -1;
    }

    static int findWithGap(String text, String pat) {
        String[] strs = pat.split(":");
        int startIdx = 0;
        int ans = -1;
        for (int i = 0; i < strs.length; i++) {
            int pos = find(text, strs[i], startIdx);
            if (pos == -1) {
                return -1;
            }
            if (i == 0) {
                ans = pos;
            }
            startIdx = pos + strs[i].length();
        }
        return ans;
    }

    static int find(String text, String pat, int startIdx) {
        char patFirstChar = pat.charAt(0);
        for (int i = startIdx; i < text.length() - pat.length() + 1; i++) {
            if (patFirstChar == text.charAt(i)) {
                int k;
                for (k = 1; k < pat.length() && pat.charAt(k) == text.charAt(i + k); k++) ;
                if (k >= pat.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}