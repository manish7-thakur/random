import java.util.*;

public class StringMania {
  public static int lengthOfLongestSubstring(String s) {
    int res = 0, r = 0, l = 0;
    Set<Character> set = new HashSet<>();
    while(r < s.length()) {
      boolean changed = set.add(s.charAt(r));
      if(!changed) {
        while(s.charAt(l) != s.charAt(r)) {
          set.remove(s.charAt(l));
          l++;
        }
        l++;
      }
      r++;
      int newlen = r - l;
      if(newlen > res) res = newlen;
    }
    return res;
  }
}
