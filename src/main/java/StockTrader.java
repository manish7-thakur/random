import java.util.*;

public class StockTrader {
  static public int maxProfit(int[] prices) {
    int[] leftProfits = new int[prices.length];
    int[] rightProfits = new int[prices.length];
    int maxProfit = 0;
    int min = prices[0];
    for(int i = 0; i < prices.length; i++) {
      leftProfits[i] = Math.max(maxProfit, prices[i] - min);
      if(prices[i] < min) {
        min = prices[i];
      }
    }
    maxProfit = 0;
    int max = prices[prices.length - 1];
    for(int i = prices.length - 1; i >= 0; i--) {
      rightProfits[i] = Math.max(maxProfit, max - prices[i]);
      if(prices[i] > max) {
        max = prices[i];
      }
    }
    for(int i = 0; i < leftProfits.length; i++) {
      maxProfit = Math.max(maxProfit, leftProfits[i] + rightProfits[i]);
    }
    return maxProfit;
  }
}
