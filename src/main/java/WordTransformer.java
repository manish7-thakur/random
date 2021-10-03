import java.util.*;

public class WordTransformer {
  static public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    List<List<String>> result = new ArrayList<>();
    List<String> input = new ArrayList<>();
    input.add(beginWord);
    Map<String, Set<String>> map = new HashMap<>();
    Set<String> visited = new HashSet<>();
    Queue<List<String>> queue = new PriorityQueue<>(new Comparator<List<String>>(){
      @Override
      public int compare(List<String> l1, List<String> l2) {
        return l1.size() - l2.size();
      }
    });
    map.put(beginWord, new HashSet<String>());
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
      Set<String> adjList = map.getOrDefault(currWord, new HashSet<>());
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

    find(beginWord, endWord, input, queue, map, visited);
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
  static void find(String beginWord, String endWord, List<String> input, Queue<List<String>> queue, Map<String, Set<String>> map, Set<String> visited) {
    if(map.get(beginWord).contains(endWord)) {
      List<String> l = new ArrayList<>(input);
      l.add(endWord);
      queue.add(l);
      return;
    }
    for(String s : map.get(beginWord)) {
        input.add(s);
        visited.add(s);
        find(s, endWord, input, queue, map, visited);
        input.remove(input.size() - 1);
        visited.remove(s);
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
 static Map<String, List<String>> adjList = new HashMap<>();

 static List<String> path = new ArrayList<String>(); // current path
 static List<List<String>> res = new ArrayList<List<String>>();

  static public List<List<String>> findLadders2(String begin,
                                        String end,
                                        List<String> wordList) {
    Set<String> set = new HashSet<>(wordList);
    if (set.contains(begin)) { set.remove(begin); }

    bfs(begin, set);

    path.add(begin);
    dfs(begin, end);

    return res;
  }

  static private void bfs(String begin, Set<String> set) {
    Set<String> visited = new HashSet<>();
    Queue<String> q = new LinkedList<>();
    q.add(begin);
    visited.add(begin);

    while (!q.isEmpty()) {
      List<String> currList = new ArrayList<>();
      int size = q.size();
      for (int i = size - 1; i >= 0; i--) {
        String now = q.poll();
        for (String next: nextList(now, set)) {
          currList.add(next);

          // build DAG graph
          if (!adjList.containsKey(now)) {
            adjList.put(now, new ArrayList<String>());
          }
          adjList.get(now).add(next);

          if (!visited.contains(next)) {
            q.add(next);
            visited.add(next);
          }
        }
      }

      // removing the words of the previous level
      for (String word: currList) {
        if (set.contains(word)) { set.remove(word); }
      }
    }
  }


  static private void dfs(String now, String end) {
    // store the path if we reached the `end`
    if (now.equals(end)) {
      res.add( new ArrayList<String>(path) );
      return;
    }

    if (!adjList.containsKey(now)) { return; }

    List<String> nexts = adjList.get(now);
    for (int i = 0; i < nexts.size(); i++) {
      String next = nexts.get(i);

      path.add(next);
      dfs(next, end);
      path.remove(path.size() - 1);
    }
  }

  static private List<String> nextList(String now, Set<String> set) {
    List<String> list = new ArrayList<String>();
    char[] chs = now.toCharArray();

    for (int i = 0; i < now.length(); i++) {
      char orgCh = chs[i];

      for (char ch = 'a'; ch <= 'z'; ch++) {
        chs[i] = ch;
        if (ch == orgCh || !set.contains(String.valueOf(chs))) { continue; }
        list.add(String.valueOf(chs));
      }

      chs[i] = orgCh; // recover
    }
    return list;
  }
}
