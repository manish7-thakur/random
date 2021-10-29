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
}
