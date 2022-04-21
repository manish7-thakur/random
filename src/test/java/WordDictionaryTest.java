import org.junit.*;

public class WordDictionaryTest {
  @Test
  public void searchWord() {
    var dictionary = new WordDictionary();
    dictionary.addWord("ba");
    Assert.assertTrue(dictionary.search(".a"));
    Assert.assertTrue(dictionary.search("b."));
    Assert.assertTrue(dictionary.search(".."));
    Assert.assertFalse(dictionary.search("bc"));
    Assert.assertFalse(dictionary.search(".b"));
    Assert.assertFalse(dictionary.search("ba."));
    dictionary.addWord("bac");
    Assert.assertTrue(dictionary.search("ba."));
    dictionary.addWord("stgksf");
    Assert.assertTrue(dictionary.search("stgks."));
    Assert.assertFalse(dictionary.search("stgs.f"));
    Assert.assertTrue(dictionary.search(".t.k.f"));
    Assert.assertTrue(dictionary.search("s....f"));
    Assert.assertFalse(dictionary.search("s...f"));
    Assert.assertTrue(dictionary.search("..g.s."));
    Assert.assertTrue(dictionary.search("......"));
    Assert.assertFalse(dictionary.search("..g.k."));
    Assert.assertTrue(dictionary.search("stg..."));
  }
}
