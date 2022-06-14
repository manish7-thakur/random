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
      switch(token) {
        case "/" : {
          int op2 = stack.pop();
          int op1 = stack.pop();
          stack.push(op1 / op2);
        }
        break;
        case "+" : {
          int op2 = stack.pop();
          int op1 = stack.pop();
          stack.push(op1 + op2);
        }
        break;
        case "*" : {
          int op2 = stack.pop();
          int op1 = stack.pop();
          stack.push(op1 * op2);
        }
        break;
        case "-" : {
          int op2 = stack.pop();
          int op1 = stack.pop();
          stack.push(op1 - op2);
        }
        break;
        default: stack.push(Integer.parseInt(token));
      }
    }
    return stack.pop();
  }
}
