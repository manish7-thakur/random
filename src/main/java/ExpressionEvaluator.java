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
  static public int calculatePlainExp(String s) {
    int j = 0;
    int i = s.charAt(0) == '+' || s.charAt(0) == '-' ? 1 : 0;
    while(i < s.length() && s.charAt(i) != '+' && s.charAt(i) != '-') i++;
    int acc = Integer.parseInt(s.substring(j, i));

    while(i < s.length()) {
      char c = s.charAt(i);
      j = ++i;
      while(i < s.length() && s.charAt(i) != '+' && s.charAt(i) != '-') i++;
      if('+' == c) {
        acc += Integer.parseInt(s.substring(j, i));
      } else {
        acc -= Integer.parseInt(s.substring(j, i));
      }
    }
    return acc;
  }

  static public int calculate(String s) {
    int i = s.length() - 1;
    Stack<String> stack = new Stack<>(); // for String you do substring which is equal to stack.pop char by char so by using string stack doesn't harm
    while(i >= 0) {
      if(s.charAt(i) == '(') {
        StringBuilder b = new StringBuilder();
        while(!stack.isEmpty() && !stack.peek().equals(")")) {
          b.append(stack.pop());
        }
        int res = calculatePlainExp(b.toString());
        stack.pop();
        if(res < 0) {
          stack.push(String.valueOf(-res));
          stack.push("-");
        } else stack.push(String.valueOf(res));
      } else if(s.charAt(i) == '-' && stack.peek().equals("-")) {
        stack.pop();
        stack.push("+");
      } else if(s.charAt(i) != ' ') stack.push(s.valueOf(s.charAt(i)));
      i--;
    }
    StringBuilder b = new StringBuilder();
    while(!stack.isEmpty()) b.append(stack.pop());

    return calculatePlainExp(b.toString());
  }
}
