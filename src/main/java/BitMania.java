public class BitMania {
  static public int getSum(int a, int b) {
    int sum = a;
    while(b != 0) {
      sum = a ^ b;
      b = (a & b) << 1;
      a = sum;
    }
    return sum;
  }
  static public int hammingWeight(int n) {
    int count = 0;
    while(n != 0) {
      if((n & 1) == 1) count++;
      n = n >>> 1; //right-shift operator that doesn't use the sign bit for filling the trailing position
    }
    return count;
  }
}
