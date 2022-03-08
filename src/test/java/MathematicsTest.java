import org.junit.*;

public class MathematicsTest {
  @Test
  public void uniqueWaysToClimbStairsWithStepsOneAndTwo() {
    int actual = Mathematics.climbStairs(1);
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.climbStairs(2);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.climbStairs(3);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.climbStairs(7);
    expected = 21;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.climbStairs(20);
    expected = 10946;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.climbStairs(45);
    expected = 1836311903;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void minNumberOfCoins() {
    int actual = Mathematics.coinChange(new int[]{1}, 0);
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{2}, 3);
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{1}, 1);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{1, 2}, 2);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{1, 2, 4}, 7);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{1, 2, 4, 7}, 49);
    expected = 7;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{1, 2, 4, 7}, 51);
    expected = 8;
    Assert.assertEquals(expected, actual);
  }
}
