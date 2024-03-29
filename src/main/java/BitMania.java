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
  static public int[] countBits(int n) {
    int[] res = new int[n + 1];
    for(int i = 1; i < n + 1; i++) {
      res[i] = i % 2 == 0 ? res[i/2] : res[i/2] + 1;
    }
    return res;
  }
  static int reverseBits(int n) {
    int res = 0;
    for(int i = 0; i < 32; i++) {
      res = res << 1;
      int bit = n & 1;
      res = res | bit;
      n = n >>> 1;
    }
    return res;
  }
}
