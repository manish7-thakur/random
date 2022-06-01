import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import java.util.concurrent.atomic.*;

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

    @Test
    public void testSerializeBinaryTree() {
      String actual = BinaryTree.serialize(null);
      String expected = "n";
      Assert.assertEquals(expected, actual);

      TreeNode root = new TreeNode(2);
      actual = BinaryTree.serialize(root);
      expected = "2,n,n";
      Assert.assertEquals(expected, actual);

      root = new TreeNode(2, null, new TreeNode(3));
      actual = BinaryTree.serialize(root);
      expected = "2,n,3,n,n";
      Assert.assertEquals(expected, actual);

      root = new TreeNode(2, new TreeNode(4), new TreeNode(3));
      actual = BinaryTree.serialize(root);
      expected = "2,4,3,n,n,n,n";
      Assert.assertEquals(expected, actual);

      root = new TreeNode(2, new TreeNode(-4, new TreeNode(1), null), new TreeNode(3, null, new TreeNode(-1)));
      actual = BinaryTree.serialize(root);
      expected = "2,-4,3,1,n,n,-1,n,n,n,n";
      Assert.assertEquals(expected, actual);

      root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3, new TreeNode(4, null, new TreeNode(5)), null)), null);
      actual = BinaryTree.serialize(root);
      expected = "1,2,n,n,3,4,n,n,5,n,n";
      Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeserializeBinaryTree() {
      TreeNode root = BinaryTree.deserialize("");
      Assert.assertNull(root);

      root = BinaryTree.deserialize("n");
      Assert.assertNull(root);

      root = BinaryTree.deserialize("13");
      Assert.assertEquals(13, root.val);

      root = BinaryTree.deserialize("13,253,34");
      Assert.assertEquals(13, root.val);
      Assert.assertEquals(253, root.left.val);
      Assert.assertEquals(34, root.right.val);

      root = BinaryTree.deserialize("-13,n,34");
      Assert.assertEquals(-13, root.val);
      Assert.assertNull(root.left);
      Assert.assertEquals(34, root.right.val);

      root = BinaryTree.deserialize("-13,n,34,23");
      Assert.assertEquals(-13, root.val);
      Assert.assertNull(root.left);
      Assert.assertEquals(34, root.right.val);
      Assert.assertEquals(23, root.right.left.val);

      root = BinaryTree.deserialize("-13,n,34,23,n,-364,456");
      Assert.assertEquals(-13, root.val);
      Assert.assertNull(root.left);
      Assert.assertEquals(34, root.right.val);
      Assert.assertEquals(23, root.right.left.val);
      Assert.assertNull(root.right.right);
      Assert.assertEquals(-364, root.right.left.left.val);
      Assert.assertEquals(456, root.right.left.right.val);

      root = BinaryTree.deserialize("1,n,2,n,3,n,4,n,5");
      Assert.assertEquals(1, root.val);
      Assert.assertEquals(2, root.right.val);
      Assert.assertEquals(3, root.right.right.val);
      Assert.assertEquals(4, root.right.right.right.val);
      Assert.assertEquals(5, root.right.right.right.right.val);

      root = BinaryTree.deserialize("1,2,3,n,n,4,5");
      Assert.assertEquals(1, root.val);
      Assert.assertEquals(2, root.left.val);
      Assert.assertEquals(3, root.right.val);
      Assert.assertEquals(4, root.right.left.val);
      Assert.assertEquals(5, root.right.right.val);

      root = BinaryTree.deserialize("1,2,n,n,3,4,n,n,5,n,n");
      Assert.assertEquals(1, root.val);
      Assert.assertEquals(2, root.left.val);
      Assert.assertEquals(3, root.left.right.val);
      Assert.assertEquals(4, root.left.right.left.val);
      Assert.assertEquals(5, root.left.right.left.right.val);
    }

    @Test
    public void testValidatePreorderSerialization() {
      String treeStr = "#";
      Assert.assertTrue(BinaryTree.isValidSerialization(treeStr));

      treeStr = "#,#";
      Assert.assertFalse(BinaryTree.isValidSerialization(treeStr));

      treeStr = "#,#,#";
      Assert.assertFalse(BinaryTree.isValidSerialization(treeStr));

      treeStr = "9,#,#";
      Assert.assertTrue(BinaryTree.isValidSerialization(treeStr));

      treeStr = "9,#,#,#,#";
      Assert.assertFalse(BinaryTree.isValidSerialization(treeStr));

      treeStr = "9,#";
      Assert.assertFalse(BinaryTree.isValidSerialization(treeStr));

      treeStr = "9,#,#,1";
      Assert.assertFalse(BinaryTree.isValidSerialization(treeStr));

      treeStr = "9,#,1,#,#";
      Assert.assertTrue(BinaryTree.isValidSerialization(treeStr));

      treeStr = "9,1,#,#,#";
      Assert.assertTrue(BinaryTree.isValidSerialization(treeStr));

      treeStr = "9,-5,6,1,#,#,#,#,#";
      Assert.assertTrue(BinaryTree.isValidSerialization(treeStr));

      treeStr = "-9,#,-5,6,#,7,#,#,#";
      Assert.assertTrue(BinaryTree.isValidSerialization(treeStr));

      treeStr = "-9,#,-5,#,-6,#,7,#,#";
      Assert.assertTrue(BinaryTree.isValidSerialization(treeStr));

      treeStr = "-9,#,-5,#,#,7,#,#,#";
      Assert.assertFalse(BinaryTree.isValidSerialization(treeStr));

      treeStr = "9,3,4,#,#,1,#,#,2,#,6,#,#";
      Assert.assertTrue(BinaryTree.isValidSerialization(treeStr));
    }
    @Test
    public void findMinimumHeightTrees() {
      List<Integer> actual = BinaryTree.minHeightTrees(2, new int[][]{{0, 1}});
      List<Integer> expected = List.of(0, 1);
      Assert.assertEquals(expected, actual);

      actual = BinaryTree.minHeightTrees(3, new int[][]{{0, 1}, {1, 2}});
      expected = List.of(1);
      Assert.assertEquals(expected, actual);

      actual = BinaryTree.minHeightTrees(6, new int[][]{{0, 3}, {1, 3}, {3, 2}, {4, 3}, {5, 4}});
      expected = List.of(3, 4);
      Assert.assertEquals(expected, actual);
    }
    @Test
    public void maxHeightForTree() {
      Set<Integer> visited = new HashSet<>();
      int actual = BinaryTree.maxHeight(0, Map.of(0, List.of(0)), visited);
      int expected = 1;
      Assert.assertEquals(expected, actual);

      visited.clear();
      actual = BinaryTree.maxHeight(0, Map.of(0, List.of(1), 1, List.of(0)), visited);
      expected = 2;
      Assert.assertEquals(expected, actual);

      visited.clear();
      actual = BinaryTree.maxHeight(0, Map.of(0, List.of(1), 1, List.of(2), 2, List.of(1)), visited);
      expected = 3;
      Assert.assertEquals(expected, actual);

      visited.clear();
      actual = BinaryTree.maxHeight(0, Map.of(0, List.of(1), 1, List.of(2, 3), 3, List.of(4), 2, List.of(1), 4, List.of(3)), visited);
      expected = 4;
      Assert.assertEquals(expected, actual);
    }
}
