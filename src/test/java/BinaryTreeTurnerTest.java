import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTurnerTest {
    @Test
    public void UpsideDown3Nodes() {
        TreeNode root = new TreeNode(4, new TreeNode(3, null, null), new TreeNode(5, null, null));
        TreeNode newRoot = BinaryTreeTurner.upsideDown(root);
        Assert.assertEquals(3, newRoot.value);
        Assert.assertEquals(5, newRoot.left.value);
        Assert.assertEquals(4, newRoot.right.value);
    }

    @Test
    public void UpsideDown5Nodes() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)), new TreeNode(3, null, null));
        TreeNode newRoot = BinaryTreeTurner.upsideDown(root);
        Assert.assertEquals(4, newRoot.value);
        Assert.assertEquals(5, newRoot.left.value);
        Assert.assertEquals(2, newRoot.right.value);
        Assert.assertEquals(3, newRoot.right.left.value);
        Assert.assertEquals(1, newRoot.right.right.value);
    }
}