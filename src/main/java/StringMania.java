import java.io.CharConversionException;
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
  static String sortChars(String s) {
    Queue<Character> charQ = new PriorityQueue<>((c1, c2) -> {
      if(Character.isLowerCase(c1) && !Character.isLowerCase(c2)) return -1;
      if(!Character.isLowerCase(c1) && Character.isLowerCase(c2)) return 1;
      return c1 - c2;
    });
    Queue<Integer> digitQ = new PriorityQueue<>((d1, d2) -> {
      if(d1 % 2 == 0 && d2 % 2 != 0) return -1;
      if(d1 % 2 != 0 && d2 %2 == 0) return 1;
      return  d1 - d2;
    });
    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if(Character.isDigit(c)) digitQ.add(Character.getNumericValue(c));
      else charQ.add(c);
    }
    StringBuilder b = new StringBuilder();
    while(!charQ.isEmpty()) b.append(charQ.remove());
    while(!digitQ.isEmpty()) b.append(digitQ.remove());
    return b.toString();
  }

  static String removeDuplicates(String s, int k) {
    record Pair(char c, int occ){}
    Stack<Pair> stack = new Stack<>();
    for(int i = 0; i < s.length(); i++) {
      if(!stack.isEmpty() && stack.peek().c == s.charAt(i)) {
        Pair p = stack.pop();
        stack.push(new Pair(p.c, p.occ + 1));
      } else stack.push(new Pair(s.charAt(i), 1));
      if(stack.peek().occ == k) stack.pop();
    }
    StringBuilder b = new StringBuilder();
    while(!stack.isEmpty()) {
      Pair p = stack.pop();
      b.append(String.valueOf(p.c).repeat(p.occ));
    }
    return b.reverse().toString();
  }

  static List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<>();
    if(digits.length() == 0) return res;
    Map<Character, String> map = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    combRec(digits, 0, "",res, map);
    return res;
  }
  static void combRec(String digits, int start, String curr, List<String> res, Map<Character, String> map) {
    if(curr.length() == digits.length()) {
      res.add(curr);
      return;
    }
    for(int i = start; i < digits.length(); i++) {
      String letters = map.get(digits.charAt(i));
      for(int j = 0; j < letters.length(); j++) {
        combRec(digits, i + 1, curr + letters.charAt(j), res, map);
      }
    }
  }
  static List<Integer> findAnagrams(String s, String p) {
    Map<Character, Integer> map = new HashMap<>();
    List<Integer> res = new ArrayList<>();
    for(int i = 0; i < p.length(); i++) map.merge(p.charAt(i), 1, Integer::sum);
    Map<Character, Integer> currMap = new HashMap<>(map);
    for(int l = 0; l < s.length(); l++) {
      for(int r = l; r < s.length(); r++) {
        char c = s.charAt(r);
        if(!currMap.containsKey(c)) {
          currMap = new HashMap<>(map);
          break;
        }
        currMap.computeIfPresent(c, (k, v) -> --v == 0 ? null : v);
        if(currMap.isEmpty()) res.add(l);
      }
    }
    return res;
  }
}
