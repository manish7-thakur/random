import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {
    @Test
    public void partitonArray() {
        int actual = Quicksort.partition(new int[]{1}, 0, 0);
        int expected = 0;
        Assert.assertEquals(expected, actual);

        actual = Quicksort.partition(new int[]{2, 1}, 0, 1);
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = Quicksort.partition(new int[]{3, 2, 1}, 0, 2);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = Quicksort.partition(new int[]{1, 2, 3}, 0, 2);
        expected = 0;
        Assert.assertEquals(expected, actual);

        actual = Quicksort.partition(new int[]{2, 1, 3}, 0, 2);
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = Quicksort.partition(new int[]{3, 2, 1, 4}, 0, 3);
        expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortArray() {
        int[] actual = new int[]{1};
        Quicksort.sort(actual, 0, 0);
        int[] expected = new int[]{1};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{2, 1};
        Quicksort.sort(actual, 0, 1);
        expected = new int[]{1, 2};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{2, 1, 3};
        Quicksort.sort(actual, 0, 2);
        expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{4, 2, 1, 3};
        Quicksort.sort(actual, 0, 3);
        expected = new int[]{1, 2, 3, 4};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{4, 2, 1, 3, 5};
        Quicksort.sort(actual, 0, 4);
        expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{4, 2, 1, 6, 3, 5};
        Quicksort.sort(actual, 0, 5);
        expected = new int[]{1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{4, 3, 1, 6, 3, 5};
        Quicksort.sort(actual, 0, 5);
        expected = new int[]{1, 3, 3, 4, 5, 6};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{4, 3, 1, 6, 3, 6};
        Quicksort.sort(actual, 0, 5);
        expected = new int[]{1, 3, 3, 4, 6, 6};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{438, 74, 93, 33, 841, 64, 3, 4, 294, 272, 674};
        Quicksort.sort(actual, 0, 10);
        expected = new int[]{3, 4, 33, 64, 74, 93, 272, 294, 438, 674, 841};
        Assert.assertArrayEquals(expected, actual);
    }
}