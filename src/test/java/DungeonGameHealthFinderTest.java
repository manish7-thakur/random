import org.junit.*;

public class DungeonGameHealthFinderTest {
  @Test
  public void findKnigthsMinimumHealth() {
    int actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]{{0}});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]{{1}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]{{-2}});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]{{1, 2}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]{{-1, 2}});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]{{-1, -2}});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]{{1, -2}});
    expected = 2;
    Assert.assertEquals(expected, actual);
  }
}
