import org.junit.Assert;
import org.junit.Test;

public class InorderSuccFinderTest {

    @Test
    public void InorderSucc2Nodes() {
        TreeNode root = new TreeNode(5, new TreeNode(4, null, null), null);
        int actual = InorderSuccFinder.find(root, 4);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void InorderSucc3Nodes() {
        TreeNode root = new TreeNode(5, new TreeNode(4, null, null), new TreeNode(6, null, null));
        int actual = InorderSuccFinder.find(root, 5);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void InorderSucc4Nodes() {
        TreeNode root = new TreeNode(5, new TreeNode(4, null, null), new TreeNode(6, null, null));
        int actual = InorderSuccFinder.find(root, 6);
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void InorderSucc8Nodes() {
        TreeNode root = new TreeNode(9, new TreeNode(8, new TreeNode(6,
                null, new TreeNode(10, null, null)), null),
                null);
        boolean actual = InorderSuccFinder.isValidBST(root);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

}