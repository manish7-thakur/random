import org.junit.*;

public class BSTIteratorTest {
  @Test
  public void iterateBSTInorder() {
    BSTIterator iter = new BSTIterator(new TreeNode(8));
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(8, iter.next());
    Assert.assertFalse(iter.hasNext());
  }
}
