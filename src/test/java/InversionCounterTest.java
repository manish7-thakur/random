import org.junit.Assert;
import org.junit.Test;

public class InversionCounterTest {
    @Test
    public void singleElemSortedArrays() {
        int actual = InversionCounter.mergeCount(new int[]{1, 2}, 0, 0, 1);
        int expected = 0;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.mergeCount(new int[]{2, 1}, 0, 0, 1);
        expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoElemSortedArrays() {
        int actual = InversionCounter.mergeCount(new int[]{1, 3, 2}, 0, 1, 2);
        int expected = 1;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.mergeCount(new int[]{3, 1, 2}, 0, 0, 2);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.mergeCount(new int[]{3, 2, 1}, 1, 1, 2);
        expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void threeElemSortedArrays() {
        int actual = InversionCounter.mergeCount(new int[]{1, 3, 2, 4}, 0, 1, 3);
        int expected = 1;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.mergeCount(new int[]{3, 1, 2, 4}, 0, 0, 3);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.mergeCount(new int[]{2, 3, 4, 1}, 0, 2, 3);
        expected = 3;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.mergeCount(new int[]{3, 4, 1, 2}, 0, 1, 3);
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.mergeCount(new int[]{3, 4, 1, 2}, 1, 1, 2);
        expected = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void fourElemSortedArrays() {
        int actual = InversionCounter.mergeCount(new int[]{1, 3, 5, 2, 4}, 0, 2, 4);
        int expected = 3;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.mergeCount(new int[]{3, 4, 5, 1, 2}, 0, 2, 4);
        expected = 6;
        Assert.assertEquals(expected, actual);


        actual = InversionCounter.mergeCount(new int[]{3, 4, 1, 2, 5}, 0, 1, 4);
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.mergeCount(new int[]{3, 1, 2, 4, 5}, 0, 0, 4);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.mergeCount(new int[]{3, 1, 4, 5, 2}, 2, 3, 4);
        expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void randomElemsArray() {
        int actual = InversionCounter.count(new int[]{1, 3});
        int expected = 0;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.count(new int[]{3, 1});
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.count(new int[]{3, 2, 1});
        expected = 3;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.count(new int[]{3, 2, 1});
        expected = 3;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.count(new int[]{3, 2, 4, 1});
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.count(new int[]{2, 3, 4, 1});
        expected = 3;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.count(new int[]{4, 3, 2, 1});
        expected = 6;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.count(new int[]{4, 3, 5, 2, 1});
        expected = 8;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.count(new int[]{1, 2, 3, 4, 5});
        expected = 0;
        Assert.assertEquals(expected, actual);

        actual = InversionCounter.count(new int[]{5, 4, 3, 2, 1});
        expected = 10;
        Assert.assertEquals(expected, actual);
    }
}