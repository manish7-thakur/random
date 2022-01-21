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

        actual = new int[]{1, 3, 2};
        MergeSort.sort(actual);
        expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{3, 2, 2};
        MergeSort.sort(actual);
        expected = new int[]{2, 2, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{3, 2, 1};
        MergeSort.sort(actual);
        expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{1, 3, 2, 4};
        MergeSort.sort(actual);
        expected = new int[]{1, 2, 3, 4};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{4, 3, 2, 2};
        MergeSort.sort(actual);
        expected = new int[]{2, 2, 3, 4};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{3, 4, 2, 1};
        MergeSort.sort(actual);
        expected = new int[]{1, 2, 3, 4};
        Assert.assertArrayEquals(expected, actual);

        actual = new int[]{1, 3, 2, 4, 36, 256, 23, 42, 53, 6, 2, 52, 32, 432, 32};
        MergeSort.sort(actual);
        expected = new int[]{1, 2, 2, 3, 4, 6, 23, 32, 32, 36, 42, 52, 53, 256, 432};
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void findFirstPositiveIndex() {
      int actual = MergeSort.firstPositive(new int[]{1});
      int expected = 0;
      Assert.assertEquals(expected, actual);

      actual = MergeSort.firstPositive(new int[]{0});
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = MergeSort.firstPositive(new int[]{-2, 0});
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = MergeSort.firstPositive(new int[]{-2, -1, 2});
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = MergeSort.firstPositive(new int[]{-3, -2, -1, 1});
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = MergeSort.firstPositive(new int[]{-3, -2, -1});
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = MergeSort.firstPositive(new int[]{-4, -3, -2, -1});
      expected = 4;
      Assert.assertEquals(expected, actual);
    }

    @Test
    public void squareSortedArray() {
      int[] actual = MergeSort.sortedSquares(new int[]{1});
      int[] expected = new int[]{1};
      Assert.assertArrayEquals(expected, actual);

      actual = MergeSort.sortedSquares(new int[]{-2});
      expected = new int[]{4};
      Assert.assertArrayEquals(expected, actual);

      actual = MergeSort.sortedSquares(new int[]{-2, 0, 1});
      expected = new int[]{0, 1, 4};
      Assert.assertArrayEquals(expected, actual);

      actual = MergeSort.sortedSquares(new int[]{-20, -10, 10,});
      expected = new int[]{100, 100, 400};
      Assert.assertArrayEquals(expected, actual);

      actual = MergeSort.sortedSquares(new int[]{-20, -1, 20, 30});
      expected = new int[]{1, 400, 400, 900};
      Assert.assertArrayEquals(expected, actual);

      actual = MergeSort.sortedSquares(new int[]{-20, -10, -1, 20, 30});
      expected = new int[]{1, 100, 400, 400, 900};
      Assert.assertArrayEquals(expected, actual);

      actual = MergeSort.sortedSquares(new int[]{-4, -1, 0, 3, 10});
      expected = new int[]{0, 1, 9, 16, 100};
      Assert.assertArrayEquals(expected, actual);

      actual = MergeSort.sortedSquares(new int[]{-7, -3, 2, 3, 11});
      expected = new int[]{4, 9, 9, 49, 121};
      Assert.assertArrayEquals(expected, actual);

      actual = MergeSort.sortedSquares(new int[]{-7, -4, -3, -2, -1});
      expected = new int[]{1, 4, 9, 16, 49};
      Assert.assertArrayEquals(expected, actual);
    }
}
