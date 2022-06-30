import org.junit.*;

public class DP2Test {
  @Test
  public void partionWith2EqualSubsetSum() {
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
  public void findLengthOfLongestArithmaticSeq() {
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
  }
}
