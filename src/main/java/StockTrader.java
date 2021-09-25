public class StockTrader {
  static public int maxProfit(int[] prices) {
    int[] leftProfits = new int[prices.length];
    int[] rightProfits = new int[prices.length];
    int maxProfit = 0, maxLeftProfit = 0, maxRightProfit = 0;
    int min = prices[0];
    int max = prices[prices.length - 1];
    int l = 0, r = prices.length - 1;
    while(l < prices.length && r >= 0) {
      maxLeftProfit = Math.max(maxLeftProfit, prices[l] - min);
      leftProfits[l] = maxLeftProfit;
      if(prices[l] < min) {
        min = prices[l];
      }
      maxRightProfit = Math.max(maxRightProfit, max - prices[r]);
      rightProfits[r] = maxRightProfit;
      if(prices[r] > max) {
        max = prices[r];
      }
      l++;
      r--;
    }

    for(int i = 0; i < leftProfits.length; i++) {
      maxProfit = Math.max(maxProfit, leftProfits[i] + rightProfits[i]);
    }
    return maxProfit;
  }

  static public int maxProfit2(int[] prices) {
    int leftMaxProfit = 0;
    int rightMaxProfit = 0;
    int leftMin = prices[0];
    int rightMax = prices[prices.length - 1];
    int maxProfit = 0;
    int l = 0;
    int r = prices.length - 1;
    int lbound = l;
    int rbound = r;

    while(l < prices.length && r >= 0) {
      int newProfit = prices[l] - leftMin;
      if(newProfit > leftMaxProfit) {
        leftMaxProfit = newProfit;
        lbound = l;
      }

      newProfit = rightMax - prices[r];
      if(newProfit > rightMaxProfit) {
        rightMaxProfit = newProfit;
        rbound = r;
      }

      maxProfit = lbound > rbound ? Math.max(Math.max(maxProfit, leftMaxProfit), rightMaxProfit) : leftMaxProfit + rightMaxProfit;

      if(prices[l] < leftMin) leftMin = prices[l];
      if(prices[r] > rightMax) rightMax = prices[r];

      l++;
      r--;
    }
    return maxProfit;
  }
}
