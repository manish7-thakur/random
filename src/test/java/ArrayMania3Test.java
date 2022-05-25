import org.junit.*;
import java.util.*;

public class ArrayMania3Test {
  @Test
  public void findMajorityElement() {
    int actual = ArrayMania3.majorityElement(new int[]{1});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement(new int[]{1, 2, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement(new int[]{2, 1, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement(new int[]{1, 2, 1, 3, 1});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement(new int[]{4, 3, 4, 3, 3});
    expected = 3;
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void findOneThirdMajorityElement() {
    List<Integer> actual = ArrayMania3.majorityElement3(new int[]{1});
    List<Integer> expected = List.of(1);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement3(new int[]{2, 1});
    expected = List.of(2, 1);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement3(new int[]{0, 0});
    expected = List.of(0);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement3(new int[]{2, 1, 3});
    expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement3(new int[]{0, 0, 0});
    expected = List.of(0);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement3(new int[]{2, 1, 2});
    expected = List.of(2);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement3(new int[]{3, 1, 2, 2});
    expected = List.of(2);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement3(new int[]{3, 1, 2, 3, 4});
    expected = List.of(3);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement3(new int[]{3, 1, 2, 3, 2});
    expected = List.of(3, 2);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement3(new int[]{2, 1, 4, 2, 3, 2, 8});
    expected = List.of(2);
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void fourSumFrom4Arrays() {
    int actual = ArrayMania3.fourSumCount(new int[]{-2}, new int[]{0}, new int[]{2}, new int[]{0});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.fourSumCount(new int[]{-2, 1}, new int[]{1, 0}, new int[]{1, 0}, new int[]{0, 3});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.fourSumCount(new int[]{-2, 1}, new int[]{1, 0}, new int[]{1, 2}, new int[]{0, -3});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.fourSumCount(new int[]{-2, 1, 2}, new int[]{1, 0, -2}, new int[]{1, 2, 0}, new int[]{0, -3, 1});
    expected = 11;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void findEelmentsThatOccuredTwice() {
    List<Integer> actual = ArrayMania3.findDuplicates(new int[]{1});
    List<Integer> expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findDuplicates(new int[]{1, 1});
    expected = List.of(1);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findDuplicates(new int[]{2, 1, 2});
    expected = List.of(2);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findDuplicates(new int[]{2, 1, 2, 1});
    expected = List.of(2, 1);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findDuplicates(new int[]{2, 5, 1, 5, 2});
    expected = List.of(5, 2);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findDuplicates(new int[]{2, 3, 1, 8, 9, 4, 5, 9, 7, 6});
    expected = List.of(9);
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void increasingSubsequencesWithAtleastTwoElements() {
    List<List<Integer>> actual = ArrayMania3.findSubsequences(new int[]{1});
    List<List<Integer>> expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findSubsequences(new int[]{1, 2});
    expected = List.of(List.of(1, 2));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findSubsequences(new int[]{2, 1});
    expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findSubsequences(new int[]{2, 2});
    expected = List.of(List.of(2, 2));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findSubsequences(new int[]{2, 1, 2});
    expected = List.of(List.of(2, 2), List.of(1, 2));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findSubsequences(new int[]{1, 2, 3});
    expected = List.of(List.of(1, 2, 3), List.of(1, 2), List.of(2, 3), List.of(1, 3));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findSubsequences(new int[]{2, 2, 3});
    expected = List.of(List.of(2, 2), List.of(2, 2, 3), List.of(2, 3));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findSubsequences(new int[]{1, 2, 1});
    expected = List.of( List.of(1, 1), List.of(1, 2));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findSubsequences(new int[]{1, 2, 1, 1});
    expected = List.of(List.of(1, 1, 1), List.of(1, 1), List.of(1, 2));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.findSubsequences(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 1, 1, 1});
    Assert.assertEquals(1018, actual.size());

    actual = ArrayMania3.findSubsequences(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10});
    Assert.assertEquals(14, actual.size());
  }
}
