import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {
    @Test
    public void twoElemMergeSort() {
        int[] actual = {1, 2};
        MergeSort.sort(actual);
        int[] expected = new int[]{1, 2};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{2, 1};
        MergeSort.sort(actual);
        expected = new int[]{1, 2};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void threeElemMergeSort() {
        int[] actual = new int[]{1, 3, 2};
        MergeSort.sort(actual);
        int[] expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{3, 2, 2};
        MergeSort.sort(actual);
        expected = new int[]{2, 2, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{3, 2, 1};
        MergeSort.sort(actual);
        expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void fourElemMergeSort() {
        int[] actual = new int[]{1, 3, 2, 4};
        MergeSort.sort(actual);
        int[] expected = new int[]{1, 2, 3, 4};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{4, 3, 2, 2};
        MergeSort.sort(actual);
        expected = new int[]{2, 2, 3, 4};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{3, 4, 2, 1};
        MergeSort.sort(actual);
        expected = new int[]{1, 2, 3, 4};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void multiElemMergeSort() {
        int[] actual = new int[]{1, 3, 2, 4, 36, 256, 23, 42, 53, 6, 2, 52, 32, 432, 32};
        MergeSort.sort(actual);
        int[] expected = new int[]{1, 2, 2, 3, 4, 6, 23, 32, 32, 36, 42, 52, 53, 256, 432};
        Assert.assertArrayEquals(expected, actual);
    }
}