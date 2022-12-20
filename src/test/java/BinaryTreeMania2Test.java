import org.junit.*;
import java.util.*;

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
  @Test
  public void binaryTreePathsFromRootToLeaves() {
    List<String> actual = BinaryTreeMania2.binaryTreePaths(new TreeNode(3));
    List<String> expected = List.of("3");
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMania2.binaryTreePaths(new TreeNode(3, new TreeNode(4)));
    expected = List.of("3->4");
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMania2.binaryTreePaths(new TreeNode(3, new TreeNode(4, new TreeNode(2), new TreeNode(1))));
    expected = List.of("3->4->2", "3->4->1");
    Assert.assertEquals(expected, actual);
  }
}
