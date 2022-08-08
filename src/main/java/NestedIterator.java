import java.util.*;
interface NestedInteger {
    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();
    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();
    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}
public class NestedIterator implements Iterator<Integer> {
  private int idx;
  private List<Integer> list = new ArrayList<>();

  public NestedIterator(List<NestedInteger> nestedList) {
    flatten(nestedList);
  }

  private void flatten(List<NestedInteger> nestedList) {
    for(NestedInteger ni : nestedList) {
      if(ni.isInteger()) list.add(ni.getInteger());
      else flatten(ni.getList());
    }
  }

  @Override
  public boolean hasNext() {
    return idx < list.size();
  }

  @Override
  public Integer next() {
    return list.get(idx++);
  }
}
