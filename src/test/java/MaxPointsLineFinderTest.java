import org.junit.*;

public class MaxPointsLineFinderTest {
  @Test
  public void findMaxPointOnLine() {
    int actual = MaxPointsLineFinder.maxPoints(new int[][]{{1, 1}});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MaxPointsLineFinder.maxPoints(new int[][]{{1, 1}, {2, 2}});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = MaxPointsLineFinder.maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = MaxPointsLineFinder.maxPoints(new int[][]{{1, 1}, {1, 1}, {2, 2}});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = MaxPointsLineFinder.maxPoints(new int[][]{{1, 2}, {2, 2}, {3, 2}});
    expected = 3;
    Assert.assertEquals(expected, actual);
  }
}
