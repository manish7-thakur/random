import org.junit.*;

public class TreeManiaTest {
  @Test
  public void depthOfBinaryTree() {
    int actual = TreeMania.maxDepth(null);
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = TreeMania.maxDepth(new TreeNode(1));
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = TreeMania.maxDepth(new TreeNode(1, null, new TreeNode(3)));
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = TreeMania.maxDepth(new TreeNode(1, null, new TreeNode(3, new TreeNode(2), null)));
    expected = 3;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void identicalBinaryTree() {
    boolean actual = TreeMania.isSameTreeIter(null, null);
    Assert.assertTrue(actual);

    actual = TreeMania.isSameTreeIter(null, new TreeNode(1));
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(2), null);
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(2), new TreeNode(3));
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(2, new TreeNode(1)), new TreeNode(2));
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(3), new TreeNode(3, null, new TreeNode(1)));
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(3, null, new TreeNode(2)), new TreeNode(3, null, new TreeNode(1)));
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(3, null, new TreeNode(1)), new TreeNode(3, null, new TreeNode(1)));
    Assert.assertTrue(actual);

    TreeNode root = new TreeNode(3, null, new TreeNode(1, new TreeNode(2, null, new TreeNode(5, new TreeNode(2, null, new TreeNode(7))))));
    actual = TreeMania.isSameTreeIter(root, root);
    Assert.assertTrue(actual);
  }
}
