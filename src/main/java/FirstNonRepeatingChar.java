public class FirstNonRepeatingChar {
    public static int findFirst(String s) {
        int strLen = s.length();
        int[] occMap = new int[26];
        for (int i = 0, j = strLen - 1; i <= j; i++, j--) {
            if (i != j) {
                char c = s.charAt(i);
                occMap[c - 'a']++;
                c = s.charAt(j);
                occMap[c - 'a']++;
            } else {
                char c = s.charAt(i);
                occMap[c - 'a']++;
            }
        }

        for (int k = 0; k < strLen; k++) {
            char c = s.charAt(k);
            if (occMap[c - 'a'] == 1) {
                return k;
            }
        }
        return -1;
    }
}