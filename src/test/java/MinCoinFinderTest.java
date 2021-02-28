import org.junit.Assert;
import org.junit.Test;

public class MinCoinFinderTest {
    @Test
    public void findValue() {
        int actual = MinCoinFinder.minCoinFinder(1);
        int expected = 1;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.minCoinFinder(5);
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.minCoinFinder(6);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.minCoinFinder(11);
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.minCoinFinder(16);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.minCoinFinder(25);
        expected = 3;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.minCoinFinder(30);
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = MinCoinFinder.minCoinFinder(55);
        expected = 5;
        Assert.assertEquals(expected, actual);
    }
}