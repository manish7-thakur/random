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
        char patFirstChar = pat.charAt(0);
        for(int i =0; i< text.length();i++) {
            if(patFirstChar == text.charAt(i)) {
                int k=0;
                int j = i;
                while(k < pat.length() && j < text.length()) {
                    if(pat.charAt(k) == text.charAt(j)) {
                        k++;
                        j++;
                    } else if(pat.charAt(k) == '*' && pat.charAt(k+1) == text.charAt(j)) {
                        k+=2;
                        j++;
                    } else if(pat.charAt(k) == '*' && pat.charAt(k+1) != text.charAt(j)) {
                        j++;
                    } else {
                        break;
                    }
                }
                if(k >= pat.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}