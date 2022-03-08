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

    actual = Mathematics.climbStairs(4);
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.climbStairs(5);
    expected = 8;
    Assert.assertEquals(expected, actual);

    actual = Mathematics.climbStairs(6);
    expected = 13;
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
}
