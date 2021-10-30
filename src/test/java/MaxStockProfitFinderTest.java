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
    @Test
    public void findmaxProfitFrom2Transactions() {
       int actual = MaxStockProfitFinder.maxProfit(new int[]{1});
       int expected = 0;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit(new int[]{1, 2});
       expected = 1;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit(new int[]{2, 1});
       expected = 0;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit(new int[]{1, 2, 4});
       expected = 3;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit(new int[]{1, 2, 1, 6});
       expected = 6;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit(new int[]{5, 1, 2, 1});
       expected = 1;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit(new int[]{0, 8, 1, 9, 10});
       expected = 17;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit(new int[]{1, 2, 3, 4, 5});
       expected = 4;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4});
       expected = 6;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit(new int[]{7, 6, 4, 3, 1});
       expected = 0;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit(new int[]{1, 2, 4, 8, 1, 16});
       expected = 22;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit(new int[]{19, 10, 11, 4, 8, 1, 16});
       expected = 19;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit(new int[]{1, 1, 2, 2, 1, 1, 3, 3, 2, 4, 6, 3, 10, 5, 3});
       expected = 12;
       Assert.assertEquals(expected, actual);
    }

    @Test
    public void findMaxProfitFromAtmostKTransactions() {
      int actual = MaxStockProfitFinder.maxProfit(0, new int[]{1, 2});
      int expected = 0;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(1, new int[]{1, 2});
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(1, new int[]{1, 2, 4});
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(1, new int[]{1, 3, 1, 4});
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(2, new int[]{1, 3, 1, 4});
      expected = 5;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(2, new int[]{1, 3, 1, 4, 1, 2, 5, 6});
      expected = 8;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(3, new int[]{1, 3, 2, 4, 1, 2, 5, 6});
      expected = 9;
      Assert.assertEquals(expected, actual);
    }

}
