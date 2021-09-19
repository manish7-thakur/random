import java.util.*;

public class ArrayIntersectionFinder {
  public static List<Integer> find(int[] a, int[] b) {
    int[] arr;
    Map<Integer, Integer> occMap = new HashMap<>();
    if(a.length > b.length) {
      arr = a;
      for(int i = 0; i < b.length; i++) {
      int occ =  occMap.getOrDefault(b[i], 0);
      occ++;
      occMap.put(b[i], occ);
      }
    } else {
      arr = b;
      for(int i = 0; i < a.length; i++) {
      int occ =  occMap.getOrDefault(a[i], 0);
      occ++;
      occMap.put(a[i], occ);
      }
    }
    List<Integer> interList = new ArrayList<>();
    for(int i = 0; i < arr.length; i++) {
      if(occMap.containsKey(arr[i])) {
        interList.add(arr[i]);
        int occ = occMap.get(arr[i]);
        occ--;
        if(occ == 0) {
          occMap.remove(arr[i]);
        } else {
          occMap.put(arr[i], occ);
        }
      }
    }
    return interList;
  }
}
