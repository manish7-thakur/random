import java.util.*;

public class ArrayIntersectionFinder {
  public static List<Integer> find(int[] a, int[] b) {
    int[] arr;
    Map<Integer, Integer> occMap = new HashMap<>();
    if(a.length > b.length) {
      arr = a;
      Arrays.stream(b).forEach(e -> occMap.merge(e, 1, Integer::sum));
    } else {
      arr = b;
      Arrays.stream(a).forEach(e -> occMap.merge(e, 1, Integer::sum));
    }
    List<Integer> interList = new ArrayList<>();
    Arrays.stream(arr).forEach(e -> occMap.computeIfPresent(e, (k, v) -> {
        interList.add(e);
        return --v == 0 ? null: v;
      }));
    return interList;
  }
}
