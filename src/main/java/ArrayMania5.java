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
  static int findMedian(int[] arr) {
    int medianPos = arr.length / 2;
    int l = 0, h = arr.length - 1;
    while(l < h) {
      int pos = partition(arr, l, h);
      if(pos == medianPos) return arr[pos];
      else if(pos < medianPos) l = pos + 1;
      else h = pos - 1;
    }
    return arr[medianPos];
  }
  static int partition(int[] arr, int l, int h) {
    int pivot = arr[l];
    int pos = l;
    for(int i = l + 1; i <= h; i++) {
      if(arr[i] < pivot) {
        pos++;
        swap(arr, pos , i);
      }
    }
    swap(arr, pos, l);
    return pos;
  }
  static void swap(int[] arr, int l, int h) {
    int temp = arr[l];
    arr[l] = arr[h];
    arr[h] = temp;
  }
}
