import org.junit.*;

public class MinEditDistanceFinderTest {
  @Test
  public void calcEditDistance() {
    int actual = MinEditDistanceFinder.minDistance("", "a");
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MinEditDistanceFinder.minDistance("", "a");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MinEditDistanceFinder.minDistance("a", "");
    expected = 1;
    Assert.assertEquals(expected, actual);
  }
}
