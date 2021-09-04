import org.junit.Assert;
import org.junit.Test;

/**
 * cost reference T.H cormen chapter 15, Excercise: 15-5
 * consider input string in reverse order
 * copy(c) -> -1
 * replace(r) -> 1
 * insert(i) -> 2
 * delete(d) -> 2
 * twiddle(t) -> Inf
 * kill(k) -> Inf
 */

public class EditDistanceTest {
    @Test
    public void editDistanceWithDefinedOpsCost() {
        char[][] path = new char[0][1];
        int actual = EditDistance.findNow("", "n", -1, 0, path);
        int expected = 2;//insert
        Assert.assertEquals(expected, actual);

        path = new char[1][0];
        actual = EditDistance.findNow("a", "", 0, -1, path);
        expected = 2;//delete
        Assert.assertEquals(expected, actual);

        path = new char[1][1];
        actual = EditDistance.findNow("a", "a", 0, 0, path);
        expected = -1; //copy
        Assert.assertEquals(expected, actual);

        path = new char[1][1];
        actual = EditDistance.findNow("a", "b", 0, 0, path);
        expected = 1; //Min(replace, delete + insert)
        Assert.assertEquals(expected, actual);

        path = new char[2][2];
        actual = EditDistance.findNow("ab", "bc", 1, 1, path);
        expected = 2; //Min(replace + replace, insert + copy + delete)
        Assert.assertEquals(expected, actual);

        path = new char[2][2];
        actual = EditDistance.findNow("ab", "ba", 1, 1, path);
        expected = 2;
        Assert.assertEquals(expected, actual);

        path = new char[2][3];
        actual = EditDistance.findNow("ab", "bac", 1, 2, path);
        expected = 2;
        Assert.assertEquals(expected, actual);

        path = new char[3][3];
        actual = EditDistance.findNow("abc", "bac", 2, 2, path);
        expected = 1; //copy + twiddle
        Assert.assertEquals(expected, actual);

        path = new char[4][3];
        actual = EditDistance.findNow("abcd", "bac", 3, 2, path);
        expected = 3;
        Assert.assertEquals(expected, actual);

        path = new char[5][2];
        actual = EditDistance.findNow("cdeab", "ba", 4, 1, path);
        expected = 6;
        Assert.assertEquals(expected, actual);

        path = new char[5][5];
        actual = EditDistance.findNow("abcde", "bacef", 4, 4, path);
        expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void editDistanceWithDefinedOps() {
        String actual = EditDistance.find("", "n", -1, 0);
        String expected = "i";//insert
        Assert.assertEquals(expected, actual);

        actual = EditDistance.find("a", "", 0, -1);
        expected = "d";//delete
        Assert.assertEquals(expected, actual);

        actual = EditDistance.find("a", "a", 0, 0);
        expected = "c"; //copy
        Assert.assertEquals(expected, actual);

        actual = EditDistance.find("a", "b", 0, 0);
        expected = "r"; //Min(replace, delete + insert)
        Assert.assertEquals(expected, actual);

        actual = EditDistance.find("ab", "bc", 1, 1);
        expected = "rr"; //Min(replace + replace, insert + copy + delete)
        Assert.assertEquals(expected, actual);

        actual = EditDistance.find("ab", "bc", 1, 1);
        expected = "rr"; //Min(replace + replace, insert + copy + delete)
        Assert.assertEquals(expected, actual);

        actual = EditDistance.find("ab", "ba", 1, 1);
        expected = "rr";
        Assert.assertEquals(expected, actual);

        actual = EditDistance.find("ab", "bac", 1, 2);
        expected = "rci";
        Assert.assertEquals(expected, actual);

        actual = EditDistance.find("abc", "bac", 2, 2);
        expected = "crr"; //copy + twiddle
        Assert.assertEquals(expected, actual);

        actual = EditDistance.find("abc", "bac", 2, 2);
        expected = "crr"; //copy + twiddle
        Assert.assertEquals(expected, actual);

        actual = EditDistance.find("abcd", "bac", 3, 2);
        expected = "rrcd";
        Assert.assertEquals(expected, actual);

        actual = EditDistance.find("abcde", "bacef", 4, 4);
        expected = "rrcrr";
        Assert.assertEquals(expected, actual);

        actual = EditDistance.find("cdeab", "ba", 4, 1);
        expected = "dcrdd";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsInsert() {
        char[][] path = new char[][]{{'i'}};
        StringBuilder b = new StringBuilder();
        String actual = EditDistance.getOps(path, 0, 0, b);
        String expected = "id";
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void opsDoubleCopy() {
        char[][] path = new char[][]{
                {'c', 'd'},
                {'k', 'c'}};
        StringBuilder b = new StringBuilder();
        String actual = EditDistance.getOps(path, 1, 1, b);
        String expected = "cc";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsDeleteCopy() {
        char[][] path = new char[][]{
                {'r', 'c'},
                {'k', 'd'}};
        StringBuilder b = new StringBuilder();
        String actual = EditDistance.getOps(path, 1, 1, b);
        String expected = "dci";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsReplaceCopy() {
        char[][] path = new char[][]{
                {'c', 'c'},
                {'k', 'r'}};
        StringBuilder b = new StringBuilder();
        String actual = EditDistance.getOps(path, 1, 1, b);
        String expected = "rc";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsTwiddleCopy() {
        char[][] path = new char[][]{
                {'c', 'c', 'd'},
                {'k', 'r', 'i'},
                {'k', 'i', 't'}};
        StringBuilder b = new StringBuilder();
        String actual = EditDistance.getOps(path, 2, 2, b);
        String expected = "tc";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsDoubleInsertKill() {
        char[][] path = new char[][]{
                {'c', 'c'},
                {'i', 'i'}};
        StringBuilder b = new StringBuilder();
        String actual = EditDistance.getOps(path, 1, 1, b);
        String expected = "iidd";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void calcEditDistance() {
      int actual = EditDistance.minDistance("", "a");
      int expected = 1;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("", "a");
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("a", "");
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("a", "a");
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("a", "b");
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("a", "bb");
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("ab", "bb");
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("cab", "cbb");
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("cab", "cbb");
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("ccagb", "ccabb");
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("horse", "ros");
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("intention", "execution");
      expected = 5;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("intention", "intention");
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = EditDistance.minDistance("dinitrophenylhydrazine", "benzalphenylhydrazone");
      expected = 7;
      Assert.assertEquals(expected, actual);
    }
}
