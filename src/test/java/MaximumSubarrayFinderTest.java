import org.junit.*;

public class MaximumSubarrayFinderTest {
	@Test
	public void maxCrossOverSum() {
		int actual = MaximumSubarrayFinder.findMaxCrossOverSum(new int[]{5}, 0,0,0);
		int expected = 5;
		Assert.assertEquals(expected, actual);

		actual = MaximumSubarrayFinder.findMaxCrossOverSum(new int[]{5, -1}, 0,0,1);
		expected = 5;
		Assert.assertEquals(expected, actual);

		actual = MaximumSubarrayFinder.findMaxCrossOverSum(new int[]{5, 6}, 0,1,1);
		expected = 11;
		Assert.assertEquals(expected, actual);

		actual = MaximumSubarrayFinder.findMaxCrossOverSum(new int[]{-5, 6}, 0,0,1);
		expected = 6;
		Assert.assertEquals(expected, actual);

		actual = MaximumSubarrayFinder.findMaxCrossOverSum(new int[]{-5, 6}, 0,1,1);
		expected = 6;
		Assert.assertEquals(expected, actual);

		actual = MaximumSubarrayFinder.findMaxCrossOverSum(new int[]{-5, 6, 7}, 0,1,2);
		expected = 13;
		Assert.assertEquals(expected, actual);

		actual = MaximumSubarrayFinder.findMaxCrossOverSum(new int[]{6, -2, 3}, 0,1,2);
		expected = 7;
		Assert.assertEquals(expected, actual);

		actual = MaximumSubarrayFinder.findMaxCrossOverSum(new int[]{1,3, 6, -2, 3}, 0,2,4);
		expected = 11;
		Assert.assertEquals(expected, actual);

		actual = MaximumSubarrayFinder.findMaxCrossOverSum(new int[]{1,3, -6, -2, 3}, 0,2,4);
		expected = 1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void maxSubarraySum() {
		int actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{4});
		int expected = 5;
		Assert.assertEquals(expected, actual);

	}
}