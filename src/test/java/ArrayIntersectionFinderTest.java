import org.junit.*;
import java.util.*;

public class ArrayIntersectionFinderTest {
  @Test
  public void findIntersectionOf2Arrays() {
    List<Integer> actual = ArrayIntersectionFinder.find(new int[]{1}, new int[]{1});
    List<Integer> expected = Arrays.asList(1);
    Assert.assertEquals(expected, actual);

    actual = ArrayIntersectionFinder.find(new int[]{1, 2}, new int[]{1, 2});
    expected = Arrays.asList(1, 2);
    Assert.assertEquals(expected, actual);

    actual = ArrayIntersectionFinder.find(new int[]{3, 6, 3}, new int[]{2, 3, 3});
    expected = Arrays.asList(3, 3);
    Assert.assertEquals(expected, actual);

    actual = ArrayIntersectionFinder.find(new int[]{3, 6, 3}, new int[]{2, 3, 3});
    expected = Arrays.asList(3, 3);
    Assert.assertEquals(expected, actual);

    actual = ArrayIntersectionFinder.find(new int[]{3, 6, 1, 3, 1}, new int[]{2, 3, 3, 1, 2, 1});
    expected = Arrays.asList(3, 3, 1, 1);
    Assert.assertEquals(expected, actual);

    actual = ArrayIntersectionFinder.find(new int[]{3, 6, 1, 3, 1, 1}, new int[]{2, 3, 3, 1, 2, 1, 1});
    expected = Arrays.asList(3, 3, 1, 1, 1);
    Assert.assertEquals(expected, actual);
  }
}
