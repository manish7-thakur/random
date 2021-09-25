import org.junit.*;

public class StockTraderTest {
  @Test
  public void findmaxProfitFrom2Transactions() {
     int actual = StockTrader.maxProfit(new int[]{1});
     int expected = 0;
     Assert.assertEquals(expected, actual);

     actual = StockTrader.maxProfit(new int[]{1, 2});
     expected = 1;
     Assert.assertEquals(expected, actual);

     actual = StockTrader.maxProfit(new int[]{2, 1});
     expected = 0;
     Assert.assertEquals(expected, actual);

     actual = StockTrader.maxProfit(new int[]{1, 2, 4});
     expected = 3;
     Assert.assertEquals(expected, actual);

     actual = StockTrader.maxProfit(new int[]{1, 2, 1, 6});
     expected = 6;
     Assert.assertEquals(expected, actual);

     actual = StockTrader.maxProfit(new int[]{5, 1, 2, 1});
     expected = 1;
     Assert.assertEquals(expected, actual);

     actual = StockTrader.maxProfit(new int[]{0, 8, 1, 9, 10});
     expected = 17;
     Assert.assertEquals(expected, actual);

     actual = StockTrader.maxProfit(new int[]{1, 2, 3, 4, 5});
     expected = 4;
     Assert.assertEquals(expected, actual);

     actual = StockTrader.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4});
     expected = 6;
     Assert.assertEquals(expected, actual);

     actual = StockTrader.maxProfit(new int[]{7, 6, 4, 3, 1});
     expected = 0;
     Assert.assertEquals(expected, actual);

     actual = StockTrader.maxProfit(new int[]{1, 2, 4, 8, 1, 16});
     expected = 22;
     Assert.assertEquals(expected, actual);

     actual = StockTrader.maxProfit(new int[]{19, 10, 11, 4, 8, 1, 16});
     expected = 19;
     Assert.assertEquals(expected, actual);

     actual = StockTrader.maxProfit(new int[]{1, 1, 2, 2, 1, 1, 3, 3, 2, 4, 6, 3, 10, 5, 3});
     expected = 12;
     Assert.assertEquals(expected, actual);
  }
}
