import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayFinderTest {
    @Test
    public void maxCrossOverSum() {
        int actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{5}, 0, 0, 0);
        int expected = 5;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{5, -1}, 0, 0, 1);
        expected = 5;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{5, 6}, 0, 1, 1);
        expected = 11;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{-5, 6}, 0, 0, 1);
        expected = 6;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{-5, 6}, 0, 1, 1);
        expected = 6;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{-5, 6, 7}, 0, 1, 2);
        expected = 13;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{6, -2, 3}, 0, 1, 2);
        expected = 7;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{1, 3, 6, -2, 3}, 0, 2, 4);
        expected = 11;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{1, 3, -6, -2, 3}, 0, 2, 4);
        expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxSubarraySum() {
        int actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{4});
        int expected = 4;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{4, 5});
        expected = 9;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{4, -2, 5});
        expected = 7;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{-1, -2, 2});
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{3, -2, 2, 5});
        expected = 8;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{3, -2, 2, -5});
        expected = 3;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{3, -2, 1, 2, -5});
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7});
        expected = 43;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{-13, -3, -25, -20, -3, -16, -23, -18, -20, -7, -12, -5, -22, -15, -4, -7});
        expected = -3;
        Assert.assertEquals(expected, actual);
    }

        @Test
    public void maxSubarraySumBruteForce() {
        int actual = MaximumSubarrayFinder.maxSubarraySumBruteForce(new int[]{4});
        int expected = 4;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumBruteForce(new int[]{4, 5});
        expected = 9;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumBruteForce(new int[]{4, -2, 5});
        expected = 7;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumBruteForce(new int[]{-1, -2, 2});
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumBruteForce(new int[]{3, -2, 2, 5});
        expected = 8;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumBruteForce(new int[]{3, -2, 2, -5});
        expected = 3;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumBruteForce(new int[]{3, -2, 1, 2, -5});
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumBruteForce(new int[]{13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7});
        expected = 43;
        Assert.assertEquals(expected, actual);
    }
}