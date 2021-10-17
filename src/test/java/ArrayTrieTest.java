import org.junit.*;

public class ArrayTrieTest {
  ArrayTrie t = new ArrayTrie();
  @Test
  public void operationsOnTrie() {
    t.insert("s");
    Assert.assertTrue(t.search("s"));
    Assert.assertFalse(t.search("w"));
    Assert.assertTrue(t.startsWith("s"));
    Assert.assertFalse(t.startsWith("w"));

    t.insert("shsyd");
    Assert.assertTrue(t.search("shsyd"));
    Assert.assertFalse(t.search("shs"));
    Assert.assertTrue(t.startsWith("shs"));
  }
}
