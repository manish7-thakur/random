import org.junit.*;
import java.util.*;

public class WordBreakFinderTest {
  @Test
  public void findAllWordsContained() {
    List<String> actual = WordBreakFinder.wordBreak("cat", Arrays.asList("cat"));
    List<String> expected = Arrays.asList("cat");
    Assert.assertEquals(expected, actual);

    actual = WordBreakFinder.wordBreak("cat", Arrays.asList("ca", "at", "ct"));
    Assert.assertTrue(actual.isEmpty());

    actual = WordBreakFinder.wordBreak("cat", Arrays.asList("cat", "c", "at"));
    expected = Arrays.asList("c at", "cat");
    Assert.assertEquals(expected, actual);

    actual = WordBreakFinder.wordBreak("cat", Arrays.asList("cat", "c", "at", "ca", "t"));
    expected = Arrays.asList("c at", "ca t", "cat");
    Assert.assertEquals(expected, actual);

    actual = WordBreakFinder.wordBreak("cat", Arrays.asList("cat", "c", "at", "ca", "t", "a"));
    expected = Arrays.asList("c a t", "c at", "ca t", "cat");
    Assert.assertEquals(expected, actual);

    actual = WordBreakFinder.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog"));
    expected = Arrays.asList("cat sand dog", "cats and dog");
    Assert.assertEquals(expected, actual);

    actual = WordBreakFinder.wordBreak("pineapplepenapple", Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"));
    expected = Arrays.asList("pine apple pen apple", "pine applepen apple", "pineapple pen apple");
    Assert.assertEquals(expected, actual);

    actual = WordBreakFinder.wordBreak("pineapplepenapplepenpineappenapplepinaapplepplelepen", Arrays.asList("apple", "pen", "applepen",
    "pine", "pineapple", "p", "i", "n", "a", "e", "l", "ne", "pe", "ple", "en", "app", "pin"));
    expected = Arrays.asList("pine apple pen apple", "pine applepen apple", "pineapple pen apple");
    Assert.assertEquals(7520256, actual.size());

    actual = WordBreakFinder.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"));
    Assert.assertTrue(actual.isEmpty());

  }
}
