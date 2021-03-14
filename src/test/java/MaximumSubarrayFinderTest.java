import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayFinderTest {
    @Test
    public void maxCrossOverSum() {
        MaximumSubarrayFinder.SubArrayResult actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{5}, 0, 0, 0);
        MaximumSubarrayFinder.SubArrayResult expected = new MaximumSubarrayFinder.SubArrayResult(5, 0, 0);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{5, -1}, 0, 0, 1);
        expected = new MaximumSubarrayFinder.SubArrayResult(5, 0, 0);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{5, 6}, 0, 1, 1);
        expected = new MaximumSubarrayFinder.SubArrayResult(11, 0, 1);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{-5, 6}, 0, 0, 1);
        expected = new MaximumSubarrayFinder.SubArrayResult(6, 1, 1);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{-5, 6}, 0, 1, 1);
        expected = new MaximumSubarrayFinder.SubArrayResult(6, 1, 1);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{-5, 6, 7}, 0, 1, 2);
        expected = new MaximumSubarrayFinder.SubArrayResult(13, 1, 2);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{6, -2, 3}, 0, 1, 2);
        expected = new MaximumSubarrayFinder.SubArrayResult(7, 0, 2);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{1, 3, 6, -2, 3}, 0, 2, 4);
        expected = new MaximumSubarrayFinder.SubArrayResult(11, 0, 4);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxCrossOverSum(new int[]{1, 3, -6, -2, 3}, 0, 2, 4);
        expected = new MaximumSubarrayFinder.SubArrayResult(1, 3, 4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxSubarraySum() {
        MaximumSubarrayFinder.SubArrayResult actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{4});
        MaximumSubarrayFinder.SubArrayResult expected = new MaximumSubarrayFinder.SubArrayResult(4, 0, 0);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{4, 5});
        expected = new MaximumSubarrayFinder.SubArrayResult(9, 0, 1);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{4, -2, 5});
        expected = new MaximumSubarrayFinder.SubArrayResult(7, 0, 2);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{-1, -2, 2});
        expected = new MaximumSubarrayFinder.SubArrayResult(2, 2, 2);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{3, -2, 2, 5});
        expected = new MaximumSubarrayFinder.SubArrayResult(8, 0, 3);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{3, -2, 2, -5});
        expected = new MaximumSubarrayFinder.SubArrayResult(3, 0, 0);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{3, -2, 1, 2, -5});
        expected = new MaximumSubarrayFinder.SubArrayResult(4, 0, 3);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7});
        expected = new MaximumSubarrayFinder.SubArrayResult(43, 7, 10);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySum(new int[]{-13, -3, -25, -20, -3, -16, -23, -18, -20, -7, -12, -5, -22, -15, -4, -7});
        expected = new MaximumSubarrayFinder.SubArrayResult(-3, 1, 1);
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

    @Test
    public void maxSubarraySumLinear() {
        MaximumSubarrayFinder.SubArrayResult actual = MaximumSubarrayFinder.maxSubarraySumLinear(new int[]{4});
        MaximumSubarrayFinder.SubArrayResult expected = new MaximumSubarrayFinder.SubArrayResult(4, 0, 0);
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumLinear(new int[]{4, 5});
        expected = new MaximumSubarrayFinder.SubArrayResult(9, 0, 1);
        ;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumLinear(new int[]{4, -2, 5});
        expected = new MaximumSubarrayFinder.SubArrayResult(7, 0, 2);
        ;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumLinear(new int[]{-1, -2, 2});
        expected = new MaximumSubarrayFinder.SubArrayResult(2, 2, 2);
        ;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumLinear(new int[]{3, -2, 2, 5});
        expected = new MaximumSubarrayFinder.SubArrayResult(8, 0, 3);
        ;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumLinear(new int[]{3, -2, 2, -5});
        expected = new MaximumSubarrayFinder.SubArrayResult(3, 0, 0);
        ;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumLinear(new int[]{3, -2, 1, 2, -5});
        expected = new MaximumSubarrayFinder.SubArrayResult(4, 0, 3);
        ;
        Assert.assertEquals(expected, actual);

        actual = MaximumSubarrayFinder.maxSubarraySumLinear(new int[]{13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7});
        expected = new MaximumSubarrayFinder.SubArrayResult(43, 7, 10);
        ;
        Assert.assertEquals(expected, actual);
    }
}