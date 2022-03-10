import org.junit.*;
import java.util.*;

public class DPTest {
  @Test
  public void uniqueWaysToClimbStairsWithStepsOneAndTwo() {
    int actual = DP.climbStairs(1);
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.climbStairs(2);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.climbStairs(3);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP.climbStairs(7);
    expected = 21;
    Assert.assertEquals(expected, actual);

    actual = DP.climbStairs(20);
    expected = 10946;
    Assert.assertEquals(expected, actual);

    actual = DP.climbStairs(45);
    expected = 1836311903;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void minNumberOfCoins() {
    int actual = DP.coinChange(new int[]{1}, 0);
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{1}, 1);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2}, 1);
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 3}, 3);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 5, 7}, 3);
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 5, 7}, 9);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 5, 7, 4, 9}, 9);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 5, 7, 4, 9, 3}, 12);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 5, 7, 4, 9}, 459);
    expected = 51;
    Assert.assertEquals(expected, actual);

    actual = DP.coinChange(new int[]{2, 11, 5, 7, 4, 9}, 453);
    expected = 42;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void findLongestCommonSubsequence() {
    int actual = DP.longestCommonSubsequence("w", "p");
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubsequence("wp", "p");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubsequence("wp", "pw");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubsequence("wpt", "ptw");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubsequence("wpty", "ptwy");
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubsequence("wptty", "ptwthy");
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubsequence("wpssddjsywmdfttyetdy", "ptwtssjldiwjhdeyfhshy");
    expected = 8;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void breakWordToFormDictionary() {
    boolean actual = DP.wordBreak("k", List.of("r"));
    Assert.assertFalse(actual);

    actual = DP.wordBreak("krd", List.of("krd"));
    Assert.assertTrue(actual);

    actual = DP.wordBreak("aaaaa", List.of("aaa","aa"));
    Assert.assertTrue(actual);

    actual = DP.wordBreak("yousuck", List.of("you", "suck"));
    Assert.assertTrue(actual);

    actual = DP.wordBreak("yousuck", List.of("you", "yous", "uck"));
    Assert.assertTrue(actual);

    actual = DP.wordBreak("applepennep", List.of("nep", "pen", "apple"));
    Assert.assertTrue(actual);

    actual = DP.wordBreak("pineapplepenapplepineapplepenappleapineapplepenple", List.of("apple", "pen", "applepen",
    "pine", "p", "i", "n", "a", "e", "l", "ne", "pe", "ple", "en", "app", "pin"));
    Assert.assertTrue(actual);

    actual = DP.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaab", List.of("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
    Assert.assertFalse(actual);
  }

  @Test
  public void combinationSumFromDistinctNums() {
    List<List<Integer>> actual = DP.combinationSum(new int[]{2}, 1);
    List<List<Integer>> expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = DP.combinationSum(new int[]{1}, 2);
    expected = List.of(List.of(1, 1));
    Assert.assertEquals(expected, actual);

    actual = DP.combinationSum(new int[]{2, 1}, 3);
    expected = List.of(List.of(1, 2), List.of(1, 1, 1));
    Assert.assertEquals(expected, actual);

    actual = DP.combinationSum(new int[]{2, 1, 4}, 7);
    expected = List.of(List.of(1, 2, 2, 2), List.of(1, 1, 1, 2, 2), List.of(1, 1, 1, 1, 1, 2), List.of(4, 1, 2), List.of(1, 1, 1, 1, 1, 1, 1), List.of(4, 1, 1, 1));
    Assert.assertEquals(expected, actual);

    actual = DP.combinationSum(new int[]{9, 3, 7, 2}, 14);
    expected = List.of(List.of(2, 3, 9), List.of(2, 3, 3, 3, 3), List.of(2, 2, 2, 2, 3, 3), List.of(2, 2, 7, 3), List.of(7, 7), List.of(2, 2, 2, 2, 2, 2, 2));
    Assert.assertEquals(expected, actual);

    actual = DP.combinationSum(new int[]{9, 3, 7, 14, 2, 5, 13, 8, 17}, 227);
    Assert.assertEquals(12903062, actual.size());

  }
}
