import org.junit.*;

public class PalindromePartitionerTest {
  @Test
  public void findMinCuts() {
    int actual = PalindromePartitioner.minCut("a");
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = PalindromePartitioner.minCut("aa");
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = PalindromePartitioner.minCut("ab");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = PalindromePartitioner.minCut("abc");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = PalindromePartitioner.minCut("abbc");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = PalindromePartitioner.minCut("abbccccddd");
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = PalindromePartitioner.minCut("dddccccbbabbccccddd");
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = PalindromePartitioner.minCut("addhdfkugowerskdhsiwh");
    expected = 18;
    Assert.assertEquals(expected, actual);
  }
}
