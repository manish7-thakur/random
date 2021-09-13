import java.util.*;

public class ScrambleString {
  static Map<String, Boolean> mem = new HashMap<>();

  static public boolean isScramble(String s1, String s2) {
    return isScramble(s1, s2, mem);
  }

  static public boolean isScramble(String s1, String s2, Map<String, Boolean> mem) {
    if (s1.equals(s2))
      return true;
    String key = s1 + s2;
    if(mem.containsKey(key)) {
      return mem.get(key);
    }
    int n = s1.length();
    for (int i = 1; i < n; i++) {
      boolean original = isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i));
      if(original) {
        mem.put(key, true);
        return true;
      }
      // great -> (divide) g / reat -> (swap) -> reat / g -> (compare) g && t && reat - rgea
      boolean flipCase = isScramble(s1.substring(0, i), s2.substring(n - i)) && isScramble(s1.substring(i), s2.substring(0, n - i));
      if(flipCase) {
        mem.put(key, true);
        return true;
      }
    }
    mem.put(key, false);
    return false;
  }
}
