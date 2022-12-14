import org.junit.*;

public class NumArrayTest {
  @Test
  public void numArrayQueries() {
    NumArray arr = new NumArray(new int[]{2, -1, 3, 4});
    Assert.assertEquals(2, arr.sumRange(0, 0));
    Assert.assertEquals(4, arr.sumRange(0, 2));
    Assert.assertEquals(6, arr.sumRange(1, 3));
    Assert.assertEquals(8, arr.sumRange(0, 3));
    Assert.assertEquals(3, arr.sumRange(2, 2));

    arr = new NumArray(new int[]{6});
    Assert.assertEquals(6, arr.sumRange(0, 0));
  }
}
