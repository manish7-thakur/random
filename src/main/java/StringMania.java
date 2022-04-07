import java.util.*;
import java.util.stream.Collectors;

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
    Map<String, List<String>> map = Arrays.stream(strs).collect(groupingBy(StringMania::getKey, toList()));
    return new ArrayList<>(map.values());
  }
  static String getKey(String str) {
    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    return new String(arr);
  }
  static boolean isPalindrome(String s) {
    StringBuilder b = new StringBuilder(s.length());
    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if(Character.isDigit(c) || Character.isAlphabetic(c)) b.append(Character.toLowerCase(c));
    }
    s = b.toString();
    int l = 0, r = s.length() - 1;
    while(l <= r) {
      if(s.charAt(l) != s.charAt(r)) return false;
      l++;
      r--;
    }
    return true;
  }
  static String longestPalindrome(String s) {
    String[][] mem = new String[s.length()][s.length()];
    return longestPalindromeRec(s, 0, s.length() - 1, mem);
  }

  static String longestPalindromeRec(String s, int l, int h, String[][] mem) {
    if(mem[l][h] != null) return mem[l][h];
    if(isPalindrome(s, l, h)) return s.substring(l, h + 1);
    String s1 = longestPalindromeRec(s, l + 1, h, mem);
    String s2 = longestPalindromeRec(s, l, h - 1, mem);
    if(s1.length() > s2.length()) mem[l][h] = s1;
    else mem[l][h] = s2;
    return mem[l][h];
  }
  static boolean isPalindrome(String s, int l, int h) {
    while(l <= h) {
      if(s.charAt(l) != s.charAt(h)) return false;
      l++;
      h--;
    }
    return true;
  }

  static int countPalindromicSubstrings(String s) {
    int count = 0;
    Integer[][] mem = new Integer[s.length()][s.length()];
    for(int i = 0; i < s.length(); i++) {
      for(int j = i; j < s.length(); j++) {
        count += countPalindromicSubstringsRec(s, i, j, mem);
      }
    }
    return count;
  }
  static int countPalindromicSubstringsRec(String s, int l, int h, Integer[][] mem) {
    if(l >= h) return 1;
    if(mem[l][h] != null) return mem[l][h];
    int count = s.charAt(l) != s.charAt(h) ? 0 : countPalindromicSubstringsRec(s, l + 1, h - 1, mem);
    mem[l][h] = count;
    return count;
  }

}