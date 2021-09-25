import org.junit.*;

public class StockTraderTest {
  @Test
  public void findmaxProfitFrom2Transactions() {
    int actual = StockTrader.maxProfit2(new int[]{1});
    int expected = 0;
    Assert.assertEquals(expected, actual);

//    actual = StockTrader.maxProfit2(new int[]{1, 2});
//    expected = 1;
//    Assert.assertEquals(expected, actual);
//
//    actual = StockTrader.maxProfit2(new int[]{2, 1});
//    expected = 0;
//    Assert.assertEquals(expected, actual);
//
//    actual = StockTrader.maxProfit2(new int[]{1, 2, 4});
//    expected = 3;
//    Assert.assertEquals(expected, actual);
//
//    actual = StockTrader.maxProfit2(new int[]{1, 2, 1, 6});
//    expected = 6;
//    Assert.assertEquals(expected, actual);
//
//    actual = StockTrader.maxProfit2(new int[]{5, 1, 2, 1});
//    expected = 1;
//    Assert.assertEquals(expected, actual);
//
//    actual = StockTrader.maxProfit2(new int[]{0, 8, 1, 9, 10});
//    expected = 17;
//    Assert.assertEquals(expected, actual);
//
//    actual = StockTrader.maxProfit2(new int[]{1, 2, 3, 4, 5});
//    expected = 4;
//    Assert.assertEquals(expected, actual);

    actual = StockTrader.maxProfit2(new int[]{3, 3, 5, 0, 0, 3, 1, 4});
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = StockTrader.maxProfit2(new int[]{7, 6, 4, 3, 1});
    expected = 0;
    Assert.assertEquals(expected, actual);
  }
}
