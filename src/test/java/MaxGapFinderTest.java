import org.junit.*;

public class MaxGapFinderTest {
  @Test
  public void findMaxGapFor() {
    int actual = MaxGapFinder.maximumGap(new int[] {1});
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = MaxGapFinder.maximumGap(new int[] {2, 1});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MaxGapFinder.maximumGap(new int[] {2, 1, 2});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MaxGapFinder.maximumGap(new int[] {2, 1, 4});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = MaxGapFinder.maximumGap(new int[] {2, 1, 4, 8});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = MaxGapFinder.maximumGap(new int[] {3, 6, 9, 1});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = MaxGapFinder.maximumGap(new int[] {2, 1, 0, 4, 0, 8});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = MaxGapFinder.maximumGap(new int[] {1, 1, 1, 1, 1, 1});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = MaxGapFinder.maximumGap(new int[] {231, 89, 192, 1, 476, 22});
    expected = 245;
    Assert.assertEquals(expected, actual);
  }
}
