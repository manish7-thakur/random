import org.junit.*;

public class ArrayTrieTest {
  ArrayTrie t = new ArrayTrie();
  @Test
  public void operationsOnTrie() {
    t.insert("s");
    Assert.assertTrue(t.search("s"));
    Assert.assertFalse(t.search("a"));
    t.insert("ss");
    Assert.assertTrue(t.search("ss"));
    Assert.assertFalse(t.search("ssa"));
    t.insert("ssa");
    Assert.assertTrue(t.search("ssa"));
    t.insert("sdfrt");
    Assert.assertFalse(t.search("sdf"));
    Assert.assertTrue(t.startsWith("sdf"));
    Assert.assertFalse(t.startsWith("sdpp"));
    t.insert("sdfrjsyasjdnhadnasjdhasdasgrt");
    Assert.assertTrue(t.startsWith("sdfrjsyasjdnhadnasjdhasdasgrt"));
  }
}
