import java.util.*;
import static java.util.stream.Collectors.*;
public class ArrayMania5 {
  static List<List<String>> findDuplicate(String[] paths) {
    Map<String, List<String>> map = new HashMap<>();
    Arrays.stream(paths).forEach(path -> {
      String[] pathInfo = path.split(" ");
      for(int i = 1; i < pathInfo.length; i++) {
        String content = pathInfo[i].substring(pathInfo[i].indexOf('('), pathInfo[i].indexOf(')') + 1);
        map.computeIfAbsent(content, k -> new ArrayList<>()).add(pathInfo[0]+ "/" + pathInfo[i].substring(0, pathInfo[i].indexOf('(')));
      }
    });
    return map.values().stream().filter(list -> list.size() > 1).collect(toList());
  }
}
