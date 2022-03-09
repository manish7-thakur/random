import org.junit.*;

public class DPTest {
  @Test
  public void uniqueWaysToClimbStairsWithStepsOneAndTwo() {
    int actual = DP.climbStairs(1);
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.climbStairs(2);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.climbStairs(3);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP.climbStairs(7);
    expected = 21;
    Assert.assertEquals(expected, actual);

    actual = DP.climbStairs(20);
    expected = 10946;
    Assert.assertEquals(expected, actual);

    actual = DP.climbStairs(45);
    expected = 1836311903;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void minNumberOfCoins() {
    int actual = DP.coinChange(new int[]{1}, 0);
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{1}, 1);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2}, 1);
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 3}, 3);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 5, 7}, 3);
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 5, 7}, 9);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 5, 7, 4, 9}, 9);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 5, 7, 4, 9, 3}, 12);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 5, 7, 4, 9}, 459);
    expected = 51;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 11, 5, 7, 4, 9}, 453);
    expected = 42;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void findLongestCommonSubsequence() {
    int actual = DP.longestCommonSubsequence("w", "p");
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubsequence("wp", "p");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubsequence("wp", "pw");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubsequence("wpt", "ptw");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubsequence("wpty", "ptwy");
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubsequence("wptty", "ptwthy");
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubsequence("wpssddjsywmdfttyetdy", "ptwtssjldiwjhdeyfhshy");
    expected = 8;
    Assert.assertEquals(expected, actual);
  }
}
