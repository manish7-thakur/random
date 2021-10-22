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

    actual = MaxPointsLineFinder.maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}});
    expected = 4;
    Assert.assertEquals(expected, actual);
  }
}
