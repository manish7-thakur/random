import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class BinaryTreeTest {
    @Test
    public void Invert2Nodes() {
        TreeNode root = new TreeNode(5, null, new TreeNode(6, null, null));
        BinaryTree.invert(root);
        Assert.assertNull(root.right);
        Assert.assertEquals(6, root.left.val);

        root = new TreeNode(5, new TreeNode(4, new TreeNode(3, null, null), null), new TreeNode(6, null, new TreeNode(7, null, null)));
        BinaryTree.invert(root);
        Assert.assertEquals(4, root.right.val);
        Assert.assertEquals(6, root.left.val);
        Assert.assertEquals(7, root.left.left.val);
        Assert.assertNull(root.left.right);
        Assert.assertEquals(3, root.right.right.val);
        Assert.assertNull(root.right.left);

        root = new TreeNode(5, new TreeNode(4, new TreeNode(3, null, null), new TreeNode(2, null, null)),
                new TreeNode(6, new TreeNode(8, null, null), new TreeNode(7, null, null)));
        BinaryTree.invert(root);
        Assert.assertEquals(4, root.right.val);
        Assert.assertEquals(6, root.left.val);
        Assert.assertEquals(7, root.left.left.val);
        Assert.assertEquals(8, root.left.right.val);
        Assert.assertEquals(3, root.right.right.val);
        Assert.assertEquals(2, root.right.left.val);
    }

    @Test
    public void findRightSideView() {
      List<Integer> actual = BinaryTree.rightSideView(null);
      Assert.assertTrue(actual.isEmpty());

      TreeNode root = new TreeNode(1, null, null);
      actual = BinaryTree.rightSideView(root);
      List<Integer> expected = Arrays.asList(1);
      Assert.assertEquals(expected, actual);

      root = new TreeNode(1, null, new TreeNode(2));
      actual = BinaryTree.rightSideView(root);
      expected = Arrays.asList(1, 2);
      Assert.assertEquals(expected, actual);

      root = new TreeNode(1, new TreeNode(3), new TreeNode(2));
      actual = BinaryTree.rightSideView(root);
      expected = Arrays.asList(1, 2);
      Assert.assertEquals(expected, actual);

      root = new TreeNode(1, new TreeNode(3, null, new TreeNode(4, new TreeNode(5),null)), null);
      actual = BinaryTree.rightSideView(root);
      expected = Arrays.asList(1, 3, 4, 5);
      Assert.assertEquals(expected, actual);
    }
}
