import org.junit.Assert;
import org.junit.Test;

public class BTreeConstructorTest {
    @Test
    public void singleNode() {
        TreeNode root = BTreeConstructor.fromPreorder(new int[]{3});
        Assert.assertEquals(3, root.val);
    }

    @Test
    public void doubleNodesRightSubtree() {
        TreeNode root = BTreeConstructor.fromPreorder(new int[]{3, 5});
        Assert.assertEquals(3, root.val);
        Assert.assertEquals(5, root.right.val);
        Assert.assertNull(root.left);
    }

    @Test
    public void doubleNodesLeftSubtree() {
        TreeNode root = BTreeConstructor.fromPreorder(new int[]{3, 2});
        Assert.assertEquals(3, root.val);
        Assert.assertEquals(2, root.left.val);
    }

    @Test
    public void tripleNodesRightSkewed() {
        TreeNode root = BTreeConstructor.fromPreorder(new int[]{3, 4, 5});
        Assert.assertEquals(3, root.val);
        Assert.assertEquals(4, root.right.val);
        Assert.assertEquals(5, root.right.right.val);
    }

    @Test
    public void tripleNodesLeftSkewed() {
        TreeNode root = BTreeConstructor.fromPreorder(new int[]{5, 4, 3});
        Assert.assertEquals(5, root.val);
        Assert.assertEquals(4, root.left.val);
        Assert.assertEquals(3, root.left.left.val);
    }

    @Test
    public void fourNodes() {
        TreeNode root = BTreeConstructor.fromPreorder(new int[]{3, 2, 4, 5});
        Assert.assertEquals(3, root.val);
        Assert.assertEquals(2, root.left.val);
        Assert.assertEquals(4, root.right.val);
        Assert.assertEquals(5, root.right.right.val);
        root = BTreeConstructor.fromPreorder(new int[]{3, 2, 5, 4});
        Assert.assertEquals(3, root.val);
        Assert.assertEquals(2, root.left.val);
        Assert.assertEquals(5, root.right.val);
        Assert.assertEquals(4, root.right.left.val);
        root = BTreeConstructor.fromPreorder(new int[]{3, 4, 5, 6});
        Assert.assertEquals(3, root.val);
        Assert.assertEquals(4, root.right.val);
        Assert.assertEquals(5, root.right.right.val);
        Assert.assertEquals(6, root.right.right.right.val);
        root = BTreeConstructor.fromPreorder(new int[]{6, 5, 4, 3});
        Assert.assertEquals(6, root.val);
        Assert.assertEquals(5, root.left.val);
        Assert.assertEquals(4, root.left.left.val);
        Assert.assertEquals(3, root.left.left.left.val);
    }

    @Test
    public void sixNodes() {
        TreeNode root = BTreeConstructor.fromPreorder(new int[]{10, 13, 12, 11, 14, 15});
        Assert.assertEquals(10, root.val);
        Assert.assertNull(root.left);
        Assert.assertEquals(13, root.right.val);
        Assert.assertEquals(14, root.right.right.val);
        Assert.assertEquals(12, root.right.left.val);
        Assert.assertEquals(15, root.right.right.right.val);
        Assert.assertEquals(11, root.right.left.left.val);
    }

    @Test
    public void tenNodes() {
        TreeNode root = BTreeConstructor.fromPreorder(new int[]{10, 6, 5, 4, 7, 8, 13, 12, 11, 14, 15});
        Assert.assertEquals(10, root.val);
        Assert.assertEquals(13, root.right.val);
        Assert.assertEquals(14, root.right.right.val);
        Assert.assertEquals(12, root.right.left.val);
        Assert.assertEquals(15, root.right.right.right.val);
        Assert.assertEquals(11, root.right.left.left.val);
        Assert.assertEquals(6, root.left.val);
        Assert.assertEquals(5, root.left.left.val);
        Assert.assertEquals(7, root.left.right.val);
        Assert.assertEquals(4, root.left.left.left.val);
        Assert.assertEquals(8, root.left.right.right.val);
    }

}