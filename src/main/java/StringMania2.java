import java.util.*;

public class StringMania2 {
  static int atoi(String s) {
    int res = 0, sign = 1, index = 0;
    int n = s.length();
    while (index < n && s.charAt(index) == ' ') {
      index++;
    }
    if (index < n && s.charAt(index) == '+') {
      index++;
    } else if (index < n && s.charAt(index) == '-') {
      sign = -1;
      index++;
    }
    while(index < n && Character.isDigit(s.charAt(index))) {
      int digit = Character.getNumericValue(s.charAt(index));
      if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      res = 10 * res + digit;
      index++;
    }
    return res * sign;
  }
  static int evaluateRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    for(String token : tokens) {
      switch (token) {
        case "/" -> {
          int op2 = stack.pop();
          int op1 = stack.pop();
          stack.push(op1 / op2);
        }
        case "+" -> {
          int op2 = stack.pop();
          int op1 = stack.pop();
          stack.push(op1 + op2);
        }
        case "*" -> {
          int op2 = stack.pop();
          int op1 = stack.pop();
          stack.push(op1 * op2);
        }
        case "-" -> {
          int op2 = stack.pop();
          int op1 = stack.pop();
          stack.push(op1 - op2);
        }
        default -> stack.push(Integer.parseInt(token));
      }
    }
    return stack.pop();
  }
  static String removeDuplicateLetters(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for(int i = 0; i < s.length(); i++) map.put(s.charAt(i), i);
    Set<Character> seen = new HashSet<>();
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if(!seen.contains(c)) {
        while(!stack.isEmpty() && stack.peek() > c && i < map.get(stack.peek())) {
          seen.remove(stack.pop());
        }
        stack.push(c);
        seen.add(c);
      }
    }
    StringBuilder b = new StringBuilder();
    while(!stack.isEmpty()) b.append(stack.pop());
    return b.reverse().toString();
  }
}
