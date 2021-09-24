import org.junit.*;

public class StockTraderTest {
  @Test
  public void findMaxProfitFrom2Transactions() {
    int actual = StockTrader.maxProfit(new int[]{1});
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = StockTrader.maxProfit(new int[]{1, 2});
    expected = 1;
    Assert.assertEquals(expected, actual);
  }
}
