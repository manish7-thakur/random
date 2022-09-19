import java.util.*;
import static java.util.stream.Collectors.*;
public class ArrayMania5 {
  static List<List<String>> findDuplicate(String[] paths) {
    Map<String, List<String>> map = new HashMap<>();
    Arrays.stream(paths).forEach(path -> {
      String[] pathInfo = path.split(" ");
      String directory = pathInfo[0];
      for(int i = 1; i < pathInfo.length; i++) {
        String file = pathInfo[i];
        String content = file.substring(file.indexOf('('), file.indexOf(')') + 1);
        map.computeIfAbsent(content, k -> new ArrayList<>()).add(directory + "/" + file.substring(0, file.indexOf('(')));
      }
    });
    return map.values().stream().filter(list -> list.size() > 1).collect(toList());
  }
}
