import org.junit.*;

public class NetworkRankFinderTest {
  @Test
  public void findMaximalNetworkRank() {
    int actual = NetworkRankFinder.maximalNetworkRank(2, new int[][]{{0,1}});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = NetworkRankFinder.maximalNetworkRank(3, new int[][]{{0,1}, {1,2}});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = NetworkRankFinder.maximalNetworkRank(4, new int[][]{{0,1}, {1,2}, {1,3}, {2,3}});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = NetworkRankFinder.maximalNetworkRank(5, new int[][]{{0,1},{0,3},{1,2},{1,3},{2,3},{2,4}});
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = NetworkRankFinder.maximalNetworkRank(8, new int[][]{{0,1},{1,2},{2,3},{2,4},{5,6},{5,7}});
    expected = 5;
    Assert.assertEquals(expected, actual);
  }

}
