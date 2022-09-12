import java.util.*;

public class RandomizedSet {
  Map<Integer, Integer> map;
  List<Integer> list;

  public RandomizedSet() {
    map = new HashMap<>();
    list = new ArrayList<>();
  }

  public boolean insert(int val) {
    if(!map.containsKey(val)) {
      list.add(val);
      map.put(val, list.size() - 1);
      return true;
    }
    return false;
  }

  public boolean remove(int val) {
    Integer index = map.remove(val);
    if(index != null) {
      removeFromList(index);
      return true;
    }
    return false;
  }

  private void removeFromList(int index) {
    list.set(index, list.get(list.size() - 1));
    map.put(list.get(index), index);
    list.remove(list.size() - 1);
  }

  public Integer getRandom() {
    Random r = new Random();
    return list.get(r.nextInt(list.size()));
  }
}
