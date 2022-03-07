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
  @Test
  public void countBitsUntil() {
    int[] actual = BitMania.countBits(0);
    int[] expected = new int[]{0};
    Assert.assertArrayEquals(expected, actual);

    actual = BitMania.countBits(1);
    expected = new int[]{0, 1};
    Assert.assertArrayEquals(expected, actual);

    actual = BitMania.countBits(2);
    expected = new int[]{0, 1, 1};
    Assert.assertArrayEquals(expected, actual);

    actual = BitMania.countBits(3);
    expected = new int[]{0, 1, 1, 2};
    Assert.assertArrayEquals(expected, actual);

    actual = BitMania.countBits(4);
    expected = new int[]{0, 1, 1, 2, 1};
    Assert.assertArrayEquals(expected, actual);

    actual = BitMania.countBits(5);
    expected = new int[]{0, 1, 1, 2, 1, 2};
    Assert.assertArrayEquals(expected, actual);

    actual = BitMania.countBits(6);
    expected = new int[]{0, 1, 1, 2, 1, 2, 2};
    Assert.assertArrayEquals(expected, actual);

    actual = BitMania.countBits(7);
    expected = new int[]{0, 1, 1, 2, 1, 2, 2, 3};
    Assert.assertArrayEquals(expected, actual);

    actual = BitMania.countBits(8);
    expected = new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1};
    Assert.assertArrayEquals(expected, actual);

    actual = BitMania.countBits(9);
    expected = new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2};
    Assert.assertArrayEquals(expected, actual);

    actual = BitMania.countBits(10);
    expected = new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2};
    Assert.assertArrayEquals(expected, actual);
  }
}
