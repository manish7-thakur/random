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
  }
}
