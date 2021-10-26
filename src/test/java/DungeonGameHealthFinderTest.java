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

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]{{1, -2, -3}});
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]{{1, -3}, {-3, 2}});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]{{-2, -3}, {-3, -2}});
    expected = 8;
    Assert.assertEquals(expected, actual);

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]{{-2, 3}, {-3, -2}});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]
    {{-2, 3, -1},
     {-3, -8, -3},
     {1, 2, -2}});
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]
    {{-2, -3, 3},
     {-5, -10, 1},
     {10, 30, -5}});
    expected = 7;
    Assert.assertEquals(expected, actual);
  }
}
