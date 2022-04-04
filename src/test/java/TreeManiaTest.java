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

    actual = TreeMania.isSameTreeIter(new TreeNode(2, new TreeNode(1)), new TreeNode(2, null, new TreeNode(1)));
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
  @Test
  public void invertBinaryTree() {
    TreeNode actual = TreeMania.invertTree(null);
    Assert.assertNull(actual);

    TreeNode root = new TreeNode(1, new TreeNode(2));
    actual = TreeMania.invertTree(root);
    Assert.assertEquals(1, actual.val);
    Assert.assertEquals(2, actual.right.val);

    root = new TreeNode(1, null, new TreeNode(2));
    actual = TreeMania.invertTree(root);
    Assert.assertEquals(1, actual.val);
    Assert.assertEquals(2, actual.left.val);

    root = new TreeNode(1, new TreeNode(3, new TreeNode(5)), new TreeNode(2, new TreeNode(6)));
    actual = TreeMania.invertTree(root);
    Assert.assertEquals(1, actual.val);
    Assert.assertEquals(2, actual.left.val);
    Assert.assertEquals(6, actual.left.right.val);
    Assert.assertEquals(3, actual.right.val);
    Assert.assertEquals(5, actual.right.right.val);

    root = new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(4)), new TreeNode(2, new TreeNode(6), new TreeNode(7)));
    actual = TreeMania.invertTree(root);
    Assert.assertEquals(1, actual.val);
    Assert.assertEquals(2, actual.left.val);
    Assert.assertEquals(6, actual.left.right.val);
    Assert.assertEquals(7, actual.left.left.val);
    Assert.assertEquals(3, actual.right.val);
    Assert.assertEquals(5, actual.right.right.val);
    Assert.assertEquals(4, actual.right.left.val);
  }
}
