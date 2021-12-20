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
}
