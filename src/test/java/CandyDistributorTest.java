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

  }
}
