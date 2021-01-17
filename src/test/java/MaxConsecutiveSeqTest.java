import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveSeqTest {
    @Test
    public void maxSeqSingleNode() {
        TreeNode node = new TreeNode(3, null, null);
        int actual = MaxConsecutiveSeq.find(node);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxSeqDoubleNodesNonConsecutive() {
        TreeNode node = new TreeNode(3, null, new TreeNode(5, null, null));
        int actual = MaxConsecutiveSeq.find(node);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxSeqDoubleNodesConsecutive() {
        TreeNode node = new TreeNode(3, null, new TreeNode(4, null, null));
        int actual = MaxConsecutiveSeq.find(node);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxSeqTwoNodesConsecutiveFollowedByNonConsecutive() {
        TreeNode node = new TreeNode(2, null, new TreeNode(3, new TreeNode(2, new TreeNode(1, null, null), null), null));
        int actual = MaxConsecutiveSeq.find(node);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxSeqThreeNodesConsecutive() {
        TreeNode node = new TreeNode(2, new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), null), null), null);
        int actual = MaxConsecutiveSeq.find(node);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxSeqFourNodesConsecutive() {
        TreeNode node = new TreeNode(2, new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, null)))), new TreeNode(3, null, new TreeNode(4, null, null)));
        int actual = MaxConsecutiveSeq.find(node);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxSeqFiveNodesConsecutive() {
        TreeNode node = new TreeNode(2, new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, null)))), new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6, null, null)))));
        int actual = MaxConsecutiveSeq.find(node);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }
}