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

    actual = MinEditDistanceFinder.minDistance("a", "a");
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = MinEditDistanceFinder.minDistance("a", "b");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MinEditDistanceFinder.minDistance("a", "bb");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = MinEditDistanceFinder.minDistance("ab", "bb");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MinEditDistanceFinder.minDistance("cab", "cbb");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MinEditDistanceFinder.minDistance("cab", "cbb");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MinEditDistanceFinder.minDistance("ccagb", "ccabb");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MinEditDistanceFinder.minDistance("horse", "ros");
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = MinEditDistanceFinder.minDistance("intention", "execution");
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = MinEditDistanceFinder.minDistance("intention", "intention");
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = MinEditDistanceFinder.minDistance("dinitrophenylhydrazine", "benzalphenylhydrazone");
    expected = 7;
    Assert.assertEquals(expected, actual);
  }
}
