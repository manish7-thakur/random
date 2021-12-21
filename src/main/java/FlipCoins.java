public class FlipCoins {
    public static int minimumCoinFlips(String coins) {
        boolean tailSeen = false;
        int headFlips = 0;
        for (int i = 0; i < coins.length(); i++) {
            if (tailSeen && coins.charAt(i) == 'H') headFlips++;
            if (coins.charAt(i) == 'T') tailSeen = true;
        }
        boolean headSeen = false;
        int tailFlips = 0;
        for(int i = coins.length() - 1; i >= 0; i--) {
          if(headSeen && coins.charAt(i) == 'T') tailFlips++;
          if(coins.charAt(i) == 'H') headSeen = true;
        }
        return Math.min(headFlips, tailFlips);
    }

    static public int minFlipsMonoIncr(String s) {
      boolean oneSeen = false;
      int zeroFlips = 0;
      for(int i = 0; i < s.length(); i++) {
        if(oneSeen && s.charAt(i) == '0') zeroFlips++;
        if(s.charAt(i) == '1') oneSeen = true;
      }
      boolean zeroSeen = false;
      int oneFlips = 0;
      for(int i = s.length() - 1; i >= 0; i--) {
        if(zeroSeen && s.charAt(i) == '1') oneFlips++;
        if(s.charAt(i) == '0') zeroSeen = true;
      }
      return Math.max(zeroFlips, oneFlips);
    }
}
