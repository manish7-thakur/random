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
}
