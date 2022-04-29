import org.junit.*;

public class GreedyTest {
  @Test
  public void atmostWorkTimeOfAnyGivenWorker() {
    int actual = Greedy.maxWorkTime(new int[]{3}, 1);
    int expected = 3;
    Assert.assertEquals(expected, actual);

    actual = Greedy.maxWorkTime(new int[]{2, 3}, 1);
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = Greedy.maxWorkTime(new int[]{2, 3}, 2);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = Greedy.maxWorkTime(new int[]{2, 1, 3}, 2);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = Greedy.maxWorkTime(new int[]{2, 1, 3, 4, 7}, 2);
    expected = 9;
    Assert.assertEquals(expected, actual);

    actual = Greedy.maxWorkTime(new int[]{2, 1, 8, 4, 7}, 2);
    expected = 11;
    Assert.assertEquals(expected, actual);
  }
}