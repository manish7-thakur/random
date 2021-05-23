import org.junit.Assert;
import org.junit.Test;

public class CountryCounterTest {
    @Test
    public void countCountries() {
        int actual = CountryCounter.count(new int[][]{{1, 1}});
        int expected = 1;
        Assert.assertEquals(expected, actual);

        actual = CountryCounter.count(new int[][]{{1, 2}});
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = CountryCounter.count(new int[][]{
                {1, 1},
                {1, 1}});
        expected = 1;
        Assert.assertEquals(expected, actual);
        actual = CountryCounter.count(new int[][]{
                {1, 2},
                {1, 2}});
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = CountryCounter.count(new int[][]{
                {1, 3},
                {1, 2}});
        expected = 3;
        Assert.assertEquals(expected, actual);

        actual = CountryCounter.count(new int[][]{
                {1, 3},
                {4, 2}});
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = CountryCounter.count(new int[][]{
                {1, 1, 2},
                {3, 3, 2},
                {1, 4, 5}});
        expected = 6;
        Assert.assertEquals(expected, actual);
    }
}