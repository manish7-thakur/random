import org.junit.*;

public class MapTrieTest {
  MapTrie t = new MapTrie();
  @Test
  public void operationsOnTrie() {
    t.insert("s");
    Assert.assertTrue(t.search("s"));
    Assert.assertFalse(t.search("w"));
    Assert.assertTrue(t.startsWith("s"));
    Assert.assertFalse(t.startsWith("w"));

    t.insert("polo");
    Assert.assertTrue(t.search("polo"));
    Assert.assertFalse(t.search("pol"));
    Assert.assertTrue(t.startsWith("pol"));
  }
}
