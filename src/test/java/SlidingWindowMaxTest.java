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
  }
}
