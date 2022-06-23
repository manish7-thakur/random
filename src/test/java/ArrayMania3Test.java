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
  @Test
  public void sortThreeColors() {
    int[] actual = new int[]{0};
    ArrayMania3.sortColors(actual);
    int[] expected = new int[]{0};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{1, 0};
    ArrayMania3.sortColors(actual);
    expected = new int[]{0, 1};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{1, 0, 1};
    ArrayMania3.sortColors(actual);
    expected = new int[]{0, 1, 1};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{0, 2, 0};
    ArrayMania3.sortColors(actual);
    expected = new int[]{0, 0, 2};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{0, 2, 1, 1};
    ArrayMania3.sortColors(actual);
    expected = new int[]{0, 1, 1, 2};
    Assert.assertArrayEquals(expected, actual);
  }
  @Test
  public void nearByDuplicate() {
    boolean actual = ArrayMania3.containsNearbyAlmostDuplicate(new int[] {1}, 0, 0);
    Assert.assertFalse(actual);

    actual = ArrayMania3.containsNearbyAlmostDuplicate(new int[]{1, 2}, 1, 1);
    Assert.assertTrue(actual);

    actual = ArrayMania3.containsNearbyAlmostDuplicate(new int[]{1, -2}, 1, 1);
    Assert.assertFalse(actual);

    actual = ArrayMania3.containsNearbyAlmostDuplicate(new int[]{2, 1}, 1, 1);
    Assert.assertTrue(actual);

    actual = ArrayMania3.containsNearbyAlmostDuplicate(new int[]{-2, 0, 3, 4}, 2, 3);
    Assert.assertTrue(actual);

    actual = ArrayMania3.containsNearbyAlmostDuplicate(new int[]{-2, 2, 6, 1}, 1, 3);
    Assert.assertFalse(actual);
  }
  @Test
  public void removeDuplicatesInPlace() {
    int actual = ArrayMania3.removeDuplicates(new int[]{1});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.removeDuplicates(new int[]{1, 1});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.removeDuplicates(new int[]{1, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.removeDuplicates(new int[]{1, 2, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3, 5, 6, 6, 6});
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.removeDuplicates(new int[]{-1, -1, 0, 1, 1, 2, 2, 3, 5, 6, 6, 6});
    expected = 7;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.removeDuplicates(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    expected = 9;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void daysToWarmTemperatureFromToday() {
    int[] actual = ArrayMania3.dailyTemperatures(new int[]{23});
    int[] expected = new int[]{0};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania3.dailyTemperatures(new int[]{23, 25});
    expected = new int[]{1, 0};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania3.dailyTemperatures(new int[]{23, 22, 25});
    expected = new int[]{2, 1, 0};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania3.dailyTemperatures(new int[]{21, 22, 20, 19});
    expected = new int[]{1, 0, 0, 0};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania3.dailyTemperatures(new int[]{21, 22, 23, 24});
    expected = new int[]{1, 1, 1, 0};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania3.dailyTemperatures(new int[]{73,74, 75, 71, 69, 72, 76, 73});
    expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania3.dailyTemperatures(new int[]{-1 ,-2, -3, -45, -69, -72, -76});
    expected = new int[]{0, 0, 0, 0, 0, 0, 0};
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void countSubarraysWithSum() {
    int actual = ArrayMania3.subarraySum(new int[]{1}, 1);
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.subarraySum(new int[]{1, 1}, 1);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.subarraySum(new int[]{1, 2, 1, 2}, 1);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.subarraySum(new int[]{1, 2, 1, 2, 1}, 3);
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.subarraySum(new int[]{1, 1, 1, 2, 1}, 3);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.subarraySum(new int[]{1, 2, 3, 2, 1}, 6);
    expected = 2;
    Assert.assertEquals(expected, actual);
  }

}
