import java.util.*;

public class MaxStockProfitFinder {
    static int calc(int[] arr) {
        int[] priceChange = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            priceChange[i - 1] = arr[i] - arr[i - 1];
        }
        return MaximumSubarrayFinder.maxSubarraySum(priceChange).sum;
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
      Map<String, Integer> mem = new HashMap<>();
      return findMaxWithK(k, prices, 0, 0, prices.length - 1, mem);
    }

    static int findMaxWithK(int k, int[] prices, int l, int p, int h, Map<String, Integer> mem) {
      if(k <= 0 || p > h) return 0;
      String key = getKey(l , p, k);
      if(mem.containsKey(key)) return mem.get(key);
      int p1 = 0;
      if(prices[p] > prices[l]) p1 = (prices[p] - prices[l]) + findMaxWithK(k - 1, prices, p, p, h, mem);
      int p2 = findMaxWithK(k, prices, l, p + 1, h, mem);
      int p3 = findMaxWithK(k, prices, l + 1, l + 1, h, mem);
      int res = Math.max(Math.max(p1, p2), p3);
      mem.put(key, res);
      return res;
    }
    static String getKey(int a , int b, int c){
      return a + "," + b + "," + c;
    }
}
