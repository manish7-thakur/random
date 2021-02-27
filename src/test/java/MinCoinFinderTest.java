import org.junit.Assert;
import org.junit.Test;

public class MinCoinFinderTest {
    @Test
    public void findValue() {
        int actual = MinCoinFinder.CoinDeterminerRec(1, 0);
        int expected = 1;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.CoinDeterminerRec(5, 0);
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.CoinDeterminerRec(6, 0);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.CoinDeterminerRec(11, 0);
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.CoinDeterminerRec(16, 0);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.CoinDeterminerRec(25, 0);
        expected = 3;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.CoinDeterminerRec(30, 0);
        expected = 4;
        Assert.assertEquals(expected, actual);
    }
}