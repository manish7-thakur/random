import org.junit.*;
import java.util.*;

public class SkylinerTest {
  @Test
  public void findSkyline() {
    List<List<Integer>> actual = Skyliner.getSkyline(new int[][]{{0, 2, 3}});
    List<List<Integer>> expected = Arrays.asList(Arrays.asList(0,3), Arrays.asList(2,0));
    Assert.assertEquals(expected, actual);

    actual = Skyliner.getSkyline(new int[][]{{0, 2, 3}, {2, 5, 3}});
    expected = Arrays.asList(Arrays.asList(0,3), Arrays.asList(5,0));
    Assert.assertEquals(expected, actual);

    actual = Skyliner.getSkyline(new int[][]{{0, 2, 3}, {0, 1, 2}});
    expected = Arrays.asList(Arrays.asList(0,3), Arrays.asList(2,0));
    Assert.assertEquals(expected, actual);

    actual = Skyliner.getSkyline(new int[][]{{3, 5, 3}, {4, 5, 2}});
    expected = Arrays.asList(Arrays.asList(3,3), Arrays.asList(5,0));
    Assert.assertEquals(expected, actual);

    actual = Skyliner.getSkyline(new int[][]{{6, 7, 2}, {7, 8, 3}});
    expected = Arrays.asList(Arrays.asList(6,2), Arrays.asList(7,3), Arrays.asList(8,0));
    Assert.assertEquals(expected, actual);
  }
}
