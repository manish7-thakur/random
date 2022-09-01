import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeLevelAvgTest {
    @Test
    public void singleLevelAvgTest() {
        TreeNode node = new TreeNode(5, null, null);
        List<Double> actual = BinaryTreeLevelAvg.calcAvgs(node);
        List<Double> expected = new ArrayList<Double>();
        expected.add(5.0);
        assertEquals(expected, actual);
    }

    @Test
    public void DoubleLevelAvgTest() {
        TreeNode node = new TreeNode(5, new TreeNode(2, null, null), new TreeNode(4, null, null));
        List<Double> actual = BinaryTreeLevelAvg.calcAvgs(node);
        List<Double> expected = new ArrayList<Double>();
        expected.add(5.0);
        expected.add(3.0);
        assertEquals(expected, actual);
    }

    @Test
    public void TripleLevelAvgTest() {
        TreeNode node = new TreeNode(5, new TreeNode(2, new TreeNode(8, null, null), new TreeNode(8, null, null)), new TreeNode(4, new TreeNode(6, null, null), new TreeNode(3, null, null)));
        List<Double> actual = BinaryTreeLevelAvg.calcAvgs(node);
        List<Double> expected = new ArrayList<Double>();
        expected.add(5.0);
        expected.add(3.0);
        expected.add(6.25);
        assertEquals(expected, actual);
    }
}