import java.util.*;

public class FirstNonRepeatingChar {
    public static int findFirst(String s) {
        int[] occMap = new int[26];
        Map<Character, Integer> idxMap = new HashMap(s.length());
        for (int i = 0; i < s.length(); i++) {
            occMap[s.charAt(i) - 'a']++;
            if (!idxMap.containsKey(s.charAt(i))) {
                idxMap.put(s.charAt(i), i);
            }
        }
        int i = 0;
        for (; i < occMap.length && occMap[i] != 1; i++) ;
        if (i >= occMap.length) {
            return -1;
        } else {
            return idxMap.get((char) ('a' + i));
        }
    }
}