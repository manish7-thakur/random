import java.util.*;

public class StringMania {
  public static int lengthOfLongestSubstring(String s) {
    int res = 1, l = 0, r = 0;
    Map<Character, Integer> map = new HashMap<>();
    while(l < s.length()) {
      int count = map.merge(s.charAt(l), 1, Integer::sum);
      while(count > 1) {
        map.computeIfPresent(s.charAt(r), (k, v) -> v - 1);
        if(s.charAt(r) == s.charAt(l)) count--;
        r++;
      }
      l++;
      int newlen = l - r;
      if(newlen > res) res = newlen;
    }
    return res;
  }
}
