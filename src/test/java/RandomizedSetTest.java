import org.junit.*;

public class RandomizedSetTest {
  @Test
  public void radomizedSetWithConstantTimeOps() {
    RandomizedSet set = new RandomizedSet();
    boolean actual = set.insert(6);
    Assert.assertTrue(actual);

    actual = set.remove(7);
    Assert.assertFalse(actual);

    actual = set.remove(6);
    Assert.assertTrue(actual);

    set.insert(8);
    set.insert(9);
    Assert.assertNotNull(set.getRandom());

    set.remove(8);
    Assert.assertEquals(9, set.getRandom().intValue());
    set.remove(9);

    set.insert(0);
    set.insert(1);
    set.remove(0);
    set.insert(2);
    set.remove(1);
    Assert.assertEquals(2, set.getRandom().intValue());
  }
}
