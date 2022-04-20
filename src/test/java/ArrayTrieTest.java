import org.junit.*;

public class ArrayTrieTest {
  ArrayTrie t = new ArrayTrie();
  @Test
  public void operationsOnTrie() {
    t.insert("s");
    Assert.assertTrue(t.search("s"));
  }
}
