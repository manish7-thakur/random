import org.junit.*;

public class NumArrayTest {
  @Test
  public void numArrayQueries() {
    NumArray arr = new NumArray(new int[]{1, 2});
    Assert.assertEquals(1, arr.sumRange(0, 0));
    arr.update(1, 5);
    Assert.assertEquals(6, arr.sumRange(0, 1));
  }
}
