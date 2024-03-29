import org.junit.*;
import java.util.*;

public class ArrayMania5Test {
  @Test
  public void findDuplicatesFilesInAFileSystem() {
    List<List<String>> actual = ArrayMania5.findDuplicate(new String[] {"root/a 1.txt(abcd)"});
    List<List<String>> expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania5.findDuplicate(new String[] {"root/a 1.txt(abcd)", "root/c 3.txt(abcd)"});
    expected = List.of(List.of("root/a/1.txt","root/c/3.txt"));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania5.findDuplicate(new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"});
    expected = List.of(List.of("root/a/2.txt", "root/c/d/4.txt"), List.of("root/a/1.txt","root/c/3.txt"));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania5.findDuplicate(new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"});
    expected = List.of(List.of("root/a/2.txt","root/c/d/4.txt","root/4.txt"), List.of("root/a/1.txt","root/c/3.txt"));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania5.findDuplicate(new String[] {"root/a 1.txt(abced) 2.txt(efgoh)","root/c 3.txt(abcd)","root/c/d 4.txt(efigh)","root 4.txt(efgh)"});
    expected = List.of();
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void floodFillWithColor() {
    int[][] actual = new int[][]{{0}};
    ArrayMania5.floodFill(actual, 0, 0, 0);
    int[][] expected = new int[][]{{0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{0}};
    ArrayMania5.floodFill(actual, 0, 0, 1);
    expected = new int[][]{{1}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{0, 0}};
    ArrayMania5.floodFill(actual, 0, 1, 1);
    expected = new int[][]{{1, 1}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 0}};
    ArrayMania5.floodFill(actual, 0, 1, 2);
    expected = new int[][]{{1, 2}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 0}, {1, 0}};
    ArrayMania5.floodFill(actual, 1, 1, 1);
    expected = new int[][]{{1, 1}, {1, 1}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 0}, {1, 0}, {2, 0}};
    ArrayMania5.floodFill(actual, 1, 1, 1);
    expected = new int[][]{{1, 1}, {1, 1}, {2, 1}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 0, 2}, {1, 0, 0}, {2, 0, 0}};
    ArrayMania5.floodFill(actual, 1, 1, 1);
    expected = new int[][]{{1, 1, 2}, {1, 1, 1}, {2, 1, 1}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 0, 2}, {1, 0, 0}, {2, 0, 2}};
    ArrayMania5.floodFill(actual, 1, 1, 1);
    expected = new int[][]{{1, 1, 2}, {1, 1, 1}, {2, 1, 2}};
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void medianFinder() {
    int actual = ArrayMania5.findMedian(new int[] {1});
    int expected = 1;
    actual = ArrayMania5.findMedian(new int[] {2, 1, 3});
    expected = 2;
    Assert.assertEquals(expected, actual);
    actual = ArrayMania5.findMedian(new int[] {2, 5, 4, 1, 7});
    expected = 4;
    Assert.assertEquals(expected, actual);
    actual = ArrayMania5.findMedian(new int[] {9, 8, 2, 1, 7});
    expected = 7;
    Assert.assertEquals(expected, actual);
    actual = ArrayMania5.findMedian(new int[] {2, 8, 7, 1, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);
  }
}
