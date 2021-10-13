import java.util.*;

public class WordBreakFinder {
  static public List<String> wordBreak(String s, List<String> wordDict) {
    List<String> res = new ArrayList<>();
    Set<String> set = new HashSet<>(wordDict);
    findWords(s, 0, s.length(), res, set);
    return res;
  }

  static void findWords(String s, int l, int h, List<String> res, Set<String> wordSet) {
    if(wordSet.contains(s.substring(l, h))) {
      res.add(s.substring(l, h));
    }
  }
}
