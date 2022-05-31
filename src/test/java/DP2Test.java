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
  }
}
