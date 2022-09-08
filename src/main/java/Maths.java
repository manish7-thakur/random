public class Maths {
  static int divide(int dividend, int divisor) {
    int count = 0;
    boolean negative = dividend < 0 || divisor < 0;
    dividend = Math.abs(dividend);
    divisor = Math.abs(divisor);
    while(dividend >= divisor) {
      dividend -= divisor;
      count++;
    }
    return negative ? -count : count;
  }
}
