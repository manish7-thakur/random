public class Maths {
  static int divide(int dividend, int divisor) {
    if(divisor == Integer.MIN_VALUE && dividend != Integer.MIN_VALUE) return 0; 
    int count = 0;
    boolean positive = dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0;
    if(dividend == Integer.MIN_VALUE) dividend = Integer.MAX_VALUE;
    else dividend = Math.abs(dividend);
    if(divisor == Integer.MIN_VALUE) divisor = Integer.MAX_VALUE;
    else divisor = Math.abs(divisor);
    while(dividend >= divisor) {
      dividend -= divisor;
      count++;
    }
    return positive ? count : -count;
  }
}
