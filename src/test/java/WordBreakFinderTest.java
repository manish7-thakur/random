import org.junit.*;
import java.util.*;

public class WordBreakFinderTest {
  @Test
  public void findAllWordsContained() {
    List<String> actual = WordBreakFinder.wordBreak("cat", Arrays.asList("cat"));
    List<String> expected = Arrays.asList("cat");
    Assert.assertEquals(expected, actual);
  }
}
