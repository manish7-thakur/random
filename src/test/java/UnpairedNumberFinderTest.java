import org.junit.*;

public class UnpairedNumberFinderTest {
  @Test
  public void findUnpairedNumber() {
    int actual = UnpairedNumberFinder.find(new int[]{1});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = UnpairedNumberFinder.find(new int[]{1, 1});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = UnpairedNumberFinder.find(new int[]{1, 1, 3});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = UnpairedNumberFinder.find(new int[]{1, 3, 1});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = UnpairedNumberFinder.find(new int[]{1, 3, 3, 1, 2, 6, 2, 8, 6});
    expected = 8;
    Assert.assertEquals(expected, actual);
  }
}
