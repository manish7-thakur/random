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

    actual = DP.combinationSum(new int[]{9, 3, 7, 14, 2, 5, 13, 8, 17}, 23);
    Assert.assertEquals(63, actual.size());
  }

  @Test
  public void houseRobberStealingAlternateHouses() {
    int actual = DP.rob(new int[]{1});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.rob(new int[]{1, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.rob(new int[]{1, 1, 1});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.rob(new int[]{1, 2, 3, 1});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = DP.rob(new int[]{4, 0, 2, 3, 0});
    expected = 7;
    Assert.assertEquals(expected, actual);

    actual = DP.rob(new int[]{2, 7, 9, 3, 1});
    expected = 12;
    Assert.assertEquals(expected, actual);

    actual = DP.rob(new int[]{2, 7, 9, 3, 1, 5, 6, 3, 2, 3, 3, 2, 6, 7, 2, 1, 67, 8, 2, 2, 2, 3, 5, 3, 4, 3, 5, 3, 2, 4, 4, 6, 3, 6, 6, 89, 4, 3, 5, 78, 4, 32, 3, 55, 54});
    expected = 389;
    Assert.assertEquals(expected, actual);

    actual = DP.rob(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    expected = 0;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void houseRobberStealingAleternateHousesCircular() {
    int actual = DP.robC(new int[]{1});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.robC(new int[]{1, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.robC(new int[]{1, 0});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.robC(new int[]{0, 1});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.robC(new int[]{1, 2, 3});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP.robC(new int[]{3, 2, 1, 3});
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = DP.robC(new int[]{3, 2, 1, 1, 2});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = DP.robC(new int[]{4, 0, 2, 3, 0});
    expected = 7;
    Assert.assertEquals(expected, actual);

    actual = DP.robC(new int[]{0, 1, 2, 2, 1});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP.robC(new int[]{0, 1, 2, 0, 1});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP.robC(new int[]{2, 7, 9, 0, 1, 5, 6, 0, 2, 3, 3, 2, 6, 7, 2, 1, 0, 8, 2, 2, 2, 3, 5, 3, 4, 3, 5, 3, 2, 4, 0, 6, 3, 6, 6, 0, 4, 3, 5, 78, 4, 32, 3, 0, 54});
    expected = 237;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void decodeWaysForDigitStringToChars() {
    int actual = DP.numDecodings("0");
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = DP.numDecodings("1");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.numDecodings("01");
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = DP.numDecodings("10");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.numDecodings("11");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.numDecodings("101");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.numDecodings("011");
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = DP.numDecodings("111");
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP.numDecodings("0110");
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = DP.numDecodings("28");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.numDecodings("192");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.numDecodings("1226");
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = DP.numDecodings("1283520461914729346294183812638116264859374525274354242281273353614122326487254624261736272629463226");
    expected = 8847360;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void uniquePathsMatrix() {
    int actual = DP.uniquePaths(1, 1);
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.uniquePaths(1, 2);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.uniquePaths(2, 1);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.uniquePaths(2, 2);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.uniquePaths(2, 2);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.uniquePaths(3, 2);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP.uniquePaths(2, 3);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP.uniquePaths(3, 3);
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = DP.uniquePaths(3, 7);
    expected = 28;
    Assert.assertEquals(expected, actual);

    actual = DP.uniquePaths(15, 20);
    expected = 818809200;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void jumpUsingNums() {
    boolean actual = DP.canJump(new int[]{0});
    Assert.assertTrue(actual);

    actual = DP.canJump(new int[]{0, 1});
    Assert.assertFalse(actual);

    actual = DP.canJump(new int[]{1, 1});
    Assert.assertTrue(actual);

    actual = DP.canJump(new int[]{1, 0, 1});
    Assert.assertFalse(actual);

    actual = DP.canJump(new int[]{1, 2, 1});
    Assert.assertTrue(actual);

    actual = DP.canJump(new int[]{1, 2, 0, 1});
    Assert.assertTrue(actual);

    actual = DP.canJump(new int[]{2, 2, 0, 1});
    Assert.assertTrue(actual);

    actual = DP.canJump(new int[]{1, 1, 1, 0});
    Assert.assertTrue(actual);

    actual = DP.canJump(new int[]{3, 2, 1, 0, 4});
    Assert.assertFalse(actual);

    actual = DP.canJump(new int[]{1, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1});
    Assert.assertFalse(actual);
  }
  @Test
  public void longestOverlappingBrowsingHistory() {
    int actual = DP.longestCommonSubstring(new String[] {}, new String[]{});
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubstring(new String[] {"/cy.com"}, new String[]{"/cy.com"});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubstring(new String[] {"/cy.com", "/ac.com"}, new String[]{"/py.com", "/cy.com"});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubstring(new String[] {"/py.com", "/cy.com", "/ac.com"}, new String[]{"/py.com", "/cy.com"});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubstring(new String[] {"/py.com", "/bb.com", "/ac.com", "/cy.com"}, new String[]{"/py.com", "/cy.com"});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP.longestCommonSubstring(new String[] {"/py.com", "/bb.com", "/ac.com", "/cy.com"}, new String[]{"/bb.com", "/ac.com", "/py.com", "/cy.com"});
    expected = 2;
    Assert.assertEquals(expected, actual);
  }
}
