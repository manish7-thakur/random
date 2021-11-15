import java.util.*;

public class ExpressionEvaluator {
  public static double evaluate(String exp) {
    Queue<Character> opQueue = new ArrayDeque<>();
    Queue<Double> nQueue = new ArrayDeque<>();
    Set<Character> ops = new HashSet<>();
    ops.add('+');
    ops.add('-');
    ops.add('*');
    ops.add('/');
    int i = 0;
    int j = 0;
    while(!ops.contains(exp.charAt(i))) {
      i++;
    }

    double acc = Double.parseDouble(exp.substring(j, i));
    while(i < exp.length()) {
      char c = exp.charAt(i);
      j = ++i;
      while(i < exp.length() && !ops.contains(exp.charAt(i))) {
        i++;
      }
      double num = Double.parseDouble(exp.substring(j, i));
      switch (c) {
        case '*' :
          acc *= num;
          break;
        case '/' :
          acc /= num;
          break;
        case '+' :
        case '-' :
          nQueue.add(acc);
          acc = num;
          opQueue.add(c);
          break;
      }
    }
    nQueue.add(acc);
    acc = nQueue.remove();
    while(!opQueue.isEmpty()) {
        char op = opQueue.remove();
        double opd = nQueue.remove();
        acc = op == '+' ? acc + opd : acc - opd;
    }
    return acc;
  }
  static public int calculate(String s) {
    int i = 0, j = 0, acc = 0, sign = 1;
    Stack<Integer> stack = new Stack<>();
    while(i < s.length()) {
      char c = s.charAt(i);
      if(Character.isDigit(c)) {
        j = i++;
        while(i < s.length() && Character.isDigit(s.charAt(i))) i++;
        acc += Integer.parseInt(s.substring(j, i)) * sign;
        i--;
      } else if('+' == c) {
        sign = 1;
      } else if('-' == c){
        sign = -1;
      } else if('(' == c) {
        stack.push(acc);
        stack.push(sign);
        acc = 0;
        sign = 1;
      } else if(')' == c) {
        acc = acc * stack.pop() + stack.pop();
      }
      i++;
    }
    return acc;
  }
}
