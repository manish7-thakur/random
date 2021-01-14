import org.junit.Assert;
import org.junit.Test;

public class NoOfIslandsTest {
    @Test
    public void oneCrossOneGrid() {
        int[][] grid = new int[][]{{1}};
        int actual = NoOfIslands.noOfIslands(grid);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoCrossTwoGrid() {
        int[][] grid = new int[][]{
                {1, 0},
                {0, 1}};
        int actual = NoOfIslands.noOfIslands(grid);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoCrossThreeGrid() {
        int[][] grid = new int[][]{
                {1, 0, 0},
                {0, 0, 1}};
        int actual = NoOfIslands.noOfIslands(grid);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoCrossFourGrid() {
        int[][] grid = new int[][]{
                {1, 0, 0, 1},
                {1, 1, 0, 1}};
        int actual = NoOfIslands.noOfIslands(grid);
        int expected = 2;
        Assert.assertEquals(expected, actual);
        grid = new int[][]{
                {1, 1, 1, 1},
                {1, 1, 0, 1}};
        actual = NoOfIslands.noOfIslands(grid);
        expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void threeCrossTwoGrid() {
        int[][] grid = new int[][]{
                {1, 0},
                {0, 0},
                {1, 1}};
        int actual = NoOfIslands.noOfIslands(grid);
        int expected = 2;
        Assert.assertEquals(expected, actual);
        grid = new int[][]{
                {1, 1},
                {1, 1},
                {1, 1}};
        actual = NoOfIslands.noOfIslands(grid);
        expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourCrossFourGrid() {
        int[][] grid = new int[][]{
                {1, 0, 0, 1},
                {0, 0, 1, 1},
                {1, 0, 0, 0},
                {0, 0, 1, 1}};
        int actual = NoOfIslands.noOfIslands(grid);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fiveCrossFiveGrid() {
        int[][] grid = new int[][]{
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
        int actual = NoOfIslands.noOfIslands(grid);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }
}