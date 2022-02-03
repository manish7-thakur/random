import java.util.*;

public class MaxStockProfitFinder {
    static public int maxProfit(int[] prices) {
      int res = 0;
      int min = prices[0];
      for(int i = 1; i < prices.length; i++) {
        int curr = prices[i] - min;
        if(curr > res) res = curr;
        if(prices[i] < min) min = prices[i];
      }
      return res;
    }
    static public int maxProfit(int[] prices) {
      int[] profits = new int[prices.length];
      int maxProfit = 0, maxLeftProfit = 0, maxRightProfit = 0;
      int min = prices[0];
      int max = prices[prices.length - 1];
      int l = 0, r = prices.length - 1;
      while(l < prices.length && r >= 0) {
        maxLeftProfit = Math.max(maxLeftProfit, prices[l] - min);
        profits[l] += maxLeftProfit;
        if(prices[l] < min) min = prices[l];

        maxRightProfit = Math.max(maxRightProfit, max - prices[r]);
        profits[r] += maxRightProfit;
        if(prices[r] > max) max = prices[r];

        maxProfit = Math.max(Math.max(maxProfit, profits[l]), profits[r]);

        l++;
        r--;
      }

      return maxProfit;
    }
    static public int maxProfit(int k, int[] prices) {
      Integer[][] mem = new Integer[prices.length][k + 1];
      return findMaxWithK(k, prices, 0, prices.length - 1, mem);
    }

    static int findMaxWithK(int k, int[] prices, int l, int h, Integer[][] mem) {
      if(k <= 0 || l >= h) return 0;
      if(mem[l][k] != null) return mem[l][k];
      int profit = 0;
      int min = prices[l];
      for(int i = l + 1; i <= h; i++) {
        min = Math.min(min, prices[i]);
        int bookedProfit = prices[i] - min + findMaxWithK(k - 1, prices, i + 1, h, mem);
        profit = Math.max(profit, bookedProfit);
      }
      mem[l][k] = profit;
      return profit;
    }
}
