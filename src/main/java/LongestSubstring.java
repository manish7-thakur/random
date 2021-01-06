import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static String nonRepeatingSubstring(String str) {
        Map<Character, Integer> occMap = new HashMap<>();
        String res = "";
        int l = 0;
        for (int r = 0; r < str.length(); r++) {
            char c = str.charAt(r);
            int occ = occMap.getOrDefault(c, 0);
            if (occMap.containsKey(c)) {
                if (str.substring(l, r).length() > res.length()) {
                    res = str.substring(l, r);
                }
                l++;
            } else {
                if (str.substring(l, r).length() > res.length()) {
                    res = str.substring(l, r + 2);
                }
                occMap.put(c, ++occ);
            }
        }
        return res;
    }
}