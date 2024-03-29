import org.junit.*;
import java.util.*;
import java.util.concurrent.atomic.*;
public class TreeManiaTest {
  @Test
  public void depthOfBinaryTree() {
    int actual = TreeMania.maxDepth(null);
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = TreeMania.maxDepth(new TreeNode(1));
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = TreeMania.maxDepth(new TreeNode(1, null, new TreeNode(3)));
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = TreeMania.maxDepth(new TreeNode(1, null, new TreeNode(3, new TreeNode(2), null)));
    expected = 3;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void identicalBinaryTree() {
    boolean actual = TreeMania.isSameTreeIter(null, null);
    Assert.assertTrue(actual);

    actual = TreeMania.isSameTreeIter(null, new TreeNode(1));
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(2), null);
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(2, new TreeNode(1)), new TreeNode(2, null, new TreeNode(1)));
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(2), new TreeNode(3));
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(2, new TreeNode(1)), new TreeNode(2));
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(3), new TreeNode(3, null, new TreeNode(1)));
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(3, null, new TreeNode(2)), new TreeNode(3, null, new TreeNode(1)));
    Assert.assertFalse(actual);

    actual = TreeMania.isSameTreeIter(new TreeNode(3, null, new TreeNode(1)), new TreeNode(3, null, new TreeNode(1)));
    Assert.assertTrue(actual);

    TreeNode root = new TreeNode(3, null, new TreeNode(1, new TreeNode(2, null, new TreeNode(5, new TreeNode(2, null, new TreeNode(7))))));
    actual = TreeMania.isSameTreeIter(root, root);
    Assert.assertTrue(actual);
  }
  @Test
  public void invertBinaryTree() {
    TreeNode actual = TreeMania.invertTree(null);
    Assert.assertNull(actual);

    TreeNode root = new TreeNode(1, new TreeNode(2));
    actual = TreeMania.invertTree(root);
    Assert.assertEquals(1, actual.val);
    Assert.assertEquals(2, actual.right.val);

    root = new TreeNode(1, null, new TreeNode(2));
    actual = TreeMania.invertTree(root);
    Assert.assertEquals(1, actual.val);
    Assert.assertEquals(2, actual.left.val);

    root = new TreeNode(1, new TreeNode(3, new TreeNode(5)), new TreeNode(2, new TreeNode(6)));
    actual = TreeMania.invertTree(root);
    Assert.assertEquals(1, actual.val);
    Assert.assertEquals(2, actual.left.val);
    Assert.assertEquals(6, actual.left.right.val);
    Assert.assertEquals(3, actual.right.val);
    Assert.assertEquals(5, actual.right.right.val);

    root = new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(4)), new TreeNode(2, new TreeNode(6), new TreeNode(7)));
    actual = TreeMania.invertTree(root);
    Assert.assertEquals(1, actual.val);
    Assert.assertEquals(2, actual.left.val);
    Assert.assertEquals(6, actual.left.right.val);
    Assert.assertEquals(7, actual.left.left.val);
    Assert.assertEquals(3, actual.right.val);
    Assert.assertEquals(5, actual.right.right.val);
    Assert.assertEquals(4, actual.right.left.val);
  }
  @Test
  public void levelOrderTraversalOfBinaryTree() {
    var actual  = TreeMania.levelOrder(null);
    Assert.assertTrue(actual.isEmpty());

    actual  = TreeMania.levelOrder(new TreeNode(2));
    var expected = List.of(List.of(2));
    Assert.assertEquals(expected, actual);

    actual  = TreeMania.levelOrder(new TreeNode(2, new TreeNode(3)));
    expected = List.of(List.of(2), List.of(3));
    Assert.assertEquals(expected, actual);

    actual  = TreeMania.levelOrder(new TreeNode(2, new TreeNode(3), new TreeNode(4)));
    expected = List.of(List.of(2), List.of(3, 4));
    Assert.assertEquals(expected, actual);

    actual  = TreeMania.levelOrder(new TreeNode(2, new TreeNode(3, new TreeNode(7), new TreeNode(9)), new TreeNode(4, new TreeNode(2), new TreeNode(6))));
    expected = List.of(List.of(2), List.of(3, 4), List.of(7, 9, 2, 6));
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void subtreeOfAnotherTree() {
    boolean actual = TreeMania.isSubtree(null, new TreeNode(1));
    Assert.assertFalse(actual);

    actual = TreeMania.isSubtree(new TreeNode(1), null);
    Assert.assertFalse(actual);

    actual = TreeMania.isSubtree(null, null);
    Assert.assertTrue(actual);

    actual = TreeMania.isSubtree(new TreeNode(1), new TreeNode(2));
    Assert.assertFalse(actual);

    actual = TreeMania.isSubtree(new TreeNode(2, new TreeNode(1)), new TreeNode(1));
    Assert.assertTrue(actual);

    actual = TreeMania.isSubtree(new TreeNode(2, new TreeNode(1)), new TreeNode(2));
    Assert.assertFalse(actual);

    actual = TreeMania.isSubtree(new TreeNode(2, new TreeNode(2)), new TreeNode(2));
    Assert.assertTrue(actual);

    actual = TreeMania.isSubtree(new TreeNode(2, new TreeNode(1, new TreeNode(3, new TreeNode(4)))), new TreeNode(3, new TreeNode(4)));
    Assert.assertTrue(actual);

    actual = TreeMania.isSubtree(new TreeNode(2, new TreeNode(1, new TreeNode(3, null, new TreeNode(4)))), new TreeNode(3, new TreeNode(4)));
    Assert.assertFalse(actual);

    actual = TreeMania.isSubtree(new TreeNode(2, new TreeNode(1, new TreeNode(3), new TreeNode(3, new TreeNode(4), new TreeNode(2)))), new TreeNode(3, new TreeNode(4)));
    Assert.assertFalse(actual);

    actual = TreeMania.isSubtree(new TreeNode(2, new TreeNode(1, new TreeNode(3, new TreeNode(4)), new TreeNode(3, new TreeNode(4, new TreeNode(2))))), new TreeNode(3, new TreeNode(4)));
    Assert.assertTrue(actual);

    actual = TreeMania.isSubtree(new TreeNode(2, new TreeNode(1, new TreeNode(3, new TreeNode(4, null, new TreeNode(1))), new TreeNode(3, new TreeNode(4, new TreeNode(2))))), new TreeNode(3, new TreeNode(4)));
    Assert.assertFalse(actual);

    actual = TreeMania.isSubtree(new TreeNode(3, new TreeNode(4, new TreeNode(1)), new TreeNode(5, new TreeNode(2))), new TreeNode(3, new TreeNode(1), new TreeNode(2)));
    Assert.assertFalse(actual);
  }
  @Test
  public void lowestCommonAncestorOfBinaryTree() {
    var actual = TreeMania.lowestCommonAncestor(new TreeNode(1, new TreeNode(2)), new TreeNode(1), new TreeNode(2));
    var expected = 1;
    Assert.assertEquals(expected, actual.val);

    actual = TreeMania.lowestCommonAncestor(new TreeNode(1, null, new TreeNode(2)), new TreeNode(1), new TreeNode(2));
    expected = 1;
    Assert.assertEquals(expected, actual.val);

    actual = TreeMania.lowestCommonAncestor(new TreeNode(3, new TreeNode(1), new TreeNode(2)), new TreeNode(1), new TreeNode(2));
    expected = 3;
    Assert.assertEquals(expected, actual.val);

    actual = TreeMania.lowestCommonAncestor(new TreeNode(7, new TreeNode(4, new TreeNode(3), new TreeNode(2)), new TreeNode(5)), new TreeNode(2), new TreeNode(3));
    expected = 4;
    Assert.assertEquals(expected, actual.val);

    actual = TreeMania.lowestCommonAncestor(new TreeNode(7, new TreeNode(4, new TreeNode(3, new TreeNode(1)), new TreeNode(2)), new TreeNode(5)), new TreeNode(1), new TreeNode(3));
    expected = 3;
    Assert.assertEquals(expected, actual.val);

    actual = TreeMania.lowestCommonAncestor(new TreeNode(2, null, new TreeNode(8, new TreeNode(6), new TreeNode(3, null, new TreeNode(5, null, new TreeNode(4))))), new TreeNode(6), new TreeNode(4));
    expected = 8;
    Assert.assertEquals(expected, actual.val);
  }
  @Test
  public void serializeBinaryTree() {
    String actual = TreeMania.serialize(null);
    String expected = "";
    Assert.assertEquals(expected, actual);

    actual = TreeMania.serialize(new TreeNode(3));
    expected = "3,n,n";
    Assert.assertEquals(expected, actual);

    actual = TreeMania.serialize(new TreeNode(3, null, new TreeNode(2)));
    expected = "3,n,2,n,n";
    Assert.assertEquals(expected, actual);

    actual = TreeMania.serialize(new TreeNode(3, new TreeNode(2)));
    expected = "3,2,n,n,n";
    Assert.assertEquals(expected, actual);

    actual = TreeMania.serialize(new TreeNode(3, new TreeNode(2, null, new TreeNode(4, null, new TreeNode(6)))));
    expected = "3,2,n,n,4,n,6,n,n";
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void deserializeBinaryTree() {
    TreeNode actual = TreeMania.deserialize("");
    Assert.assertNull(actual);

    actual = TreeMania.deserialize("23,n,n");
    Assert.assertEquals(23, actual.val);
    Assert.assertNull(actual.left);
    Assert.assertNull(actual.right);

    actual = TreeMania.deserialize("23,n,24,n,n");
    Assert.assertEquals(23, actual.val);
    Assert.assertNull(actual.left);
    Assert.assertEquals(24, actual.right.val);

    actual = TreeMania.deserialize("23,n,24,n,25,n,n");
    Assert.assertEquals(23, actual.val);
    Assert.assertNull(actual.left);
    Assert.assertEquals(24, actual.right.val);
    Assert.assertEquals(25, actual.right.right.val);

    actual = TreeMania.deserialize("3,2,n,n,4,n,6,n,n");
    Assert.assertEquals(3, actual.val);
    Assert.assertEquals(2, actual.left.val);
    Assert.assertEquals(4, actual.left.right.val);
    Assert.assertEquals(6, actual.left.right.right.val);

    TreeNode root = new TreeNode(3, new TreeNode(7, null, new TreeNode(4, null, new TreeNode(7, new TreeNode(5)))), new TreeNode(4, new TreeNode(6, null, new TreeNode(4)), new TreeNode(2, null, new TreeNode(7, new TreeNode(3)))));
    actual = TreeMania.deserialize(TreeMania.serialize(root));
    Assert.assertEquals(3, root.val);
    Assert.assertEquals(7, root.left.val);
    Assert.assertEquals(4, root.left.right.val);
    Assert.assertEquals(7, root.left.right.right.val);
    Assert.assertEquals(5, root.left.right.right.left.val);
    Assert.assertEquals(4, root.right.val);
    Assert.assertEquals(6, root.right.left.val);
    Assert.assertEquals(4, root.right.left.right.val);
    Assert.assertEquals(2, root.right.right.val);
    Assert.assertEquals(7, root.right.right.right.val);
    Assert.assertEquals(3, root.right.right.right.left.val);
  }
  @Test
  public void constructBinaryTreeFromPreAndInorder() {
    TreeNode actual = TreeMania.buildTree(new int[]{1}, new int[]{1});
    Assert.assertEquals(1, actual.val);

    actual = TreeMania.buildTree(new int[]{1, 2}, new int[]{1, 2});
    Assert.assertEquals(1, actual.val);
    Assert.assertEquals(2, actual.right.val);

    actual = TreeMania.buildTree(new int[]{1, 2}, new int[]{2, 1});
    Assert.assertEquals(1, actual.val);
    Assert.assertEquals(2, actual.left.val);

    actual = TreeMania.buildTree(new int[]{1, 2, 3}, new int[]{2, 1, 3});
    Assert.assertEquals(1, actual.val);
    Assert.assertEquals(2, actual.left.val);
    Assert.assertEquals(3, actual.right.val);

    actual = TreeMania.buildTree(new int[]{5, 6, 7, 4, 3}, new int[]{6, 7, 5, 3, 4});
    Assert.assertEquals(5, actual.val);
    Assert.assertEquals(6, actual.left.val);
    Assert.assertEquals(7, actual.left.right.val);
    Assert.assertEquals(4, actual.right.val);
    Assert.assertEquals(3, actual.right.left.val);

    actual = TreeMania.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
    Assert.assertEquals(3, actual.val);
    Assert.assertEquals(9, actual.left.val);
    Assert.assertEquals(20, actual.right.val);
    Assert.assertEquals(15, actual.right.left.val);
    Assert.assertEquals(7, actual.right.right.val);
  }

  @Test
  public void validateBinarySearchTree() {
    boolean actual = TreeMania.isValidBST(null);
    Assert.assertTrue(actual);

    actual = TreeMania.isValidBST(new TreeNode(2));
    Assert.assertTrue(actual);

    actual = TreeMania.isValidBST(new TreeNode(5, new TreeNode(6)));
    Assert.assertFalse(actual);

    actual = TreeMania.isValidBST(new TreeNode(5, null, new TreeNode(4)));
    Assert.assertFalse(actual);

    actual = TreeMania.isValidBST(new TreeNode(5, new TreeNode(3, null, new TreeNode(6))));
    Assert.assertFalse(actual);

    actual = TreeMania.isValidBST(new TreeNode(3, null, new TreeNode(6, new TreeNode(2))));
    Assert.assertFalse(actual);

    actual = TreeMania.isValidBST(new TreeNode(4, new TreeNode(2, null, new TreeNode(5))));
    Assert.assertFalse(actual);

    actual = TreeMania.isValidBST(new TreeNode(8, new TreeNode(6, new TreeNode(5), new TreeNode(7)), new TreeNode(13, new TreeNode(12), new TreeNode(14))));
    Assert.assertTrue(actual);
  }
  @Test
  public void findKthSmallestElementInBST() {
    int actual = TreeMania.kthSmallest(null, 4);
    int expected = -1;
    Assert.assertEquals(expected, actual);

    actual = TreeMania.kthSmallest(new TreeNode(3), 1);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = TreeMania.kthSmallest(new TreeNode(3, new TreeNode(2)), 1);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = TreeMania.kthSmallest(new TreeNode(3, new TreeNode(2)), 3);
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = TreeMania.kthSmallest(new TreeNode(3, new TreeNode(2), new TreeNode(7, new TreeNode(6))), 4);
    expected = 7;
    Assert.assertEquals(expected, actual);

    actual = TreeMania.kthSmallest(new TreeNode(5, new TreeNode(4, new TreeNode(3, new TreeNode(1)))), 4);
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = TreeMania.kthSmallest(new TreeNode(5, new TreeNode(4, new TreeNode(3, new TreeNode(1))), new TreeNode(7, null, new TreeNode(8, null, new TreeNode(9)))), 7);
    expected = 9;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void lowestCommonAncestorOfBST() {
    TreeNode actual = TreeMania.lcsBST(new TreeNode(1, null, new TreeNode(2)), new TreeNode(1), new TreeNode(2));
    int expected = 1;
    Assert.assertEquals(expected, actual.val);

    actual = TreeMania.lcsBST(new TreeNode(2, new TreeNode(1)), new TreeNode(1), new TreeNode(2));
    expected = 2;
    Assert.assertEquals(expected, actual.val);

    actual = TreeMania.lcsBST(new TreeNode(8, new TreeNode(4, null, new TreeNode(7)), new TreeNode(12, new TreeNode(9))), new TreeNode(9), new TreeNode(7));
    expected = 8;
    Assert.assertEquals(expected, actual.val);

    actual = TreeMania.lcsBST(new TreeNode(8, null, new TreeNode(9, null, new TreeNode(11, null, new TreeNode(13)))), new TreeNode(9), new TreeNode(13));
    expected = 9;
    Assert.assertEquals(expected, actual.val);
  }
  @Test
  public void mostFrequentSubtreeSum() {
    int[] actual = TreeMania.findFrequentTreeSum(new TreeNode(1));
    int[] expected = new int[]{1};
    Assert.assertArrayEquals(expected, actual);

    actual = TreeMania.findFrequentTreeSum(new TreeNode(2, new TreeNode(1)));
    expected = new int[]{1, 3};
    Assert.assertArrayEquals(expected, actual);

    actual = TreeMania.findFrequentTreeSum(new TreeNode(2, new TreeNode(1), new TreeNode(-2)));
    expected = new int[]{1};
    Assert.assertArrayEquals(expected, actual);

    actual = TreeMania.findFrequentTreeSum(new TreeNode(5, new TreeNode(2), new TreeNode(-3)));
    expected = new int[]{2, -3, 4};
    Assert.assertArrayEquals(expected, actual);

    actual = TreeMania.findFrequentTreeSum(new TreeNode(5, new TreeNode(2), new TreeNode(-5)));
    expected = new int[]{2};
    Assert.assertArrayEquals(expected, actual);

    actual = TreeMania.findFrequentTreeSum(new TreeNode(4, new TreeNode(-2, new TreeNode(1)), new TreeNode(-5, new TreeNode(3), new TreeNode(2))));
    expected = new int[]{3};
    Assert.assertArrayEquals(expected, actual);
  }
  @Test
  public void populateSubtreeSumInMap() {
    Map<Integer, Integer> actual = new HashMap<>();
    TreeMania.populateOcc(null, actual, new AtomicInteger());
    Map<Integer, Integer> expected = Map.of();
    Assert.assertEquals(expected, actual);

    TreeMania.populateOcc(new TreeNode(1), actual, new AtomicInteger());
    expected = Map.of(1, 1);
    Assert.assertEquals(expected, actual);

    actual.clear();
    TreeMania.populateOcc(new TreeNode(5, new TreeNode(2)), actual, new AtomicInteger());
    expected = Map.of(2, 1, 7, 1);
    Assert.assertEquals(expected, actual);

    actual.clear();
    TreeMania.populateOcc(new TreeNode(5, new TreeNode(2), new TreeNode(-3)), actual, new AtomicInteger());
    expected = Map.of(-3, 1, 2, 1, 4, 1);
    Assert.assertEquals(expected, actual);

    actual.clear();
    TreeMania.populateOcc(new TreeNode(5, new TreeNode(2, new TreeNode(-1)), new TreeNode(-3, new TreeNode(2), new TreeNode(6))), actual, new AtomicInteger());
    expected = Map.of(-1, 1, 2, 1, 6, 1, 1, 1, 5, 1, 11, 1);
    Assert.assertEquals(expected, actual);
  }
}
