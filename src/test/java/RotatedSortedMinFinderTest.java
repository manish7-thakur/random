import org.junit.*;

public class RotatedSortedMinFinderTest {
  @Test
  public void findMinInRoatatedSortedArray() {
    int actual = RotatedSortedMinFinder.findMin(new int[]{1});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{2, 0});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{0, 2});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{1, 2, 0});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{-1, 1, 2, 0});
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{-1, 1, 2, 0, 0});
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{-1, -1, -1, 0, 0});
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{0, 0, 0, 0, 0});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{0, 0, 0, 0, -1});
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{7, 6, 5, 4, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{7, 8, 15, 24, 32, 91, 100, 0, 1, 2, 4, 6});
    expected = 0;
    Assert.assertEquals(expected, actual);
  }
}
