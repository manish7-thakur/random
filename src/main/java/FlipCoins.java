public class FlipCoins {
    static public int minFlipsMonoIncr(String s) {
      int oneCount = 0;
      int flips = 0;
      for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == '1') oneCount++;
        else flips = Math.min(flips + 1, oneCount);
      }
      return flips;
    }
}
