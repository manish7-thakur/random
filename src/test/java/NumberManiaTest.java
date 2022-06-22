import org.junit.*;

public class NumberManiaTest {
  @Test
  public void determineHappiness() {
    boolean actual = NumberMania.isHappy(1);
    Assert.assertTrue(actual);

    actual = NumberMania.isHappy(2);
    Assert.assertFalse(actual);

    actual = NumberMania.isHappy(7);
    Assert.assertTrue(actual);

    actual = NumberMania.isHappy(21);
    Assert.assertFalse(actual);

    actual = NumberMania.isHappy(10);
    Assert.assertTrue(actual);
  }
}
