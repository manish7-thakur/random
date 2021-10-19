public class StringMultiplier {
  static public String multiply(String num1, String num2) {
    int op1 = Character.digit(num1.charAt(0), 10);
    int op2 = Character.digit(num2.charAt(0), 10);
    StringBuilder b = new StringBuilder();
    b.append(op1 * op2);
    return b.toString();
  }
}
