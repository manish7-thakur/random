import java.util.*;

public class ArrayIntersectionFinder {
  public static List<Integer> find(int[] a, int[] b) {
    int[] arr;
    Map<Integer, Integer> occMap = new HashMap<>();
    if(a.length > b.length) {
      arr = a;
      for(int i = 0; i < b.length; i++) {
        occMap.merge(b[i], 1, Integer::sum);
      }
    } else {
      arr = b;
      for(int i = 0; i < a.length; i++) {
        occMap.merge(a[i], 1, Integer::sum);
      }
    }
    List<Integer> interList = new ArrayList<>();
    for(Integer elem: arr) {
      occMap.computeIfPresent(elem, (k, v) -> {
        interList.add(elem);
        return --v == 0 ? null: v;
      });
    }
    return interList;
  }
}
