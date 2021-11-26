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

    actual = SlidingWindowMax.maxSlidingWindow(new int[]{1, 0, 2, -3, -2, -3, -1, -1, 7, 4, 2, 0, 2, 1, 4, -4, -3, -2, -3, 4, 0, 0, -3, -3, 3, 0, 4, 2, -3, -3}, 3);
    expected = new int[]{2, 2, 2, -2, -1, -1, 7, 7, 7, 4, 2, 2, 4, 4, 4, -2, -2, 4, 4, 4, 0, 0, 3, 3, 4, 4, 4, 2};
    Assert.assertArrayEquals(expected, actual);
  }
}
