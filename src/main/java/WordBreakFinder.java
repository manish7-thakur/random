import java.util.*;

public class WordBreakFinder {
  static public List<String> wordBreak(String s, List<String> wordDict) {
    Set<String> set = new HashSet<>(wordDict);
    ArrayList<String>[][] mem = new ArrayList[s.length() + 1][s.length() + 1];
    //findWords(s, 0, s.length(), "", res, set);
    List<String> res = findWords(s, 0, s.length(), set, mem);
    return res;
  }

  static void findWords(String s, int l, int h, String curr, List<String> res, Set<String> wordSet) {
    if(l >= h) {
      res.add(curr.trim());
      return;
    }
    for(int i = l + 1; i <= h; i++) {
      String prefix = s.substring(l, i);
      if(wordSet.contains(prefix)) {
        findWords(s, i, h, curr + " " + prefix, res, wordSet);
      }
    }
  }

  static List<String> findWords(String s, int l, int h, Set<String> wordSet, List<String>[][] mem) {
    if(l >= h) {
      return Arrays.asList("");
    }
    if(mem[l][h] != null) {
      System.out.println("Reading from mem " + l +": " + h);
      return mem[l][h];
    }
    List<String> list = new ArrayList<>();
    for(int i = l + 1; i <= h; i++) {
      String prefix = s.substring(l, i);
      if(wordSet.contains(prefix)) {
        List<String> clist = findWords(s, i, h, wordSet, mem);
        for(String str: clist) {
          list.add((prefix + " " + str).trim());
        }
      }
    }
    mem[l][h] = list;
    return list;
  }
}
