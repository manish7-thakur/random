public class StringMultiplier {
  static public String multiply(String num1, String num2) {
    StringBuilder b = new StringBuilder();
    int[] values = new int[num1.length() + num2.length()];
    for(int n1 = num1.length() - 1; n1 >= 0; n1--) {
      int den = Character.digit(num1.charAt(n1), 10);
      for(int n2 = num2.length() - 1; n2 >= 0; n2--) {
        int nume = Character.digit(num2.charAt(n2), 10);
        int res = den * nume + values[n1 + n2 + 1];
          values[n1 + n2 + 1] = res % 10;
          values[n1 + n2] += res / 10;
      }
    }
    for(int i = 0; i < values.length; i++) {
      if(i != 0 || values[i] != 0) b.append(values[i]);
    }
    return b.toString();
  }

  static public String multiply2(String num1, String num2) {
    int res = 0;
    int powi = 0;
    for(int n1 = num1.length() - 1; n1 >= 0; n1--) {
      int den = Character.digit(num1.charAt(n1), 10);
      int sum = 0;
      int pow = 0;
      int carry = 0;
      for(int n2 = num2.length() - 1; n2 >= 0; n2--) {
        int nume = Character.digit(num2.charAt(n2), 10);
        int curr = den * nume + carry;
        sum += curr % 10 * (int)Math.pow(10, pow);
        carry = curr / 10;
        pow++;
      }
      sum += carry * Math.pow(10, pow);
      res += sum * Math.pow(10, powi);
      powi++;
    }
    return String.valueOf(res);
  }
}
