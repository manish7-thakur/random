import org.junit.*;

public class DP2Test {
  @Test
  public void partionWith2EqualSubsetSum() {
    boolean actual = DP2.canPartition(new int[]{2});
    Assert.assertFalse(actual);

    actual = DP2.canPartition(new int[]{2, 2});
    Assert.assertTrue(actual);

    actual = DP2.canPartition(new int[]{1, 2, 1});
    Assert.assertTrue(actual);

    actual = DP2.canPartition(new int[]{1, 3, 2, 1});
    Assert.assertFalse(actual);

    actual = DP2.canPartition(new int[]{1, 5, 11, 5});
    Assert.assertTrue(actual);

    actual = DP2.canPartition(new int[]{3, 1, 2, 1, 3});
    Assert.assertTrue(actual);

    actual = DP2.canPartition(new int[]{35, 12, 22, 11, 34, 5, 6, 13, 22, 3, 21, 72, 12, 33, 53, 23, 12, 34, 34, 86, 46, 32, 24, 32, 42, 23, 24, 52, 67, 63});
    Assert.assertTrue(actual);

    actual = DP2.canPartition(new int[]{35, 1, 22, 11, 34, 5, 6, 13, 22, 3, 21, 72, 12, 33, 53, 23, 12, 34, 34, 86, 46, 32, 24, 32, 42, 23, 24, 52, 67, 63});
    Assert.assertFalse(actual);
  }
}
