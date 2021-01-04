import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeLevelAvgTest {
    @Test
    public void singleLevelAvgTest() {
        TreeNode node = new TreeNode(5, null, null);
        List<Integer> actual = BinaryTreeLevelAvg.calcAvgs(node);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        assertEquals(expected, actual);
    }

    @Test
    public void DoubleLevelAvgTest() {
        TreeNode node = new TreeNode(5, new TreeNode(2, null, null), new TreeNode(4, null, null));
        List<Integer> actual = BinaryTreeLevelAvg.calcAvgs(node);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(3);
        assertEquals(expected, actual);
    }

    @Test
    public void TripleLevelAvgTest() {
        TreeNode node = new TreeNode(5, new TreeNode(2, new TreeNode(8, null, null), new TreeNode(6, null, null)), new TreeNode(4, new TreeNode(6, null, null), new TreeNode(4, null, null)));
        List<Integer> actual = BinaryTreeLevelAvg.calcAvgs(node);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(3);
        expected.add(6);
        assertEquals(expected, actual);
    }
}