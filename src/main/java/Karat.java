import java.util.*;
import static java.util.stream.Collectors.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Karat {
  static public Map<Integer, List<Integer>> find(int[][] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int[] pair : arr) {
      map.merge(pair[1], 1, Integer::sum);
      map.putIfAbsent(pair[0], 0);
    }
    Map<Integer, List<Integer>> res = new HashMap<>();
    List<Integer> singles = new ArrayList<>();
    List<Integer> orphans = new ArrayList<>();
    res.put(0, orphans);
    res.put(1, singles);
    map.forEach((key, value) -> {
      if(value == 0) orphans.add(key);
      else if(value == 1) singles.add(key);
    });
    return res;
  }

  static public boolean hasCommon(int[][] arr, int a, int b) {
    Map<Integer, Set<Integer>> map = new HashMap<>();
    for (int[] pair : arr) {
      if (pair[1] == a || pair[1] == b) {
        Set<Integer> parents = map.getOrDefault(pair[1], new HashSet<>());
        parents.add(pair[0]);
        if (pair[1] == a && map.getOrDefault(b, new HashSet<>()).contains(pair[0])) return true;
        if (pair[1] == b && map.getOrDefault(a, new HashSet<>()).contains(pair[0])) return true;
        map.put(pair[1], parents);
      }
    }
    return false;
  }

  static public boolean search(char[][] grid, String word) {
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    List<List<Integer>> res = new ArrayList<>();
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[i].length; j++) {
        if(grid[i][j] == word.charAt(0) && searchRec(grid, i, j, word, visited, res)) {
          return true;
        }
      }
    }
    return false;
  }
  static public boolean searchRec(char[][] grid, int i, int j, String word, boolean[][] visited, List<List<Integer>> res) {
    if(word.isEmpty()) return true;
    if(!isSafe(grid, i, j, word.charAt(0), visited)) return false;
    visited[i][j] = true;
    res.add(List.of(i, j));

    if(searchRec(grid, i + 1, j, word.substring(1), visited, res)) {
      return true;
    }
    if(searchRec(grid, i - 1, j, word.substring(1), visited, res)) {
      return true;
    }
    if(searchRec(grid, i, j + 1, word.substring(1), visited, res)) {
      return true;
    }
    if(searchRec(grid, i, j - 1, word.substring(1), visited, res)) {
      return true;
    }

    visited[i][j] = false;
    if(!res.isEmpty())res.remove(res.size() - 1);
    return false;
  }
  static boolean isSafe(char[][] grid, int i, int j, char c, boolean[][] visited) {
    return i >= 0 && j >= 0 && i < grid.length && j < grid[i].length && grid[i][j] == c && !visited[i][j];

  }

  static List<String> findOverlapTimings(List<Integer> list) {
    Collections.sort(list);
    int l = 0, r = l + 1;
    while(r < list.size()) {
      int timeGap = list.get(r) - list.get(l);
      if(timeGap >= 100 && r - l < 3) l = r;
      else if(timeGap > 100) break;
      r++;
    }
    if(r - l < 3) return List.of();
    return list.subList(l, r).stream().map(String::valueOf).toList();
  }

  static public Map<String, List<String>> findCulprits(String[][] badgeTimes) {
    Map<String, List<Integer>> map = Arrays.stream(badgeTimes).collect(groupingBy(arr -> arr[0],
    collectingAndThen(mapping(arr -> arr[1].length() < 3 ? Integer.parseInt(arr[1] + "00") : Integer.parseInt(arr[1]), toList()), list -> { Collections.sort(list); return list; })));
    Map<String, List<String>> res = new HashMap<>();
    map.forEach((name, list) -> {
      if(list.size() >= 3) {
        List<String> overlapTimes = findOverlapTimings(list);
        if(overlapTimes.size() >= 3) res.put(name, overlapTimes);
      }});
    return res;
  }
  static String findEmbeddedWord(String[] words, String str) {
    Map<Character, Integer> map = str.chars().mapToObj(c -> (char) c).collect(groupingBy(Function.identity(), collectingAndThen(counting(), Long::intValue))); //O(S)
    for(String word : words) { //O(W)
      boolean found = true;
      Map<Character, Integer> curr = new HashMap<>(map); // O(S)
      for(int i = 0; i < word.length(); i++) { //O(S)
        char c = word.charAt(i);
        Integer count = curr.computeIfPresent(c, (k, v) -> --v < 0 ? null : v);
        if(count == null) {
          found = false;
          break;
        }
      }
      if(found) return word;
    }
    return null;
  }
  static List<String> getRobots(String[] allParts, String requiredParts) {
    List<String> res = new ArrayList<>();
    Set<String> reqPartsSet = Set.of(requiredParts.split(",")); //O(S)
    Map<String, Set<String>> map = Arrays.stream(allParts).collect(groupingBy(str -> str.split("_")[0], mapping(str -> str.split("_")[1], toSet()))); //O(N)
    map.forEach((robot, partsSet) -> {if(reqPartsSet.equals(partsSet)) res.add(robot);}); //O(N) * O(S), Search is O(1) for set
    return res;
  }
  static Map<String, Set<String>> findEndPoint(String[][] paths) {
    Map<String, Set<String>> pathMap = Arrays.stream(paths).collect(groupingBy(path -> path[0], mapping(path -> path[1], toSet())));
    Map<String, Set<String>> res = new HashMap<>();
    Set<String> midPoints = pathMap.values().stream().flatMap(Set::stream).collect(toSet());
    pathMap.forEach((origin, destSet) -> {
      if(!midPoints.contains(origin)) {
        Set<String> endPoints = new HashSet<>();
        buildEndPoints(origin, pathMap, endPoints);
        res.put(origin, endPoints);
      }
    });
    return res;
  }
  static void buildEndPoints(String point, Map<String, Set<String>> pathMap, Set<String> endPoints) {
    if(!pathMap.containsKey(point)) {
      endPoints.add(point);
      return;
    }
    pathMap.get(point).forEach(next -> buildEndPoints(next, pathMap, endPoints));
  }
  static List<Set<String>> findMismatched(String[][] badges) {
    Set<String> entries = new HashSet<>();
    Set<String> exits = new HashSet<>();
    Set<String> entryCulprits = new HashSet<>();
    Arrays.stream(badges).forEach(arr -> {
      String name = arr[0];
      String log = arr[1];
      if(log.equals("enter")) {
        if(!entries.add(name)) entryCulprits.add(name);
      } else {
        if(!entries.remove(name)) exits.add(name);
      }
    });
    entryCulprits.addAll(entries);
    return List.of(entryCulprits, exits);
  }
}
