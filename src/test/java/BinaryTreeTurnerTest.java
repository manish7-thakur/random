import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTurnerTest {
    @Test
    public void UpsideDown3Nodes() {
        TreeNode root = new TreeNode(4, new TreeNode(3, null, null), new TreeNode(5, null, null));
        TreeNode newRoot = BinaryTreeTurner.upsideDown(root);
        Assert.assertEquals(3, newRoot.val);
        Assert.assertEquals(5, newRoot.left.val);
        Assert.assertEquals(4, newRoot.right.val);
    }

    @Test
    public void UpsideDown5Nodes() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)), new TreeNode(3, null, null));
        TreeNode newRoot = BinaryTreeTurner.upsideDown(root);
        Assert.assertEquals(4, newRoot.val);
        Assert.assertEquals(5, newRoot.left.val);
        Assert.assertEquals(2, newRoot.right.val);
        Assert.assertEquals(3, newRoot.right.left.val);
        Assert.assertEquals(1, newRoot.right.right.val);
    }
}