import org.junit.*;

public class BinaryTreeMania2Test {
  @Test
  public void pathSumExists() {
    boolean actual = BinaryTreeMania2.hasPathSum(null, 0);
    Assert.assertFalse(actual);

    actual = BinaryTreeMania2.hasPathSum(new TreeNode(1), 1);
    Assert.assertTrue(actual);

    actual = BinaryTreeMania2.hasPathSum(new TreeNode(1, null, new TreeNode(-2)), -1);
    Assert.assertTrue(actual);

    actual = BinaryTreeMania2.hasPathSum(new TreeNode(1, null, new TreeNode(1, new TreeNode(2))), 2);
    Assert.assertFalse(actual);

    actual = BinaryTreeMania2.hasPathSum(new TreeNode(1, new TreeNode(7, new TreeNode(-4), new TreeNode(-5, new TreeNode(3)))), 6);
    Assert.assertTrue(actual);
  }
}
