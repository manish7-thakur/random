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

  static int countNumbersWithUniqueDigits(int n) {
    int[] mem = new int[9];
    int res = 0;
    mem[0] = 1;
    mem[1] = 9;
    mem[2] = 9 * 9;
    mem[3] = 9 * 9 * 8;
    mem[4] = 9 * 9 * 8 * 7;
    mem[5] = 9 * 9 * 8 * 7 * 6;
    mem[6] = 9 * 9 * 8 * 7 * 6 * 5;
    mem[7] = 9 * 9 * 8 * 7 * 6 * 5 * 4;
    mem[8] = 9 * 9 * 8 * 7 * 6 * 5 * 4 * 3;
    for(int i = 0; i <= n; i++) res += mem[i];
    return res;
  }
}
