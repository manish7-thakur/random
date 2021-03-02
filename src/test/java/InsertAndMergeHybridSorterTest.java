import org.junit.Assert;
import org.junit.Test;

public class InsertAndMergeHybridSorterTest {
    @Test
    public void mergeTwoElems() {
        int[] actual = new int[]{2, 1};
        InsertAndMergeHybridSorter.merge(actual, 0, 1, 2);
        int[] expected = new int[]{1, 2};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{2, 1, 3};
        InsertAndMergeHybridSorter.merge(actual, 0, 1, 3);
        expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{2, 1, 3};
        InsertAndMergeHybridSorter.merge(actual, 1, 2, 3);
        expected = new int[]{2, 1, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{2, 2, 1, 3};
        InsertAndMergeHybridSorter.merge(actual, 0, 2, 4);
        expected = new int[]{1, 2, 2, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{2, 2, 1, 3};
        InsertAndMergeHybridSorter.merge(actual, 1, 2, 3);
        expected = new int[]{2, 1, 2, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{2, 2, 4, 1, 3};
        InsertAndMergeHybridSorter.merge(actual, 0, 3, 5);
        expected = new int[]{1, 2, 2, 3, 4};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{2, 2, 4, 1, 3};
        InsertAndMergeHybridSorter.merge(actual, 2, 3, 5);
        expected = new int[]{2, 2, 1, 3, 4};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{2, 2, 4, 1, 3, 6};
        InsertAndMergeHybridSorter.merge(actual, 0, 3, 6);
        expected = new int[]{1, 2, 2, 3, 4, 6};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{2, 2, 4, 7, 9, 16, 25, 64, 75, 1, 3, 6, 12, 36, 46, 67, 76};
        InsertAndMergeHybridSorter.merge(actual, 0, 9, 16);
        expected = new int[]{1, 2, 2, 3, 4, 6, 7, 9, 12, 16, 25, 36, 46, 64, 67, 75, 76};
        Assert.assertArrayEquals(expected, actual);
    }
}