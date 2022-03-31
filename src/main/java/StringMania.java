import java.util.*;
import static java.util.stream.Collectors.*;

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
  public static String minWindow(String s, String t) {
    String res = "";
    int l = 0, count = 0;
    Map<Character, Integer> tmap = new HashMap<>();
    for(int i = 0; i < t.length(); i++) tmap.merge(t.charAt(i), 1, Integer::sum);
    for(int r = 0; r < s.length(); r++) {
      Integer value = tmap.computeIfPresent(s.charAt(r), (k, v) -> --v);
      if(value != null && value >= 0) count++;
      while(count == t.length()) {
        int newlen = r - l + 1;
        if(newlen < res.length() || res.isEmpty()) res = s.substring(l, r + 1);
        Integer newCount = tmap.computeIfPresent(s.charAt(l), (k, v) -> ++v);
        if(newCount != null && newCount > 0) count--;
        l++;
      }
    }
    return res;
  }

  static boolean isAnagram(String s, String t) {
    int[] map = new int[26];
    for(int i = 0; i < t.length(); i++) map[t.charAt(i) - 'a']++;
    for(int i = 0; i < s.length(); i++) {
      if(--map[s.charAt(i) - 'a'] < 0) return false;
    }
    for(int i : map) {
      if(i != 0) return false;
    }
    return true;
  }

  static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = Arrays.stream(strs).collect(groupingBy(str -> getKey(str), toList()));
    List<List<String>> res = new ArrayList<>(map.values());
    return res;
  }
  static String getKey(String str) {
    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    return new String(arr);
  }
}
