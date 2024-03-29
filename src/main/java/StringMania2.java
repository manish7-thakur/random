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
  static String addStrings(String num1, String num2) {
    StringBuilder b = new StringBuilder();
    int i = num1.length() - 1, j = num2.length() - 1;
    int carry = 0, sum = 0;
    while(i >= 0 && j >= 0) {
      sum = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(j)) + carry;
      carry = sum / 10;
      sum = sum % 10;
      b.append(sum);
      i--;
      j--;
    }
    while(i >= 0) {
      sum = Character.getNumericValue(num1.charAt(i)) + carry;
      carry = sum / 10;
      sum = sum % 10;
      b.append(sum);
      i--;
    }
    while(j >= 0) {
      sum = Character.getNumericValue(num2.charAt(j)) + carry;
      carry = sum / 10;
      sum = sum % 10;
      b.append(sum);
      j--;
    }
    if(carry > 0) b.append(carry);
    return b.reverse().toString();
  }

  static boolean isIsomorphic(String s, String t) {
    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();
    for(int i = 0; i < s.length(); i++) {
      if(!Objects.equals(map1.put(s.charAt(i), i), map2.put(t.charAt(i), i)))
      return false;
    }
    return true;
  }
}
