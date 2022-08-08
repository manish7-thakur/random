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
  private List<NestedInteger> nestedList;
  private record Pair(Integer idx, List<NestedInteger> list){};
  private Stack<Pair> stack;

  public NestedIterator(List<NestedInteger> nestedList) {
    this.nestedList = nestedList;
    stack = new Stack<>();
  }

  @Override
  public boolean hasNext() {
    return idx < nestedList.size();
  }

  @Override
  public Integer next() {
    NestedInteger ns = nestedList.get(idx);
    idx++;
    if(idx >= nestedList.size() && !stack.isEmpty()) {
      Pair p = stack.pop();
      idx = p.idx;
      nestedList = p.list;
    }
    if(ns.isInteger()) return ns.getInteger();
    stack.push(new Pair(idx, nestedList));
    idx = 0;
    nestedList = ns.getList();
    return next();
  }
}
