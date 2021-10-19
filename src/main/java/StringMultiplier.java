public class StringMultiplier {
  static public String multiply(String num1, String num2) {
    StringBuilder b = new StringBuilder();
    int carry = 0;
    String numerator, denominator;
    if(num1.length() <= num2.length()) {
      numerator = num2;
      denominator = num1;
    } else {
      numerator = num1;
      denominator = num2;
    }
    for(int n1 = denominator.length() - 1; n1 >= 0; n1--) {
      int den = Character.digit(denominator.charAt(n1), 10);
      for(int n2 = numerator.length() - 1; n2 >= 0; n2--) {
        int nume = Character.digit(numerator.charAt(n2), 10);
        int res = den * nume + carry;
        if(res > 9) {
          b.append(res % 10);
          carry = res / 10;
        } else {
          b.append(res);
          carry = 0;
        }
      }
      if(carry > 0) b.append(carry);
    }
    return b.reverse().toString();
  }
}
