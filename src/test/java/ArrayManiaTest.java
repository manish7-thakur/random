import org.junit.*;
import java.util.*;
public class ArrayManiaTest {
  @Test
  public void findTripletsWithSumZero() {
    List<List<Integer>> actual = ArrayMania.threeSum(new int[]{});
    List<List<Integer>> expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.threeSum(new int[]{0, 1});
    expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.threeSum(new int[]{0, 1, -1});
    expected = List.of(List.of(-1, 0, 1));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.threeSum(new int[]{1, 0, 1, -1, -2});
    expected = List.of(List.of(-2, 1, 1), List.of(-1, 0, 1));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.threeSum(new int[]{1, 2, 0, 1, -2});
    expected = List.of(List.of(-2, 0, 2), List.of(-2, 1, 1));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.threeSum(new int[]{1, -1, 0, 1, -1, -2});
    expected = List.of(List.of(-2, 1, 1), List.of(-1, 0, 1));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.threeSum(new int[]{-1, 0, 3, -1, -2});
    expected = List.of(List.of(-2, -1, 3));
    Assert.assertEquals(expected, actual);
  }
}
