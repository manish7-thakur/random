import java.util.*;

public class MyQueue {
  private Stack<Integer> s1;
  private Stack<Integer> s2;

  public MyQueue() {
    s1 = new Stack<>();
    s2 = new Stack<>();
  }

  public void push(int x) {
    s1.push(x);
  }

  public int pop() {
    while(!s1.isEmpty()) s2.push(s1.pop());
    return s2.pop();
  }

  public boolean isEmpty() {
    return s1.isEmpty() && s2.isEmpty();
  }
}
