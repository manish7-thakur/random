import org.junit.*;

public class BinaryTreeMaxPathSumTest {
  @Test
  public void findMaxSum() {
    int actual = BinaryTreeMaxPathSum.maxPathSum(new TreeNode(-1));
    int expected = -1;
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMaxPathSum.maxPathSum(new TreeNode(1));
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMaxPathSum.maxPathSum(new TreeNode(-1, new TreeNode(2), null));
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMaxPathSum.maxPathSum(new TreeNode(-1, new TreeNode(-2), null));
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMaxPathSum.maxPathSum(new TreeNode(-3, new TreeNode(-2), new TreeNode(-1)));
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMaxPathSum.maxPathSum(new TreeNode(2, new TreeNode(-1), null));
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMaxPathSum.maxPathSum(new TreeNode(-2, new TreeNode(-1), new TreeNode(-1, new TreeNode(-5), new TreeNode(7))));
    expected = 7;
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMaxPathSum.maxPathSum(new TreeNode(2, new TreeNode(-1), new TreeNode(3)));
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMaxPathSum.maxPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)));
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMaxPathSum.maxPathSum(new TreeNode(-1, new TreeNode(2, new TreeNode(3), null), new TreeNode(3)));
    expected = 7;
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMaxPathSum.maxPathSum(new TreeNode(-1, new TreeNode(8, new TreeNode(3), new TreeNode(-5)), new TreeNode(-3)));
    expected = 11;
    Assert.assertEquals(expected, actual);

    actual = BinaryTreeMaxPathSum.maxPathSum(new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
    expected = 42;
    Assert.assertEquals(expected, actual);
  }
}
