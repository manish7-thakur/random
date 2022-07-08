import org.junit.*;

public class BSTIteratorTest {
  @Test
  public void iterateBSTInorder() {
    BSTIterator iter = new BSTIterator(new TreeNode(8));
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(8, iter.next());
    Assert.assertFalse(iter.hasNext());

    iter = new BSTIterator(new TreeNode(8, new TreeNode(7), new TreeNode(9)));
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(7, iter.next());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(8, iter.next());
    Assert.assertEquals(9, iter.next());

    iter = new BSTIterator(new TreeNode(7, new TreeNode(2, new TreeNode(1), new TreeNode(5, new TreeNode(3), new TreeNode(6))), new TreeNode(9, new TreeNode(8), new TreeNode(10))));
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(2, iter.next());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(3, iter.next());
    Assert.assertEquals(5, iter.next());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(6, iter.next());
    Assert.assertEquals(7, iter.next());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(8, iter.next());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(9, iter.next());
    Assert.assertEquals(10, iter.next());
    Assert.assertFalse(iter.hasNext());
  }
}
