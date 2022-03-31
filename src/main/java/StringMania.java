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
  public static int characterReplacement(String s, int k) {
    int l = 0, res = 0, highestFrequency = 0;
    Map<Character, Integer> map = new HashMap<>();
    for(int r = 0; r < s.length(); r++) {
      int count = map.merge(s.charAt(r), 1, Integer::sum);
      if(count > highestFrequency) highestFrequency = count;
      int currlen = r - l + 1;
      int otherChars = currlen - highestFrequency;
      if(otherChars > k) {
        map.compute(s.charAt(l), (c, v) -> --v);
        l++;
      } else if(currlen > res) res = currlen;
    }
    return res;
  }
}
