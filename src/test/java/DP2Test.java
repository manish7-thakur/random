import org.junit.*;

import java.util.Arrays;
import java.util.Random;

public class DP2Test {
  @Test
  public void partitionWith2EqualSubsetSum() {
    boolean actual = DP2.canPartition(new int[]{2});
    Assert.assertFalse(actual);

    actual = DP2.canPartition(new int[]{2, 2});
    Assert.assertTrue(actual);

    actual = DP2.canPartition(new int[]{1, 2, 1});
    Assert.assertTrue(actual);

    actual = DP2.canPartition(new int[]{1, 3, 2, 1});
    Assert.assertFalse(actual);

    actual = DP2.canPartition(new int[]{1, 5, 11, 5});
    Assert.assertTrue(actual);

    actual = DP2.canPartition(new int[]{3, 1, 2, 1, 3});
    Assert.assertTrue(actual);

    actual = DP2.canPartition(new int[]{9, 1, 2, 4, 10});
    Assert.assertTrue(actual);

    actual = DP2.canPartition(new int[]{35, 12, 22, 11, 34, 5, 6, 13, 22, 3, 21, 72, 12, 33, 53, 23, 12, 34, 34, 86, 46, 32, 24, 32, 42, 23, 24, 52, 67, 63});
    Assert.assertTrue(actual);

    actual = DP2.canPartition(new int[]{35, 1, 22, 11, 34, 5, 6, 13, 22, 3, 21, 72, 12, 33, 53, 23, 12, 34, 34, 86, 46, 32, 24, 32, 42, 23, 24, 52, 67, 63});
    Assert.assertFalse(actual);

    actual = DP2.canPartition(new int[]{26,50,1,66,5,91,98,65,31,19,15,25,87,58,19,67,64,48,64,85,25,81,7,92,87,6,37,43,8,49,71,47,3,7,10,96,69,78,99,33,91,41,4,34,68,44,100,67,58,57,30,61,100,86,59,65,44,81,82,53,79,48,31,13,39,22,56,43,88,37,66,64,60,27,40,89,99,27,62,50,5,20,31,71,77,14,67,7,44,58,83,96,100,24,86,52,38,31,69,47});
    Assert.assertFalse(actual);

    actual = DP2.canPartition(new int[]{41,20,99,98,50,48,64,15,74,94,60,33,61,34,47,35,24,58,28,73,36,51,80,57,42,52,73,27,94,59,50,99,32,65,76,62,69,80,41,51,49,74,93,12,77,30,25,59,55,13,41,23,34,31,47,53,8,88,86,88,36,32,23,37,1,7,67,49,20,31,59,99,15,21,47,35,93,1,14,56,57,36,13,27,26,64,63,52,98,20,52,23,84,39,34,59,98,71,90,99});
    Assert.assertTrue(actual);
  }
  @Test
  public void findLengthOfLongestArithmeticSeq() {
    int actual = DP2.longestArithSeqLength(new int[]{1, 4});
    int expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP2.longestArithSeqLength(new int[]{1, 2, 3});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.longestArithSeqLength(new int[]{1, 3, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP2.longestArithSeqLength(new int[]{1, 3, 2, 5});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.longestArithSeqLength(new int[]{3, 5, 2, 6, 7, 3});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.longestArithSeqLength(new int[]{3, 6, 9, 12});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = DP2.longestArithSeqLength(new int[]{9, 4, 7, 2, 10});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.longestArithSeqLength(new int[]{20, 1, 15, 3, 10, 5, 8});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = DP2.longestArithSeqLength(new int[]{0,1,0,1,0,1,0,0,1,0,0,1,0,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,0,0,1,1,1,0,0,1,0,1,0,0,1,0,0,1,1,0,1,1,1,1,0,0,1,1,0,0,1,0,0,0,0,1,1,0,0,0,1,1,1,1,0,0,0,0,0,0,1,1,1,1,0,1,0,1,0,0,1,0,1,1,0,0,1,1,1,1,1,1,1,1,0,1,1,0,0,1,0,1,1,1,1,0,1,1,0,0,1,1,1,0,1,0,0,0,1,0,1,1,0,0,1,0,1,1,1,0,0,1,0,0,1,0,0,1,0,1,0,0,0,1,0,1,1,0,0,0,0,1,0,1,1,1,1,1,0,0,0,1,1,0,0,1,1,0,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,0,0,0,1,1,1,1,1,0,0,1,1,1,1,0,1,0,1,0,0,1,0,0,1,1,1,1,0,0,0,0,0,1,0,1,0,0,0,0,1,0,1,1,1,1,1,1,0,0,1,0,1,1,1,0,0,0,0,1,0,1,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,0,0,0,0,1,1,1,0,0,1,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,1,1,1,1,1,1,1,0,0,1,0,1,1,0,0,1,1,1,1,0,1,0,1,0,1,1,0,1,1,0,1,0,0,1,0,1,0,0,0,1,0,0,0,0,1,0,0,1,0,1,0,1,0,1,1,1,0,0,1,1,0,0,1,0,0,1,0,0,0,1,1,1,1,1,0,0,1,0,1,1,1,1,0,1,1,0,1,0,0,1,1,1,1,0,0,0,1,1,1,0,0,1,0,0,0,0,1,1,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,1,1,0,1,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,1,0,1,0,0,0,1,1,0,1,1,0,0,1,1,0,0,0,1,0,1,1,0,1,1,1,1,0,0,0,1,1,0,1,0,1,1,0,0,1,0,1,0,1,0,0,1,1,1,1,0,0,0,0,0,1,0,0,0,1,0,1,0,1,0,1,1,0,1,0,0,0,0,0,1,1,0,1,0,0,1,1,1,0,0,1,0,1,0,1,0,0,1,1,0,0,1,0,1,1,0,0,0,0,1,0,0,1,1,1,0,0,1,1,0,1,0,0,0,1,1,1,1,1,0,0,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,1,1,0,0,1,0,0,1,0,0,0,0,0,1,0,1,1,1,0,1,1,0,1,0,1,0,1,1,0,0,0,1,1,1,1,1,0,0,1,0,0,1,0,1,1,1,0,0,1,1,1,1,1,0,1,0,0,1,1,0,1,0,1,0,0,0,1,1,1,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0,1,1,1,1,1,0,1,0,0,1,0,0,1,1,0,0,0,1,0,1,0,0,1,0,0,0,0,1,0,1,1,0,1,1,0,0,1,1,1,0,0,0,1,1,0,0,1,0,1,0,1,0,1,0,0,0,0,1,0,1,1,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,1,0,0,0,1,1,1,1,1,1,0,0,0,0,1,1,1,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,1,1,0,0,0,0,0,0,1,1,0,1,0,0,0,1,1,1,0,1,0,1,1,1,1,0,0,0,0,1,1,1,0,1,1,0,0,0,1,0,0,0,1,1,1,0,0,1,0,1,0,1,0,0,1,0,1,1,1,0,1,1,1,0,0,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,1,1,1,0,0,0,0,1,1,1,0,0,1,0,0,0,0,1,0,1,1,1,0,0,1,0,0,0,1,1,1,0,0,1,0,0,1,1,0,1,0,0,1,0,1,1,1,1,1,1,0,0,1,0,1,1,1,1,0,0,0,0,0,1,1,0,1,1,0,0,1,0,1,0,1,1,0,0,1,1,1,0,0,0,1,1,1,0,1,0,1,1,1,1,0,1,1,0});
    expected = 510;
    Assert.assertEquals(expected, actual);

    // actual = DP2.longestArithSeqLength(new int[]{214,450,10,56,35,16,45,347,375,208,398,46,284,489,415,380,409,106,30,66,39,411,410,201,105,345,136,76,327,451,71,328,496,248,425,97,76,193,391,429,191,36,407,172,90,163,309,37,403,156,257,77,338,457,445,357,142,493,500,165,440,154,88,193,359,296,70,97,364,84,395,240,2,74,219,277,447,149,3,297,40,196,96,161,147,106,27,429,348,436,42,494,371,331,104,10,283,415,444,126,476,392,25,437,167,148,251,275,94,52,325,459,353,247,266,129,479,363,493,375,110,420,430,97,84,31,118,150,164,188,456,117,158,144,482,150,179,6,164,73,438,295,123,2,402,111,182,161,350,260,486,18,285,485,281,131,486,121,116,253,323,423,47,328,139,169,32,148,256,397,267,484,312,50,123,250,416,390,445,87,281,174,93,15,293,471,103,280,42,147,111,194,188,338,396,340,500,92,240,480,153,162,206,277,208,401,414,60,257,167,419,175,175,100,314,449,469,246,412,424,52,303,83,9,30,4,245,106,91,354,90,347,460,208,217,197,480,412,288,222,182,443,19,454,91,74,136,309,236,412,8,64,422,87,54,330,276,256,12,180,340,144,487,302,418,130,50,446,487,169,204,403,229,63,399,430,272,473,370,456,415,384,418,149,22,15,364,173,213,84,185,236,11,353,433,345,25,413,200,107,369,193,68,300,199,450,490,230,141,112,154,43,490,206,11,55,204,318,373,180,253,357,486,441,180,441,459,47,387,213,120,462,301,21,139,306,497,264,342,446,311,305,448,21,279,471,496,419,462,358,216,490,237,312,159,90,34,36,352,119,372,290,42,114,162,3,369,122,127,236,464,10,204,225,219,221,443,101,15,263,313,498,164,451,387,217,364,316,371,263,380,96,30,65,417,290,451,207,351,317,457,366,350,2,414,375,177,447,409,272,252,486,156,87,200,116,201,498,342,98,67,279,466,271,75,161,492,237,481,356,403,64,473,362,56,466,175,99,197,308,327,413,343,474,446,76,375,68,479,490,167,339,249,419,424,355,101,371,84,86,270,335,244,293,75,121,118,89,171,197,221,15,234,402,239,225,475,426,337,92,432,253,210,163,251,219,440,492,280,317,336,148,302,276,353,446,448,83,444,304,244,169,45,65,202,62,318,457,431,161,471,54,288,150,280,159,376,169,115,458,371,458,446,146,232,153,487});
    // expected = 8;
    // Assert.assertEquals(expected, actual);
  }
  @Test
  public void minimumNumberOfPrimesToSum() {
    int actual = DP2.numSquares(1);
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(3);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(4);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(11);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(12);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(13);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(253);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(452);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(853);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(999);
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(462);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(620);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(7563);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(8285);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(9573);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.numSquares(9999);
    expected = 4;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void maxProfitWithCoolDown() {
    int actual = DP2.maxProfit(new int[]{1});
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = DP2.maxProfit(new int[]{1, 1});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = DP2.maxProfit(new int[]{1, 2});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DP2.maxProfit(new int[]{1, 2, 4});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DP2.maxProfit(new int[]{1, 2, 1, 1, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DP2.maxProfit(new int[]{1, 2, 3, 0, 2});
    expected = 3;
    Assert.assertEquals(expected, actual);
  }
}
