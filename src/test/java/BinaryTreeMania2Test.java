import org.junit.*;

public class BinaryTreeMania2Test {
  @Test
  public void pathSumExists() {
    boolean actual = BinaryTreeMania2.hasPathSum(null, 0);
    Assert.assertFalse(actual);
  }
}
