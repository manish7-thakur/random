import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class MaxStockProfitFinderTest {
    @Test
    public void findMaxProfit() {
      int actual = MaxStockProfitFinder.maxProfit(new int[]{2});
      int expected = 0;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(new int[]{1, 2});
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(new int[]{3, 2, 4});
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(new int[]{3, 2, 4, 1, 5});
      expected = 4;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(new int[]{3, 2, 4, 0, 1});
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
      expected = 5;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(new int[]{7, 6, 4, 3, 1});
      expected = 0;
      Assert.assertEquals(expected, actual);
    }

    @Test
    public void findmaxProfitFrom2Transactions() {
       int actual = MaxStockProfitFinder.maxProfit2(new int[]{1});
       int expected = 0;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit2(new int[]{1, 2});
       expected = 1;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit2(new int[]{2, 1});
       expected = 0;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit2(new int[]{1, 2, 4});
       expected = 3;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit2(new int[]{1, 2, 1, 6});
       expected = 6;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit2(new int[]{5, 1, 2, 1});
       expected = 1;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit2(new int[]{0, 8, 1, 9, 10});
       expected = 17;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit2(new int[]{1, 2, 3, 4, 5});
       expected = 4;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit2(new int[]{3, 3, 5, 0, 0, 3, 1, 4});
       expected = 6;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit2(new int[]{7, 6, 4, 3, 1});
       expected = 0;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit2(new int[]{1, 2, 4, 8, 1, 16});
       expected = 22;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit2(new int[]{19, 10, 11, 4, 8, 1, 16});
       expected = 19;
       Assert.assertEquals(expected, actual);

       actual = MaxStockProfitFinder.maxProfit2(new int[]{1, 1, 2, 2, 1, 1, 3, 3, 2, 4, 6, 3, 10, 5, 3});
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

      actual = MaxStockProfitFinder.maxProfit(1, new int[]{2, 1, 4});
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(1, new int[]{1, 3, 1, 4});
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(2, new int[]{1, 3, 1, 4});
      expected = 5;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(2, new int[]{3, 3, 3, 3});
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(2, new int[]{3, 2, 6, 5, 0, 3});
      expected = 7;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(2, new int[]{5, 6, 1, 2, 5, 4, 1, 2, 5, 6});
      expected = 9;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(3, new int[]{5, 3, 2, 4, 7, 2, 5, 0});
      expected = 8;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(5, new int[]{4, 3, 18, 49, 11, 95, 58, 81, 21, 85, 8, 59});
      expected = 268;
      Assert.assertEquals(expected, actual);

      actual = MaxStockProfitFinder.maxProfit(29, new int[]{70,4,83,56,94,72,78,43,2,86,65,100,94,56,41,66,3,33,10,3,45,94,15,12,78,60,58,0,58,15,21,7,11,41,12,96,83,77,47,62,27,19,40,63,30,4,77,52,17,57,21,66,63,29,51,40,37,6,44,42,92,16,64,33,31,51,36,0,29,95,92,35,66,91,19,21,100,95,40,61,15,83,31,55,59,84,21,99,45,64,90,25,40,6,41,5,25,52,59,61,51,37,92,90,20,20,96,66,79,28,83,60,91,30,52,55,1,99,8,68,14,84,59,5,34,93,25,10,93,21,35,66,88,20,97,25,63,80,20,86,33,53,43,86,53,55,61,77,9,2,56,78,43,19,68,69,49,1,6,5,82,46,24,33,85,24,56,51,45,100,94,26,15,33,35,59,25,65,32,26,93,73,0,40,92,56,76,18,2,45,64,66,64,39,77,1,55,90,10,27,85,40,95,78,39,40,62,30,12,57,84,95,86,57,41,52,77,17,9,15,33,17,68,63,59,40,5,63,30,86,57,5,55,47,0,92,95,100,25,79,84,93,83,93,18,20,32,63,65,56,68,7,31,100,88,93,11,43,20,13,54,34,29,90,50,24,13,44,89,57,65,95,58,32,67,38,2,41,4,63,56,88,39,57,10,1,97,98,25,45,96,35,22,0,37,74,98,14,37,77,54,40,17,9,28,83,13,92,3,8,60,52,64,8,87,77,96,70,61,3,96,83,56,5,99,81,94,3,38,91,55,83,15,30,39,54,79,55,86,85,32,27,20,74});
      expected = 2627;
      Assert.assertEquals(expected, actual);
    }
}
