import java.util.*;

public class StringDecoder {
  public static String decode(String s) {
    Stack<String> stack = new Stack<>();
    StringBuilder b = new StringBuilder();
    int i = s.length() - 1;
    while(i >= 0) {
      char c = s.charAt(i);
      if(c == ']') {
        stack.push(b.toString());
        b.setLength(0);
        stack.push(String.valueOf(c));
        i--;
      } else if(c == '[') {
        int j = i--;
        while(i >= 0 && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
          i--;
        }
        int count = Integer.parseInt(s.substring(i + 1, j));
        while(!stack.isEmpty() && !stack.peek().equals("]")) {
          b.append(stack.pop());
        }
        stack.pop();
        String repeat = b.toString();
        while(count - 1 > 0) {
          b.append(repeat);
          count--;
        }
        stack.push(b.toString());
        b.setLength(0);
      } else {
        b.insert(0, c);
        i--;
      }
    }
    while(!stack.isEmpty()) {
      b.append(stack.pop());
    }
    return b.toString();
  }
}
