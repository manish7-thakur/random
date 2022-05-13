import org.junit.*;

public class ArrayMania3Test {
  @Test
  public void findMajorityElement() {
    int actual = ArrayMania3.majorityElement(new int[]{1});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement(new int[]{1, 2, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement(new int[]{2, 1, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement(new int[]{1, 2, 1, 3, 1});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania3.majorityElement(new int[]{4, 3, 4, 3, 3});
    expected = 3;
    Assert.assertEquals(expected, actual);
  }

}
