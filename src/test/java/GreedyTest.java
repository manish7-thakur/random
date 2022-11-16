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
  @Test
  public void findLeastIntervalToCompleteTasks() {
    int actual = Greedy.leastInterval(new char[]{'a'}, 0);
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = Greedy.leastInterval(new char[]{'a', 'b', 'a'}, 2);
    expected = 4;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void findContentedChildren() {
    int actual = Greedy.findContentChildren(new int[]{1}, new int[]{});
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = Greedy.findContentChildren(new int[]{1}, new int[]{1});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = Greedy.findContentChildren(new int[]{3, 1}, new int[]{1, 3});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = Greedy.findContentChildren(new int[]{3, 1}, new int[]{1, 3, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = Greedy.findContentChildren(new int[]{3, 1, 2}, new int[]{2, 3, 1});
    expected = 3;
    Assert.assertEquals(expected, actual);
  }
}
