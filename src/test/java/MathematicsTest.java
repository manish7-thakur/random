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

    actual = Mathematics.coinChange(new int[]{1}, 1);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{2}, 1);
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{2, 3}, 3);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{2, 5, 7}, 3);
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{2, 5, 7}, 9);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{2, 5, 7, 4, 9}, 9);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{2, 5, 7, 4, 9, 3}, 12);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{2, 5, 7, 4, 9}, 459);
    expected = 51;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.coinChange(new int[]{2, 11, 5, 7, 4, 9}, 453);
    expected = 42;
    Assert.assertEquals(expected, actual);
  }
}
