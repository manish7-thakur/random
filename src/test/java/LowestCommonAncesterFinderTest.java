import org.junit.Assert;
import org.junit.Test;

public class LowestCommonAncesterFinderTest {
    @Test
    public void findForBST() {
        TreeNode root = new TreeNode(4, null, null);
        int actual = LowestCommonAncesterFinder.forBST(root, 1, 2);
        int expected = -1;
        Assert.assertEquals(expected, actual);

        root = new TreeNode(4, new TreeNode(3, null, null), null);
        actual = LowestCommonAncesterFinder.forBST(root, 4, 3);
        expected = 4;
        Assert.assertEquals(expected, actual);

        root = new TreeNode(3, null, new TreeNode(4, null, null));
        actual = LowestCommonAncesterFinder.forBST(root, 3, 4);
        expected = 3;
        Assert.assertEquals(expected, actual);

        root = new TreeNode(4, new TreeNode(3, null, null), new TreeNode(5, null, null));
        actual = LowestCommonAncesterFinder.forBST(root, 3, 5);
        expected = 4;
        Assert.assertEquals(expected, actual);

        root = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), null),
                new TreeNode(5, null, new TreeNode(6, null, null)));
        actual = LowestCommonAncesterFinder.forBST(root, 1, 6);
        expected = 4;
        Assert.assertEquals(expected, actual);

        root = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                new TreeNode(5, null, new TreeNode(6, null, new TreeNode(7, null, null))));
        actual = LowestCommonAncesterFinder.forBST(root, 1, 3);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = LowestCommonAncesterFinder.forBST(root, 3, 7);
        expected = 4;
        Assert.assertEquals(expected, actual);
    }
}