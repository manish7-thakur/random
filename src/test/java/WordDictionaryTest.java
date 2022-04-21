import org.junit.*;

public class WordDictionaryTest {
  @Test
  public void searchWord() {
    var dictionary = new WordDictionary();
    dictionary.insert("ba");
    Assert.assertTrue(dictionary.search(".a"));
    Assert.assertTrue(dictionary.search("b."));
    Assert.assertFalse(dictionary.search("bc"));
  }
}
