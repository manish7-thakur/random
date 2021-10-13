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

  }
}
