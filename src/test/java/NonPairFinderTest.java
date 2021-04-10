import org.junit.Assert;
import org.junit.Test;

public class NonPairFinderTest {
    @Test
    public void findNonPair() {
        Integer[] actual = NonPairFinder.find(new int[]{1});
        Integer[] expected = new Integer[]{1};
        Assert.assertArrayEquals(actual, expected);

        actual = NonPairFinder.find(new int[]{1, 1});
        expected = new Integer[]{};
        Assert.assertArrayEquals(actual, expected);

        actual = NonPairFinder.find(new int[]{1, 1, 2});
        expected = new Integer[]{2};
        Assert.assertArrayEquals(actual, expected);

        actual = NonPairFinder.find(new int[]{1, 1, 2, 2, 2});
        expected = new Integer[]{2};
        Assert.assertArrayEquals(actual, expected);

        actual = NonPairFinder.find(new int[]{1, 1, 2, 2, 2, 1});
        expected = new Integer[]{1, 2};
        Assert.assertArrayEquals(actual, expected);
    }
}