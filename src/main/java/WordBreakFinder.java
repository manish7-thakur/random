import java.util.*;

public class WordBreakFinder {
  static public List<String> wordBreak(String s, List<String> wordDict) {
    List<String> res = new ArrayList<>();
    Set<String> set = new HashSet<>(wordDict);
    int[][] mem = new int[s.length() + 1][s.length() + 1];
    findWords(s, 0, s.length(), "", res, set, mem);
    return res;
  }

  static void findWords(String s, int l, int h, String curr, List<String> res, Set<String> wordSet, int[][] mem) {
    if(l >= h) {
      res.add(curr.trim());
      return;
    }
    for(int i = l + 1; i <= h; i++) {
      String prefix = s.substring(l, i);
      if(wordSet.contains(prefix)) {
        findWords(s, i, h, curr + " " + prefix, res, wordSet, mem);
      }
    }
  }
}
