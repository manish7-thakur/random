import java.util.*;

public class WordTransformer {
  static public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    List<List<String>> result = new ArrayList<>();
    List<String> input = new ArrayList<>();
    Map<String, Set<String>> map = new HashMap<>();
    Set<String> visited = new HashSet<>();
    Queue<String> wordQueue = new LinkedList<>();
    Set<String> wordSet = new HashSet<>(wordList);
    wordSet.remove(beginWord);
    visited.add(beginWord);
    wordQueue.add(beginWord);
    input.add(beginWord);

    while(!wordQueue.isEmpty()) {
      List<String> currList = new ArrayList<>();
      int count = wordQueue.size();
      while (count-- > 0) {
      String currWord = wordQueue.poll();
      Set<String> adjList = new HashSet<>();
      for (String s : wordSet) {
        if (isClose(s, currWord)) {
          adjList.add(s);
          if (!visited.contains(s)) {
            wordQueue.add(s);
            visited.add(s);
          }
        }
      }
      currList.addAll(adjList);
      map.put(currWord, adjList);
      }
      wordSet.removeAll(currList);
    }
    find(beginWord, endWord, input, result, map);
    return result;
  }
  static void find(String beginWord, String endWord, List<String> input, List<List<String>> result, Map<String, Set<String>> map) {
    if(map.get(beginWord).contains(endWord)) {
      List<String> l = new ArrayList<>(input);
      l.add(endWord);
      result.add(l);
      return;
    }
    Set<String> closeWords = map.get(beginWord);
    for(String s : closeWords) {
        input.add(s);
        find(s, endWord, input, result, map);
        input.remove(input.size() - 1);
    }
  }
  static boolean isClose(String word1, String word2) {
    int count = 0;
    for(int i = 0; i < word1.length(); i++) {
      if(word1.charAt(i) != word2.charAt(i)) {
        if(++count > 1) return false ;
      }
    }
    return true;
  }
  static public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    Map<String, Set<String>> map = new HashMap<>();
    Set<String> visited = new HashSet<>();
    Queue<String> wordQueue = new LinkedList<>();
    Set<String> wordSet = new HashSet<>(wordList);
    wordSet.remove(beginWord);
    visited.add(beginWord);
    wordQueue.add(beginWord);

    while(!wordQueue.isEmpty()) {
      List<String> currList = new ArrayList<>();
      int count = wordQueue.size();
      while (count-- > 0) {
      String currWord = wordQueue.poll();
      Set<String> adjList = new HashSet<>();
      for (String s : wordSet) {
        if (isClose(s, currWord)) {
          adjList.add(s);
          if (!visited.contains(s)) {
            wordQueue.add(s);
            visited.add(s);
          }
        }
      }
      currList.addAll(adjList);
      map.put(currWord, adjList);
      }
      wordSet.removeAll(currList);
    }
    return find(beginWord, endWord, map);
  }
  static int find(String beginWord, String endWord, Map<String, Set<String>> map) {
    if(map.get(beginWord).contains(endWord)) {
      return 2;
    }
    int len = 0;
    Set<String> closeWords = map.get(beginWord);
    for(String s : closeWords) {
        int subLen = find(s, endWord, map);
        if(subLen > 0) len = 1 + subLen;
    }
    return len;
  }
}
