import java.util.*;

public class WordTransformer {
  static public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    List<List<String>> result = new ArrayList<>();
    List<String> input = new ArrayList<>();
    input.add(beginWord);
    Map<String, Boolean> map = new HashMap<>();
    for(int i = 0; i < wordList.size(); i++) {
      map.put(wordList.get(i), false);
    }
    find(beginWord, endWord, input, result, map);
    return result;
  }
  static boolean find(String beginWord, String endWord, List<String> input, List<List<String>> result, Map<String, Boolean> map) {
    if(isClose(beginWord, endWord)) {
      List<String> res = new ArrayList<>(input);
      res.add(endWord);
      result.add(res);
      return true;
    }
    for(Map.Entry<String, Boolean> e: map.entrySet()) {
      String s = e.getKey();
      if(!e.getValue() && isClose(beginWord, s)) {
        input.add(s);
        map.put(s, true);
        find(s, endWord, input, result, map);
        input.remove(s);
        map.put(s, false);
      }
    }
    return false;
  }
  static boolean isClose(String word1, String word2) {
    int count = 0;
    for(int i = 0; i < word1.length(); i++) {
      if(word1.charAt(i) != word2.charAt(i)) {
        count++;
        if(count > 1) return false;
      }
    }
    return true;
  }
}
