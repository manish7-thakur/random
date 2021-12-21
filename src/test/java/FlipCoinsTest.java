import org.junit.Assert;
import org.junit.Test;

public class FlipCoinsTest {
    @Test
    public  void testMinCoinFlips() {
      int actual = FlipCoins.minimumCoinFlips("H");
      int expected = 0;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minimumCoinFlips("T");
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minimumCoinFlips("TH");
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minimumCoinFlips("HHHT");
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minimumCoinFlips("TTHHH");
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minimumCoinFlips("HTTTTTT");
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minimumCoinFlips("HTTTHTT");
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minimumCoinFlips("TTTTHTT");
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minimumCoinFlips("HTHTHTTT");
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minimumCoinFlips("HTHTHTHT");
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minimumCoinFlips("TTTTTTH");
      expected = 1;
      Assert.assertEquals(expected, actual);

    }
    @Test
    public void testMinCharFlips() {
      int actual = FlipCoins.minFlipsMonoIncr("0");
      int expected = 0;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minFlipsMonoIncr("10");
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minFlipsMonoIncr("11");
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minFlipsMonoIncr("00");
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minFlipsMonoIncr("0011");
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minFlipsMonoIncr("1100");
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minFlipsMonoIncr("010101");
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minFlipsMonoIncr("0101010000");
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = FlipCoins.minFlipsMonoIncr("11001011011");
      expected = 4;
      Assert.assertEquals(expected, actual);
    }

}
