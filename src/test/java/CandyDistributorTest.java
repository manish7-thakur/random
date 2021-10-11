import org.junit.*;

public class CandyDistributorTest {
  @Test
  public void distributeCandies() {
    int actual = CandyDistributor.candy(new int[] {1});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = CandyDistributor.candy(new int[] {1, 2});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = CandyDistributor.candy(new int[] {1, 0});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = CandyDistributor.candy(new int[] {1, 1});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = CandyDistributor.candy(new int[] {1, 2, 1});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = CandyDistributor.candy(new int[] {1, 2, 2});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = CandyDistributor.candy(new int[] {1, 0, 2});
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = CandyDistributor.candy(new int[] {0, 1, 2});
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = CandyDistributor.candy(new int[] {2, 1, 0});
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = CandyDistributor.candy(new int[] {0, 1, 2, 3});
    expected = 10;
    Assert.assertEquals(expected, actual);

    actual = CandyDistributor.candy(new int[] {3, 2, 1, 0});
    expected = 10;
    Assert.assertEquals(expected, actual);

  }
}