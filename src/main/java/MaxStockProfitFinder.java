public class MaxStockProfitFinder {
    static int calc(int[] arr) {
        int[] priceChange = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            priceChange[i - 1] = arr[i] - arr[i - 1];
        }
        return MaximumSubarrayFinder.maxSubarraySum(priceChange).sum;
    }
}