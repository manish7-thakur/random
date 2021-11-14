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
    int j = 0;
    int i = 0;
    while(s.charAt(i) == ' ') i++;
    i = s.charAt(i) == '+' || s.charAt(i) == '-' ? i + 1 : i;
    while(i < s.length() && s.charAt(i) != '+' && s.charAt(i) != '-') i++;
    int acc = Integer.parseInt(s.substring(j, i).trim());

    while(i < s.length()) {
      char c = s.charAt(i);
      j = ++i;
      while(i < s.length() && s.charAt(i) != '+' && s.charAt(i) != '-') i++;
      if('+' == c) {
        acc += Integer.parseInt(s.substring(j, i).trim());
      } else {
        acc -= Integer.parseInt(s.substring(j, i).trim());
      }
    }
    return acc;
  }
}
