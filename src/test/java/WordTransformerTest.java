import org.junit.*;
import java.util.*;

public class WordTransformerTest {
  @Test
  public void findShortestTransformations() {
   List<List<String>> actual = WordTransformer.findLadders("dog", "cog", Arrays.asList("hoi", "cog"));
   List<List<String>> expected = Arrays.asList(Arrays.asList("dog", "cog"));
   Assert.assertEquals(expected, actual);

   actual = WordTransformer.findLadders("dog", "cog", Arrays.asList("hoi", "koi"));
   Assert.assertTrue(actual.isEmpty());

   actual = WordTransformer.findLadders("dog", "bag", Arrays.asList("bog", "koi", "bag"));
   expected = Arrays.asList(Arrays.asList("dog", "bog", "bag"));
   Assert.assertEquals(expected, actual);

   actual = WordTransformer.findLadders("dog", "bag", Arrays.asList("bog", "koi"));
   Assert.assertTrue(actual.isEmpty());

   actual = WordTransformer.findLadders("dog", "bag", Arrays.asList("dag", "bog", "koi", "bag"));
   expected = Arrays.asList(Arrays.asList("dog", "dag", "bag"), Arrays.asList("dog", "bog", "bag"));
   Assert.assertEquals(expected, actual);

   actual = WordTransformer.findLadders("dog", "bag", Arrays.asList("dag", "dol", "koi", "bag"));
   expected = Arrays.asList(Arrays.asList("dog", "dag", "bag"));
   Assert.assertEquals(expected, actual);

   actual = WordTransformer.findLadders("dog", "sac", Arrays.asList("dag", "koi", "dac", "sog", "poi", "sag", "sac"));
   expected = Arrays.asList(Arrays.asList("dog", "sog", "sag", "sac"), Arrays.asList("dog", "dag", "sag", "sac"), Arrays.asList("dog", "dag", "dac", "sac"));
   Assert.assertEquals(expected, actual);

   actual = WordTransformer.findLadders("hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog"));
   expected = Arrays.asList(Arrays.asList("hit","hot","lot","log","cog"), Arrays.asList("hit","hot","dot","dog","cog"));
   Assert.assertEquals(expected, actual);

   actual = WordTransformer.findLadders("hit", "cog", Arrays.asList("hot","dot","dog","lot","log"));
   Assert.assertTrue(actual.isEmpty());

   actual = WordTransformer.findLadders("qa", "sq",  Arrays.asList("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"));
   expected = Arrays.asList(Arrays.asList("qa", "ca", "cr", "sr", "sq"), Arrays.asList("qa", "ra", "rh", "sh", "sq"));
   Assert.assertEquals(expected, actual);
  }
}
