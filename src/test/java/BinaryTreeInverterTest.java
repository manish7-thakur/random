import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeInverterTest {
    @Test
    public void Invert2Nodes() {
        TreeNode root = new TreeNode(5, null, new TreeNode(6, null, null));
        BinaryTreeInverter.invert(root);
        Assert.assertNull(root.right);
        Assert.assertEquals(6, root.left.value);
    }

    @Test
    public void Invert5Nodes() {
        TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(3, null, null), null), new TreeNode(6, null, new TreeNode(7, null, null)));
        BinaryTreeInverter.invert(root);
        Assert.assertEquals(4, root.right.value);
        Assert.assertEquals(6, root.left.value);
        Assert.assertEquals(7, root.left.left.value);
        Assert.assertNull(root.left.right);
        Assert.assertEquals(3, root.right.right.value);
        Assert.assertNull(root.right.left);
    }

    @Test
    public void Invert7Nodes() {
        TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(3, null, null), new TreeNode(2, null, null)),
                new TreeNode(6, new TreeNode(8, null, null), new TreeNode(7, null, null)));
        BinaryTreeInverter.invert(root);
        Assert.assertEquals(4, root.right.value);
        Assert.assertEquals(6, root.left.value);
        Assert.assertEquals(7, root.left.left.value);
        Assert.assertEquals(8, root.left.right.value);
        Assert.assertEquals(3, root.right.right.value);
        Assert.assertEquals(2, root.right.left.value);
    }
}