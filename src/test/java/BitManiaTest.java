import org.junit.*;

public class BitManiaTest {
  @Test
  public void addTwoNumsWithoutusingPlus() {
    int actual = BitMania.getSum(0, 1);
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = BitMania.getSum(-1, 1);
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = BitMania.getSum(-1, -3);
    expected = -4;
    Assert.assertEquals(expected, actual);

    actual = BitMania.getSum(4, 4);
    expected = 8;
    Assert.assertEquals(expected, actual);

    actual = BitMania.getSum(5, 0);
    expected = 5;
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void countTheNumberOfOnesInTheBinary() {
    int actual = BitMania.hammingWeight(0);
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = BitMania.hammingWeight(1);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = BitMania.hammingWeight(2);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = BitMania.hammingWeight(3);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = BitMania.hammingWeight(23);
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = BitMania.hammingWeight(32);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = BitMania.hammingWeight(-3); // 11111111111111111111111111111101
    expected = 31;
    Assert.assertEquals(expected, actual);

    actual = BitMania.hammingWeight(4096);
    expected = 1;
    Assert.assertEquals(expected, actual);

  }
}
