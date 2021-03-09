public class MaximumSubarrayFinder {
	static int findMaxCrossOverSum(int[] arr, int l, int m, int h) {
		int left_sum = Integer.MIN_VALUE;
		int right_sum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = m; i >= l; i--) {
			sum += arr[i];
			if(sum > left_sum) {
				left_sum = sum;
			}
		}
		sum = 0;
		for(int i = m+1; i <= h; i++) {
			sum += arr[i];
			if(sum > right_sum) {
				right_sum = sum;
			}
		}
		return Math.max(Math.max(left_sum, right_sum), left_sum+right_sum);
	}
}