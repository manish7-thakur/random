import org.junit.*;

public class DistinctSubsequenceFinderTest {
  @Test
  public void findDistinctSubsequences() {
    int actual = DistinctSubsequenceFinder.numDistinct("a", "a");
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DistinctSubsequenceFinder.numDistinct("ab", "a");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DistinctSubsequenceFinder.numDistinct("ba", "a");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DistinctSubsequenceFinder.numDistinct("aa", "a");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DistinctSubsequenceFinder.numDistinct("aba", "aa");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DistinctSubsequenceFinder.numDistinct("aba", "aa");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DistinctSubsequenceFinder.numDistinct("abab", "ab");
    expected = 3;
    Assert.assertEquals(expected, actual);
  }
}
