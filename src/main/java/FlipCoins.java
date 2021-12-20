public class FlipCoins {
    public static int minimumCoinFlips(String coins) {
        boolean tail = false;
        int heads = 0;
        for (int i = 0; i < coins.length(); i++) {
            if (tail && coins.charAt(i) == 'H') heads++;
            if (coins.charAt(i) == 'T') tail = true;
        }
        boolean head = false;
        int tails = 0;
        for(int i = coins.length() - 1; i >= 0; i--) {
          if(head && coins.charAt(i) == 'T') tails++;
          if(coins.charAt(i) == 'H') head = true;
        }
        return Math.min(heads, tails);
    }
}
