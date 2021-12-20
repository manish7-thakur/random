public class FlipCoins {
    public static int minimumCoinFlips(String coins) {
        boolean tail = false;
        int headFlips = 0;
        for (int i = 0; i < coins.length(); i++) {
            if (tail && coins.charAt(i) == 'H') headFlips++;
            if (coins.charAt(i) == 'T') tail = true;
        }
        boolean head = false;
        int tailFlips = 0;
        for(int i = coins.length() - 1; i >= 0; i--) {
          if(head && coins.charAt(i) == 'T') tailFlips++;
          if(coins.charAt(i) == 'H') head = true;
        }
        return Math.min(headFlips, tailFlips);
    }
}
