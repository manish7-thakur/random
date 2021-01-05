import org.junit.Assert;
import org.junit.Test;

public class WallsAndGatesTest {
    @Test
    public void Test2DArray() {
        int[][] mat = new int[][]{{0, -2}, {0, 0}};
        WallsAndGates.calc(mat);
        int[][] expected = new int[][]{{1, -2}, {2, 1}};
        Assert.assertArrayEquals(expected, mat);
    }

    @Test
    public void Test2DArrayWithWalls() {
        int[][] mat = new int[][]{{0, -2}, {-1, 0}};
        WallsAndGates.calc(mat);
        int[][] expected = new int[][]{{1, -2}, {-1, 1}};
        Assert.assertArrayEquals(expected, mat);
    }

    @Test
    public void Test2DArrayWith3Col() {
        int[][] mat = new int[][]{{0, 0, -1, -2}, {-1, 0, 0, 0}};
        WallsAndGates.calc(mat);
        int[][] expected = new int[][]{{5, 4, -1, -2}, {-1, 3, 2, 1}};
        Assert.assertArrayEquals(expected, mat);
    }
}