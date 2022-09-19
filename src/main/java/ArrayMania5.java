import java.util.*;
import static java.util.stream.Collectors.*;
public class ArrayMania5 {
  static List<List<String>> findDuplicate(String[] paths) {
    Map<String, List<String>> map = new HashMap<>();
    Arrays.stream(paths).forEach(path -> {
      String[] pathInfo = path.split(" ");
      String directory = pathInfo[0];
      for(int i = 1; i < pathInfo.length; i++) {
        String[] file = pathInfo[i].split("\\(");
        String fileName = file[0];
        String content = file[1].substring(0, file[1].indexOf(')'));
        map.computeIfAbsent(content, k -> new ArrayList<>()).add(directory + "/" + fileName);
      }
    });
    return map.values().stream().filter(list -> list.size() > 1).collect(toList());
  }
}
