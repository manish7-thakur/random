import org.junit.*;

public class TrieTest {
  Trie t = new Trie();
  @Test
  public void insertInTrie() {
    t.insert("s");
    Assert.assertTrue(t.search("s"));
    Assert.assertFalse(t.search("w"));
    t.insert("polo");
    Assert.assertTrue(t.search("polo"));
  }
}
