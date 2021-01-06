import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static String nonRepeatingSubstring(String str) {
        int strLen = str.length();
        Map<Character, Integer> idxMap = new HashMap<>(strLen);
        String res = "";
        int l = 0;
        for (int r = 0; r < strLen; r++) {
            char c = str.charAt(r);
            int idx = idxMap.getOrDefault(c, -1);
            if (idx == -1) {
                String currStr = str.substring(l, r + 1);
                if (currStr.length() > res.length()) {
                    res = currStr;
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