import java.util.*;

public class RandomizedSet {
  Map<Integer, Object> map;
  private static final Object PRESENT = new Object();

  public RandomizedSet() {
    map = new HashMap<>();
  }

  public boolean insert(int val) {
    return map.put(val, PRESENT) == null;
  }

  public boolean remove(int val) {
    return map.remove(val) == PRESENT;
  }
}
