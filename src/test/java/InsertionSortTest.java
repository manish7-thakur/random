import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {
    @Test
    public void singleElem() {
        int[] actual = new int[]{1};
        InsertionSort.sortRec(actual, 0, 0);
        int[] expected = new int[]{1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void doubleElems() {
        int[] actual = new int[]{2, 1};
        InsertionSort.sortRec(actual, 0, 1);
        int[] expected = new int[]{1, 2};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void TripleElems() {
        int[] actual = new int[]{2, 3, 1};
        InsertionSort.sortRec(actual, 0, 2);
        int[] expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void MultiElems() {
        int[] actual = new int[]{2, 3, 1, 38, 15, 2, 26, 4, 7, 29, 3, 3, 28, 58, 2};
        InsertionSort.sortRec(actual, 0, 14);
        int[] expected = new int[]{1, 2, 2, 2, 3, 3, 3, 4, 7, 15, 26, 28, 29, 38, 58};
        Assert.assertArrayEquals(expected, actual);
    }

}