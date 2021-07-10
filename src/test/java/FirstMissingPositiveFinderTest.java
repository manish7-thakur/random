import org.junit.*;
public class FirstMissingPositiveFinderTest {
  @Test
  public void findMissingPositive() {
    int actual = FirstMissingPositiveFinder.find(new int[] {0});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = FirstMissingPositiveFinder.find(new int[] {0, -1});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = FirstMissingPositiveFinder.find(new int[] {0, -1, 1});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = FirstMissingPositiveFinder.find(new int[] {0, -1, 2, 1});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = FirstMissingPositiveFinder.find(new int[] {1, 4, 3, 2});
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = FirstMissingPositiveFinder.find(new int[] {1, 2, 0});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = FirstMissingPositiveFinder.find(new int[] {3, 4, -1, 1});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = FirstMissingPositiveFinder.find(new int[] {7, 8, 9, 11, 12});
    expected = 1;
    Assert.assertEquals(expected, actual);
  }
}
