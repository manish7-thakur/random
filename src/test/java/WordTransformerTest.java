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
   expected = Arrays.asList(Arrays.asList("qa", "pa", "pb", "sb", "sq"), Arrays.asList("qa", "ba", "bi", "si", "sq"), Arrays.asList("qa", "ba", "be", "se", "sq"),
           Arrays.asList("qa", "ba", "br", "sr", "sq"), Arrays.asList("qa", "ra", "rn", "sn", "sq"), Arrays.asList("qa", "ra", "rh", "sh", "sq"),
           Arrays.asList("qa", "ra", "re", "se", "sq"), Arrays.asList("qa", "ra", "rb", "sb", "sq"), Arrays.asList("qa", "ca", "cr", "sr", "sq"),
           Arrays.asList("qa", "ca", "co", "so", "sq"), Arrays.asList("qa", "ca", "cm", "sm", "sq"), Arrays.asList("qa", "ca", "ci", "si", "sq"),
           Arrays.asList("qa", "ta", "tc", "sc", "sq"), Arrays.asList("qa", "ta", "tb", "sb", "sq"), Arrays.asList("qa", "ta", "to", "so", "sq"),
           Arrays.asList("qa", "ta", "tm", "sm", "sq"), Arrays.asList("qa", "ta", "ti", "si", "sq"), Arrays.asList("qa", "ta", "th", "sh", "sq"),
           Arrays.asList("qa", "fa", "fe", "se", "sq"), Arrays.asList("qa", "fa", "fr", "sr", "sq"), Arrays.asList("qa", "fa", "fm", "sm", "sq"),
           Arrays.asList("qa", "ga", "ge", "se", "sq"), Arrays.asList("qa", "ga", "go", "so", "sq"), Arrays.asList("qa", "ha", "he", "se", "sq"),
           Arrays.asList("qa", "ha", "ho", "so", "sq"), Arrays.asList("qa", "ha", "hi", "si", "sq"), Arrays.asList("qa", "ya", "ye", "se", "sq"),
           Arrays.asList("qa", "ya", "yb", "sb", "sq"), Arrays.asList("qa", "ya", "yo", "so", "sq"), Arrays.asList("qa", "la", "li", "si", "sq"),
           Arrays.asList("qa", "la", "le", "se", "sq"), Arrays.asList("qa", "la", "lt", "st", "sq"), Arrays.asList("qa", "la", "lr", "sr", "sq"),
           Arrays.asList("qa", "la", "lo", "so", "sq"), Arrays.asList("qa", "la", "ln", "sn", "sq"), Arrays.asList("qa", "ma", "mi", "si", "sq"),
           Arrays.asList("qa", "ma", "me", "se", "sq"), Arrays.asList("qa", "ma", "mt", "st", "sq"), Arrays.asList("qa", "ma", "mr", "sr", "sq"),
           Arrays.asList("qa", "ma", "mb", "sb", "sq"), Arrays.asList("qa", "ma", "mo", "so", "sq"), Arrays.asList("qa", "ma", "mn", "sn", "sq"),
           Arrays.asList("qa", "na", "ni", "si", "sq"), Arrays.asList("qa", "na", "ne", "se", "sq"), Arrays.asList("qa", "na", "nb", "sb", "sq"),
           Arrays.asList("qa", "na", "no", "so", "sq"), Arrays.asList("qa", "pa", "po", "so", "sq"), Arrays.asList("qa", "pa", "pm", "sm", "sq"),
           Arrays.asList("qa", "pa", "pi", "si", "sq"), Arrays.asList("qa", "pa", "ph", "sh", "sq"), Arrays.asList("qa", "pa", "pt", "st", "sq"));
   Assert.assertEquals(expected, actual);
  }
}
