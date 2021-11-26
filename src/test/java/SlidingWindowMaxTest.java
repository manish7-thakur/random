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
  }
}
