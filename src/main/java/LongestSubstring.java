import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static String nonRepeatingSubstring(String str) {
        Map<Character, Integer> idxMap = new HashMap<>(str.length());
        String res = "";
        int l = 0;
        for (int r = 0; r < str.length(); r++) {
            char c = str.charAt(r);
            int idx = idxMap.getOrDefault(c, -1);
            if (idx == -1) {
                if (str.substring(l, r + 1).length() > res.length()) {
                    res = str.substring(l, r + 1);
                }
            } else {
                while (l < idx + 1) {
                    idxMap.remove(str.charAt(l));
                    l++;
                }
            }
            idxMap.put(c, r);
        }
        return res;
    }
}