import org.junit.Assert;
import org.junit.Test;

public class InsertAndMergeHybridSorterTest {
    @Test
    public void mergeElems() {
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

    @Test
    public void insertionMergeSort() {
        int[] actual = new int[]{3, 1};
        InsertAndMergeHybridSorter.sort(actual);
        int[] expected = new int[]{1, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{3, 1, 4, 6, 5};
        InsertAndMergeHybridSorter.sort(actual);
        expected = new int[]{1, 3, 4, 5, 6};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{3, 1, 4, 6, 5, 228, 62, 16, 263, 26};
        InsertAndMergeHybridSorter.sort(actual);
        expected = new int[]{1, 3, 4, 5, 6, 16, 26, 62, 228, 263};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{3, 1, 4, 6, 5, 228, 62, 16, 263, 26, 2, 48, 28, 18, 482, 4823, 28392, 328, 362, 362, 362, 18, 492,
                382, 382, 3482, 4872, 372, 372, 3872, 486, 509, 683, 3723, 372, 4872, 4729, 472, 728, 472, 372, 4723, 37};
        InsertAndMergeHybridSorter.sort(actual);
        expected = new int[]{1, 2, 3, 4, 5, 6, 16, 18, 18, 26, 28, 37, 48, 62, 228, 263, 328, 362, 362, 362, 372, 372, 372, 372, 382, 382, 482, 486, 492, 509, 3482, 3872, 4729, 4823, 4872, 472, 472, 728, 4723, 4872, 683, 3723, 28392};
        Assert.assertArrayEquals(expected, actual);
    }
}