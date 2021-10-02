import java.util.*;

public class WordTransformer {
  static public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    List<List<String>> result = new ArrayList<>();
    List<String> input = new ArrayList<>();
    input.add(beginWord);
    Map<String, Set<String>> map = new HashMap<>();
    Queue<List<String>> queue = new PriorityQueue<>(new Comparator<List<String>>(){
      @Override
      public int compare(List<String> l1, List<String> l2) {
        return l1.size() - l2.size();
      }
    });
    map.put(beginWord, new HashSet<String>());
    for(int i = 0; i < wordList.size(); i++) {
      String currWord = wordList.get(i);
        if(!currWord.equals(beginWord)) {
          map.put(currWord, new HashSet<String>());
          for(Map.Entry<String, Set<String>> entry: map.entrySet()) {
            if(isClose(entry.getKey(), currWord)) {
              Set<String> set = entry.getValue();
              set.add(currWord);
              map.put(entry.getKey(), set);
            }
          }
        }
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
  static void find(String beginWord, String endWord, List<String> input, Queue<List<String>> queue, Map<String, Set<String>> map) {
    if(map.get(beginWord).contains(endWord)) {
      List<String> l = new ArrayList<>(input);
      l.add(endWord);
      queue.add(l);
      return;
    }
    for(String s : map.get(beginWord)) {
        input.add(s);
        find(s, endWord, input, queue, map);
        input.remove(s);
    }
  }
  static boolean isClose(String word1, String word2) {
    int count = 0;
    for(int i = 0; i < word1.length(); i++) {
      if(word1.charAt(i) != word2.charAt(i)) {
        count++;
      }
    }
    return count == 1;
  }
}
