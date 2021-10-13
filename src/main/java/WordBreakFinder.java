import java.util.*;

public class WordBreakFinder {
  static public List<String> wordBreak(String s, List<String> wordDict) {
    List<String> res = new ArrayList<>();
    Set<String> set = new HashSet<>(wordDict);
    List<String> curr = new ArrayList();
    findWords(s, 0, s.length(), curr, res, set);
    return res;
  }

  static boolean findWords(String s, int l, int h, List<String> curr, List<String> res, Set<String> wordSet) {
    if(l >= h) {
      return true;
    }
    for(int i = l + 1; i <= h; i++) {
      if(wordSet.contains(s.substring(l, i))) {
        curr.add(s.substring(l, i));
        if(findWords(s, i, h, curr, res, wordSet)) {
          if(!s.substring(i, h).isEmpty()) curr.add(s.substring(i, h));
          addResult(res, curr);
        } else {
          curr.remove(curr.size() - 1);
        }
        curr.remove(s.substring(l, i));
      }
    }
    return false;
  }
  static void addResult(List<String> res, List<String> curr) {
    StringBuilder b = new StringBuilder();
    for(int i = 0; i < curr.size(); i++) {
      b.append(curr.get(i));
      if(i + 1 < curr.size()) b.append(" ");
    }
    res.add(b.toString());
  }
}
