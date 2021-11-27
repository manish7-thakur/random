import org.junit.*;

public class SlidingWindowMaxTest {
  @Test
  public void findAllMaxInSlidingWindow() {
    int[] actual = SlidingWindowMax.maxSlidingWindow(new int[]{1}, 1);
    int[] expected = {1};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{-1, 4}, 2);
    expected = new int[]{4};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{-1, 4}, 1);
    expected = new int[]{-1, 4};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{4, -2}, 2);
    expected = new int[]{4};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{4, -2, -3}, 2);
    expected = new int[]{4, -2};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{4, -2, -3}, 3);
    expected = new int[]{4};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{4, -2, -3}, 1);
    expected = new int[]{4, -2, -3};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{-2, -2, -3}, 2);
    expected = new int[]{-2, -2};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{-3, -3, -3}, 1);
    expected = new int[]{-3, -3, -3};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{-3, -3, -3, -1}, 4);
    expected = new int[]{-1};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{-3, -1, -3, -1}, 3);
    expected = new int[]{-1, -1};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{1, 3, -1, -3, 0, 3}, 3);
    expected = new int[]{3, 3, 0, 3};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{1, 0, 2, -3, -2, -3, -1}, 3);
    expected = new int[]{2, 2, 2, -2, -1};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
    expected = new int[]{3, 3, 5, 5, 6, 7};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 4);
    expected = new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{1, 0, 2, -3, -2, -3, -1, -1, 7, 4, 2, 0, 2, 1, 4, -4, -3, -2, -3, 4, 0, 0, -3, -3, 3, 0, 4, 2, -3, -3}, 3);
    expected = new int[]{2, 2, 2, -2, -1, -1, 7, 7, 7, 4, 2, 2, 4, 4, 4, -2, -2, 4, 4, 4, 0, 0, 3, 3, 4, 4, 4, 2};
    Assert.assertArrayEquals(expected, actual);

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{9775,260,6016,9797,3371,2395,6851,2349,-7019,9318,1211,-3110,8735,-7507,1784,7400,-5799,3169,-7696,-8991,-2222,-9434,-4490,4034,-831,-9656,5488,-4395,9339,4104,-9058,-4072,-1172,1758,6878,-5570,-6380,9550,-9389,1411,2298,3516,551,9196,5215,-237,-4146,1682,4418,-4639,7759,9593,-9588,3041,9208,-7331,-797}, 45);
    expected = new int[]{9797,9797,9797,9797,9550,9550,9550,9593,9593,9593,9593,9593,9593};
    Assert.assertArrayEquals(expected, actual);
  }
}
