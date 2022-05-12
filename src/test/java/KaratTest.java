import org.junit.*;
import java.util.*;

public class KaratTest {
  @Test
  public void findParents() {
    Map<Integer, List<Integer>> actual = Karat.find(new int[][]{{1, 2}, {2, 3}, {3, 4}});
    Map<Integer, List<Integer>> expected = Map.of(0, List.of(1), 1, List.of(2, 3, 4));
    Assert.assertEquals(expected, actual);

    actual = Karat.find(new int[][]{{1, 2}, {3, 1}, {3, 4}});
    expected = Map.of(0, List.of(3), 1, List.of(1, 2, 4));
    Assert.assertEquals(expected, actual);

    actual = Karat.find(new int[][]{{1,3}, {2,3}, {3,4}, {4,5}, {6,5}});
    expected = Map.of(0, List.of(1, 2, 6), 1, List.of(4));
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void findCommonAncestor() {
    boolean actual = Karat.hasCommon(new int[][]{{1, 2}, {2, 3}, {3, 4}}, 3, 4);
    Assert.assertFalse(actual);
    actual = Karat.hasCommon(new int[][]{{1, 2}, {3, 5}, {3, 4}}, 5, 4);
    Assert.assertTrue(actual);
  }
  @Test
  public void searchWord() {
    boolean actual = Karat.search(new char[][] {{'a'},{'b'}}, "b");
    Assert.assertTrue(actual);

    actual = Karat.search(new char[][] {{'a'},{'b'}}, "c");
    Assert.assertFalse(actual);

    actual = Karat.search(new char[][] {{'a', 'v'},{'b', 'd'}}, "vd");
    Assert.assertTrue(actual);

    actual = Karat.search(new char[][] {{'a', 'v'},{'b', 'd'}}, "ad");
    Assert.assertFalse(actual);

    actual = Karat.search(new char[][] {
      {'a', 'v', 'e', 'o'},
      {'b', 'd', 'l', 'j'},
      {'f', 't', 'y', 'h'},
      {'f', 't', 'y', 'u'},
      {'e', 's', 'g', 'o'}
    }, "ftyuh");
    Assert.assertTrue(actual);
  }

  @Test
  public void findOverlappingTimes() {
    List<String> actual = Karat.findOverlapTimings(new ArrayList(List.of(1355, 1405,1315, 1416)));
    List<String> expected = List.of("1315", "1355", "1405");
    Assert.assertEquals(expected, actual);

    actual = Karat.findOverlapTimings(new ArrayList(List.of(800, 950, 850,900)));
    Assert.assertEquals(0, actual.size());

    actual = Karat.findOverlapTimings(new ArrayList(List.of(830, 855, 940, 1615, 1645,1630, 930, 915, 835)));
    expected = List.of("830", "835", "855", "915", "930");
    Assert.assertEquals(expected, actual);

    actual = Karat.findOverlapTimings(new ArrayList(List.of(830, 855, 940, 1615, 1645,1630, 930, 915, 835)));
    expected = List.of("830", "835", "855", "915", "930");
    Assert.assertEquals(expected, actual);

    actual = Karat.findOverlapTimings(new ArrayList(List.of(730, 830, 855, 940, 1615, 1645,1630, 930, 915, 835)));
    expected = List.of("830", "835", "855", "915", "930");
    Assert.assertEquals(expected, actual);

    actual = Karat.findOverlapTimings(new ArrayList(List.of(100, 110, 109)));
    expected = List.of("100", "109", "110");
    Assert.assertEquals(expected, actual);

    actual = Karat.findOverlapTimings(new ArrayList(List.of(100, 200, 300, 700)));
    Assert.assertEquals(0, actual.size());

    actual = Karat.findOverlapTimings(new ArrayList(List.of(100, 200, 300, 330, 503, 400, 500, 601, 602, 504)));
    expected = List.of("500", "503", "504");
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void findCulpritsInSecureRooms() {
    String[][] badgeTimes = new String[][]{
    {"Paul",      "1355"}, {"Jennifer",  "1910"}, {"Jose",    "835"},
    {"Jose",       "830"}, {"Paul",      "1315"}, {"Chloe",     "0"},
    {"Chloe",     "1910"}, {"Jose",      "1615"}, {"Jose",   "1640"},
    {"Paul",      "1405"}, {"Jose",       "855"}, {"Jose",    "930"},
    {"Jose",       "915"}, {"Jose",       "730"}, {"Jose",    "940"},
    {"Jennifer",  "1335"}, {"Jennifer",   "730"}, {"Jose",   "1630"},
    {"Jennifer",     "5"}, {"Chloe",     "1909"}, {"Zhang",     "1"},
    {"Zhang",       "10"}, {"Zhang",      "109"}, {"Zhang",   "110"},
    {"Amos",         "1"}, {"Amos",         "2"}, {"Amos",    "400"},
    {"Amos",       "500"}, {"Amos",       "503"}, {"Amos",    "504"},
    {"Amos",       "601"}, {"Amos",       "602"}, {"Paul",   "1416"}};
    Map<String, List<String>> actual = Karat.findCulprits(badgeTimes);
    Map<String, List<String>> expected = Map.of("Paul", List.of("1315", "1355", "1405"), "Jose", List.of("830", "835", "855", "915", "930"), "Zhang", List.of("100", "109", "110"), "Amos", List.of("500", "503", "504"));
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void findFirstWordContainedInScrambledString() {
    String actual = Karat.findEmbeddedWord(new String[]{"qw"}, "df");
    Assert.assertNull(actual);

    actual = Karat.findEmbeddedWord(new String[]{"qw", "fd"}, "df");
    String expected = "fd";
    Assert.assertEquals(expected, actual);

    actual = Karat.findEmbeddedWord(new String[]{"qw", "ff"}, "fd");
    Assert.assertNull(actual);

    actual = Karat.findEmbeddedWord(new String[]{"qw", "ff", "df"}, "fd");
    expected = "df";
    Assert.assertEquals(expected, actual);

    actual = Karat.findEmbeddedWord(new String[]{"cat", "baby", "dog", "bird", "car", "ax"}, "bbabylkkj");
    expected = "baby";
    Assert.assertEquals(expected, actual);

    actual = Karat.findEmbeddedWord(new String[]{"cat", "baby", "dog", "bird", "car", "ax"}, "ccc");
    Assert.assertNull(actual);

    actual = Karat.findEmbeddedWord(new String[]{"cat", "baby", "dog", "bird", "car", "ax"}, "baykkjl");
    Assert.assertNull(actual);

    actual = Karat.findEmbeddedWord(new String[]{"cat", "baby", "dog", "bird", "car", "ax"}, "breadmaking");
    expected = "bird";
    Assert.assertEquals(expected, actual);
  }
}
