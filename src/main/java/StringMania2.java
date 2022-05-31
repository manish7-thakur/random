public class StringMania2 {
  static int atoi(String s) {
    int res = 0, sign = 1;
    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if(Character.isDigit(c)) {
        int digit = Character.getNumericValue(c);
        if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
          return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        res = 10 * res + digit;
      } else if(c == '-' && res == 0) sign = -sign;
    }
    return res * sign;
  }
}
