import org.junit.Assert;
import org.junit.Test;

public class ArrayArrangerTest {
    @Test
    public void arrangeSingleElem() {
        int[] actual = ArrayArranger.arrange(new int[]{3});
        int[] expected = new int[]{3};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayArranger.arrange(new int[]{3, 1});
        expected = new int[]{1, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayArranger.arrange(new int[]{1, 2, 3});
        expected = new int[]{1, 3, 2};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayArranger.arrange(new int[]{1, 3, 4, 2});
        expected = new int[]{1, 4, 2, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayArranger.arrange(new int[]{1, 5, 3, 4, 2});
        expected = new int[]{1, 5, 3, 4, 2};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayArranger.arrange(new int[]{1, 2, 3, 4, 5});
        expected = new int[]{1, 3, 2, 5, 4};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayArranger.arrange(new int[]{5, 4, 3, 2, 1});
        expected = new int[]{4, 5, 2, 3, 1};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayArranger.arrange(new int[]{1, 2, 3, 4, 5, 6});
        expected = new int[]{1, 3, 2, 5, 4, 6};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayArranger.arrange(new int[]{6, 5, 4, 3, 2, 1});
        expected = new int[]{5, 6, 3, 4, 1, 2};
        Assert.assertArrayEquals(expected, actual);
    }
}
