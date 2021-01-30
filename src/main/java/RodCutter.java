public class RodCutter {
    public static int maxProfit(int[] prices, int n) {
        return findProfit(prices, n, 1);
    }

    static int findProfit(int[] prices, int n, int i) {
        if (n == 0 || i > n) {
            return 0;
        }
        return Math.max(prices[i] + findProfit(prices, n - i, i), findProfit(prices, n, i + 1));
    }
}	