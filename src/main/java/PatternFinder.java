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

    static boolean findWithGap(String text, String pat, int i, int j) {
        if(j == -1) {
            return true;
        }
        if(i == -1) {
          return pat.charAt(j) == '*';
        }
        if(pat.charAt(j) == text.charAt(i)) {
            return findWithGap(text, pat, i -1, j-1);
        }
        if(pat.charAt(j) == '*') {
            return findWithGap(text, pat, i-1, j-1) || findWithGap(text, pat, i-1,j);
        }
        return false;
    }
}