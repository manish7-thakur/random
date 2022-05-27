import java.util.*;

public class ConnectedComponents {
  static List<List<String>> mergeAccounts(List<List<String>> accounts) {
    Map<String, List<String>> map = new HashMap<>();
    List<List<String>> res = new ArrayList<>();
    Set<String> visited = new HashSet<>();
    for(List<String> account : accounts) {
      String firstEmail = account.get(1);
      for(int i = 2; i < account.size(); i++) {
        String next = account.get(i);
        map.compute(firstEmail, (k, v) -> v == null ? new ArrayList<>() : v).add(next);
        map.compute(next, (k, v) -> v == null ? new ArrayList<>() : v).add(firstEmail);
      }
    }
    for(List<String> account : accounts) {
      String firstEmail = account.get(1);
      if(!visited.contains(firstEmail)) {
        List<String> merged = new ArrayList<>();
        String name = account.get(0);
        merged.add(name);
        mergeAll(firstEmail, merged, map, visited);
        Collections.sort(merged.subList(1, merged.size()));
        res.add(merged);
      }
    }
    return res;
  }
  static void mergeAll(String email, List<String> merged, Map<String, List<String>> map, Set<String> visited) {
    if(visited.contains(email)) return;
    visited.add(email);
    merged.add(email);
    map.getOrDefault(email, List.of()).forEach(e -> mergeAll(e, merged, map, visited));
  }
}
