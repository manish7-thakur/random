import java.util.*;

public class WordTransformer {
  static public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    List<List<String>> result = new ArrayList<>();
    List<String> input = new ArrayList<>();
    input.add(beginWord);
    Map<String, Boolean> map = new HashMap<>();
    Queue<List<String>> queue = new PriorityQueue<>(new Comparator<List<String>>(){
      @Override
      public int compare(List<String> l1, List<String> l2) {
        return l1.size() - l2.size();
      }
    });
    for(int i = 0; i < wordList.size(); i++) {
      map.put(wordList.get(i), false);
    }
    find(beginWord, endWord, input, queue, map);
    int minSize = 0;
    if(!queue.isEmpty()) {
      List<String> l = queue.remove();
      minSize = l.size();
      result.add(l);
    }
    while(!queue.isEmpty() && queue.peek().size() <= minSize) {
      result.add(queue.remove());
    }
    return result;
  }
  static void find(String beginWord, String endWord, List<String> input, Queue<List<String>> queue, Map<String, Boolean> map) {
    if(beginWord.equals(endWord)) {
      queue.add(new ArrayList<>(input));
      return;
    }
    for(Map.Entry<String, Boolean> e: map.entrySet()) {
      String s = e.getKey();
      if(!e.getValue() && isClose(beginWord, s)) {
        input.add(s);
        map.put(s, true);
        find(s, endWord, input, queue, map);
        input.remove(s);
        map.put(s, false);
      }
    }
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
