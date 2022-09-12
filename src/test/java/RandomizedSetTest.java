import org.junit.*;

public class RandomizedSetTest {
  @Test
  public void radomizedSetWithConstantTimeOps() {
    RandomizedSet set = new RandomizedSet();
    boolean actual = set.insert(6);
    Assert.assertTrue(actual);

    actual = set.remove(7);
    Assert.assertFalse(actual);
  }
}
