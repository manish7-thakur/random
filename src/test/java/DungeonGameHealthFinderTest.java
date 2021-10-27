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

    actual = DungeonGameHealthFinder.calculateMinimumHP(new int[][]
    {{-78, -73, -1, -80, 62, -23, -35, 34, 76, -8, 82, -22, 1, 1, 19, -38, -54, -37},
     {2, 32, 78, -15, 26, -5, -36, -52, -94, 7, -46, 70, 65, -85, -36, 58, 82, -49},
     {69, 55, 68, -6, 13, 3, 65, 2, 88, -92, 25, 45, 86, -78, 74, -36, 12, 24},
     {6, 16, -18, -31, 90, -52, 39, -25, -10, -22, -41, 86, -35, -6, -97, -80, -5, 84},
     {-36, -39, 6, 14, -50, 11, -62, 74, 12, 36, 5, 15, 6, -53, -84, 56, 95, 65},
     {40, -95, 61, 4, -95, -51, -11, 23, -43, -51, 72, -83, -100, 83, -44, 13, -77, 84},
     {48, 95, -84, 68, 25, -19, -58, -92, 10, 5, -82, -10, 51, -46, -86, 49, -8, 2},
     {-42, -72, 84, 90, -11, -100, 83, -43, 13, 66, 81, -28, 71, -80, -70, 31, 9, 8},
     {55, -31, 66, -33, 97, 66, -14, 55, 94, 87, 83, -24, 85, 44, 72, -26, 95, 81},
     {65, 76, -28, -22, 72, 62, 63, 16, 59, 76, -48, 13, 38, -94, -52, 85, -92, -84},
     {42, 79, -86, 95, 4, -85, -80, -61, -16, 86, -35, 61, -70, -39, 62, 0, 33, 88},
     {10, -37, -5, -34, 93, -18, -75, 77, -17, 94, -62, -21, -56, -56, -49, -32, 3, -6},
     {49, 52, 20, 53, 52, -59, -97, -57, -6, -18, -33, 36, 92, 4, 7, -83, -65, 82},
     {0, 33, -50, -68, 56, -57, -65, -8, 91, 70, -3, 48, 33, 36, 82, 36, -84, -94},
     {79, 77, -60, 40, 1, -3, -80, 69, 33, 17, 19, -25, 81, 16, 17, 65, -66, -99}});
    expected = 79;
    Assert.assertEquals(expected, actual);
  }
}
