import org.junit.Assert;
import org.junit.Test;

public class ArrayMergerTest {
    @Test
    public void SingleElemArrays() {
        int[] res = ArrayMerger.merge(new int[]{1}, new int[]{2}, new int[]{3});
        Assert.assertArrayEquals(new int[]{1, 2, 3}, res);
    }

    @Test
    public void SingleElemArraysZeros() {
        int[] res = ArrayMerger.merge(new int[]{0}, new int[]{0}, new int[]{1});
        Assert.assertArrayEquals(new int[]{0, 1, 0}, res);
    }

    @Test
    public void DuplicateSingleElemArrays() {
        int[] res = ArrayMerger.merge(new int[]{1}, new int[]{1}, new int[]{3});
        Assert.assertArrayEquals(new int[]{1, 3, 0}, res);
    }

    @Test
    public void AllDuplicateSingleElemArrays() {
        int[] res = ArrayMerger.merge(new int[]{1}, new int[]{1}, new int[]{1});
        Assert.assertArrayEquals(new int[]{1, 0, 0}, res);
    }

    @Test
    public void DuplicateMultiElemArrays() {
        int[] res = ArrayMerger.merge(new int[]{-1, 0, 5, 9, 30}, new int[]{-9, -2, -1, 0, 2, 28}, new int[]{5, 9, 10, 12, 15});
        Assert.assertArrayEquals(new int[]{-9, -2, -1, 0, 2, 5, 9, 10, 12, 15, 28, 30, 0, 0, 0, 0}, res);
    }
}