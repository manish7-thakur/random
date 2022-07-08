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
  }
}
