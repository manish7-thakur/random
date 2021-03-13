public class MaximumSubarrayFinder {

    static int maxSubarraySum(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        return maxSubarraySum(arr, 0, arr.length - 1);
    }

    static int maxSubarraySum(int[] arr, int l, int h) {
        if (l == h) {
            return arr[l];
        }
        int m = (l + h) / 2;
        int left_sum = maxSubarraySum(arr, l, m);
        int right_sum = maxSubarraySum(arr, m + 1, h);
        int cross_sum = maxCrossOverSum(arr, l, m, h);
        return Math.max(Math.max(left_sum, right_sum), cross_sum);
    }

    static int maxCrossOverSum(int[] arr, int l, int m, int h) {
        int left_sum = Integer.MIN_VALUE;
        int right_sum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = m; i >= l; i--) {
            sum += arr[i];
            if (sum > left_sum) {
                left_sum = sum;
            }
        }
        sum = 0;
        for (int i = m + 1; i <= h; i++) {
            sum += arr[i];
            if (sum > right_sum) {
                right_sum = sum;
            }
        }
        return Math.max(Math.max(left_sum, right_sum), left_sum + right_sum);
    }

    static int maxSubarraySumBruteForce(int[] arr) {
        int resSum = 0;
        for(int i =0; i< arr.length; i++) {
            int currSum = arr[i];
            if(currSum > resSum) {
                resSum = currSum;
            }
            for(int j = i+1; j< arr.length; j++) {
                currSum += arr[j];
                if(currSum > resSum) {
                    resSum = currSum;
                }
            }
        }
        return resSum;
    }
}