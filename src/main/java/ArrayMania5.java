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
  static int[][] floodFill(int[][] image, int sr, int sc, int color) {
    floodFillRec(image, sr, sc, color, image[sr][sc]);
    return image;
  }
  static void floodFillRec(int[][] image, int sr, int sc, int color, int startingColor) {
    if(!safe(image, sr, sc, startingColor)) return;
    if(image[sr][sc] == color) return;
    image[sr][sc] = color;
    floodFillRec(image, sr, sc - 1, color, startingColor);
    floodFillRec(image, sr - 1, sc, color, startingColor);
    floodFillRec(image, sr + 1, sc, color, startingColor);
    floodFillRec(image, sr, sc + 1, color, startingColor);
  }
  static boolean safe(int[][] image, int sr, int sc, int startingColor) {
    return sr >= 0 && sc >= 0 && sr < image.length && sc < image[0].length && image[sr][sc] == startingColor;
  }
}
