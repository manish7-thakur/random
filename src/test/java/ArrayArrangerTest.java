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

    @Test
    public void rotateArraySpecifiedTimes() {
      int[] actual = new int[]{1};
      ArrayArranger.rotate(actual, 0);
      int[] expected = new int[]{1};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2};
      ArrayArranger.rotate(actual, 1);
      expected = new int[]{2};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2};
      ArrayArranger.rotate(actual, 2);
      expected = new int[]{2};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1};
      ArrayArranger.rotate(actual, 1);
      expected = new int[]{1, 2};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1};
      ArrayArranger.rotate(actual, 2);
      expected = new int[]{2, 1};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3};
      ArrayArranger.rotate(actual, 1);
      expected = new int[]{3, 2, 1};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3};
      ArrayArranger.rotate(actual, 2);
      expected = new int[]{1, 3, 2};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3};
      ArrayArranger.rotate(actual, 3);
      expected = new int[]{2, 1, 3};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3};
      ArrayArranger.rotate(actual, 4);
      expected = new int[]{3, 2, 1};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3, 5};
      ArrayArranger.rotate(actual, 4);
      expected = new int[]{2, 1, 3, 5};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3, 5};
      ArrayArranger.rotate(actual, 3);
      expected = new int[]{1, 3, 5, 2};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3, 5};
      ArrayArranger.rotate(actual, 6);
      expected = new int[]{3, 5, 2, 1};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{-1, -100, 3, 99};
      ArrayArranger.rotate(actual, 6);
      expected = new int[]{3, 99, -1, -100};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3, 5, 8};
      ArrayArranger.rotate(actual, 4);
      expected = new int[]{1, 3, 5, 8, 2};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{1, 2, 3, 4, 5, 6, 7};
      ArrayArranger.rotate(actual, 3);
      expected = new int[]{5, 6, 7, 1, 2, 3, 4};
      Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void findMaxSubArraySum() {
      int actual = ArrayArranger.maxSubArray(new int[]{-1});
      int expected = -1;
      Assert.assertEquals(expected, actual);

      actual = ArrayArranger.maxSubArray(new int[]{4});
      expected = 4;
      Assert.assertEquals(expected, actual);

      actual = ArrayArranger.maxSubArray(new int[]{-2, -1});
      expected = -1;
      Assert.assertEquals(expected, actual);

      actual = ArrayArranger.maxSubArray(new int[]{-2, -1, 0});
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayArranger.maxSubArray(new int[]{-2, -1, 1, 2});
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = ArrayArranger.maxSubArray(new int[]{-2, 3, -1, 2});
      expected = 4;
      Assert.assertEquals(expected, actual);

      actual = ArrayArranger.maxSubArray(new int[]{5, 4, -1, 7, 8});
      expected = 23;
      Assert.assertEquals(expected, actual);

      actual = ArrayArranger.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
      expected = 6;
      Assert.assertEquals(expected, actual);
    }
}
