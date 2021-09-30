import org.junit.*;
import java.util.*;

public class WordTransformerTest {
  @Test
  public void findShortestTransformations() {
   List<List<String>> actual = WordTransformer.findLadders("dog", "cog", Arrays.asList("hoi", "koi"));
   List<List<String>> expected = Arrays.asList(Arrays.asList("dog", "cog"));
   Assert.assertEquals(expected, actual);

   actual = WordTransformer.findLadders("dog", "bag", Arrays.asList("bog", "koi"));
   expected = Arrays.asList(Arrays.asList("dog", "bog", "bag"));
   Assert.assertEquals(expected, actual);

   actual = WordTransformer.findLadders("dog", "bag", Arrays.asList("dag","bog", "koi"));
   expected = Arrays.asList(Arrays.asList("dog", "dag", "bag"), Arrays.asList("dog", "bog", "bag"));
   Assert.assertEquals(expected, actual);

   actual = WordTransformer.findLadders("dog", "bag", Arrays.asList("dag","bog", "koi"));
   expected = Arrays.asList(Arrays.asList("dog", "dag", "bag"), Arrays.asList("dog", "bog", "bag"));
   Assert.assertEquals(expected, actual);

   actual = WordTransformer.findLadders("dog", "bag", Arrays.asList("dag", "dol", "koi"));
   expected = Arrays.asList(Arrays.asList("dog", "dag", "bag"));
   Assert.assertEquals(expected, actual);

   actual = WordTransformer.findLadders("dog", "sac", Arrays.asList("dag", "koi", "dac", "sog", "poi", "sag"));
   expected = Arrays.asList(Arrays.asList("dog", "sog", "sag", "sac"), Arrays.asList("dog", "dag", "dac", "sac"), Arrays.asList("dog", "dag", "sag", "sac"));
   Assert.assertEquals(expected, actual);
  }
}
