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

    actual = RotatedSortedMinFinder.findMin(new int[]{-1, 0, 2});
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{0, 1, 2, -1});
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{1, 2, -1, 0, 0});
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

    actual = RotatedSortedMinFinder.findMin(new int[]{0, 1, 2, 4, 6, 7, 8, 15});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{15, 0, 1, 2, 4, 6, 7, 8});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{8, 15, 0, 1, 2, 4, 6, 7});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{7, 8, 15, 0, 1, 2, 4, 6});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{6, 7, 8, 15, 0, 1, 2, 4});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{4, 6, 7, 8, 15, 0, 1, 2});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{2, 4, 6, 7, 8, 15, 0, 1});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = RotatedSortedMinFinder.findMin(new int[]{1, 2, 4, 6, 7, 8, 15, 0});
    expected = 0;
    Assert.assertEquals(expected, actual);
  }
}
