import org.junit.Assert;
import org.junit.Test;

public class MaxStockProfitFinderTest {
    @Test
    public void maxProfit() {
        int actual = MaxStockProfitFinder.calc(new int[]{2, 1});
        int expected = -1;
        Assert.assertEquals(expected, actual);

        actual = MaxStockProfitFinder.calc(new int[]{1, 2});
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = MaxStockProfitFinder.calc(new int[]{20, 3, 32});
        expected = 29;
        Assert.assertEquals(expected, actual);

        actual = MaxStockProfitFinder.calc(new int[]{12, 2, 57, 3, 72, 45, 32});
        expected = 70;
        Assert.assertEquals(expected, actual);

        actual = MaxStockProfitFinder.calc(new int[]{12, 2, 57, 3, 72, 45, 32, 53, 73, 82, 2, 91, 32});
        expected = 89;
        Assert.assertEquals(expected, actual);

        actual = MaxStockProfitFinder.calc(new int[]{100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94, 90, 97});
        expected = 43;
        Assert.assertEquals(expected, actual);
    }
}