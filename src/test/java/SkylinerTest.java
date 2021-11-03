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

    actual = Skyliner.getSkyline(new int[][]{{0, 4, 3}, {1, 3, 2}});
    expected = Arrays.asList(Arrays.asList(0,3), Arrays.asList(4,0));
    Assert.assertEquals(expected, actual);

    actual = Skyliner.getSkyline(new int[][]{{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}});
    expected = Arrays.asList(Arrays.asList(2,10), Arrays.asList(3,15), Arrays.asList(7,12), Arrays.asList(12,0), Arrays.asList(15,10), Arrays.asList(20,8), Arrays.asList(24,0));
    Assert.assertEquals(expected, actual);
  }
}
