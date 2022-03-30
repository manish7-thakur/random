import java.util.*;

public class StringMania {
  public static int lengthOfLongestSubstring(String s) {
    int res = 0, r = 0, l = 0;
    Map<Character, Integer> map = new HashMap<>();
    while(r < s.length()) {
      int count = map.merge(s.charAt(r), 1, Integer::sum);
      while(count > 1) {
        map.computeIfPresent(s.charAt(l), (k, v) -> v - 1);
        if(s.charAt(l) == s.charAt(r)) count--;
        l++;
      }
      r++;
      int newlen = r - l;
      if(newlen > res) res = newlen;
    }
    return res;
  }
}
