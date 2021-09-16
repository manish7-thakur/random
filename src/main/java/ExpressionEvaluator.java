import java.util.*;

public class ExpressionEvaluator {
  public static int evaluate(String exp) {
    Stack<Character> opStack = new Stack<>();
    Stack<Integer> nStack = new Stack<>();
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
    Integer num = Integer.parseInt(exp.substring(j, i));
    nStack.push(num);
    while(i < exp.length()) {
      char c = exp.charAt(i);
      j = ++i;
      while(i < exp.length() && !ops.contains(exp.charAt(i))) {
        i++;
      }
      num = Integer.parseInt(exp.substring(j, i));
      switch (c) {
        case '*' :
          nStack.push(num * nStack.pop());
          break;
        case '/' :
          nStack.push(nStack.pop() / num);
          break;
        case '+' :
        case '-' :
          nStack.push(num);
          opStack.push(c);
          break;
      }
    }
    while(!opStack.isEmpty()) {
      char op = opStack.pop();
      int opd1 = nStack.pop();
      int opd2 = nStack.pop();
      if(op == '+') {
        if(!opStack.isEmpty() && opStack.peek() == '-') nStack.push(opd2 - opd1);
         else nStack.push(opd1 + opd2);
      } else {
        if(!opStack.isEmpty() && opStack.peek() == '-') nStack.push(opd2 + opd1);
        else nStack.push(opd2 - opd1);
      }
    }
    return nStack.pop();
  }
}
