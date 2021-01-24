import org.junit.Assert;
import org.junit.Test;

/**
 * cost
 * copy(c) -> -1
 * replace(r) -> 1
 * insert(i) -> 2
 * delete(d) -> 2
 * twiddle(t) -> Inf
 * kill(k) -> Inf
 */

public class EditDistanceTest {
    @Test
    public void singleCharStringEmptySource() {
        char[][] path = new char[0][1];
        int actual = EditDistance.findNow("", "n", -1, 0, path);
        int expected = 2;//insert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsSingleCharStringEmptySource() {
        String actual = EditDistance.find("", "n", -1, 0);
        String expected = "i";//insert
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void singleCharStringTargetEmpty() {
        char[][] path = new char[1][0];
        int actual = EditDistance.findNow("a", "", 0, -1, path);
        int expected = 2;//delete
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsSingleCharStringTargetEmpty() {
        String actual = EditDistance.find("a", "", 0, -1);
        String expected = "d";//delete
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singleCharIdenticalString() {
        char[][] path = new char[1][1];
        int actual = EditDistance.findNow("a", "a", 0, 0, path);
        int expected = -1; //copy
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsSingleCharIdenticalString() {
        String actual = EditDistance.find("a", "a", 0, 0);
        String expected = "c"; //copy
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singleCharNonIdenticalString() {
        char[][] path = new char[1][1];
        int actual = EditDistance.findNow("a", "b", 0, 0, path);
        int expected = 1; //Min(replace, delete + insert)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsSingleCharNonIdenticalString() {
        String actual = EditDistance.find("a", "b", 0, 0);
        String expected = "r"; //Min(replace, delete + insert)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doubleCharNonIdenticalString() {
        char[][] path = new char[2][2];
        int actual = EditDistance.findNow("ab", "bc", 1, 1, path);
        int expected = 2; //Min(replace + replace, insert + copy + delete)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsDoubleCharNonIdenticalString() {
        String actual = EditDistance.find("ab", "bc", 1, 1);
        String expected = "rr"; //Min(replace + replace, insert + copy + delete)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doubleCharReversedString() {
        char[][] path = new char[2][2];
        int actual = EditDistance.findNow("ab", "ba", 1, 1, path);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsDoubleCharReversedString() {
        String actual = EditDistance.find("ab", "ba", 1, 1);
        String expected = "rr";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doubleCharSTripleCharT() {
        char[][] path = new char[2][3];
        int actual = EditDistance.findNow("ab", "bac", 1, 2, path);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsDoubleCharSTripleCharT() {
        String actual = EditDistance.find("ab", "bac", 1, 2);
        String expected = "rci";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tripleCharSTripleCharT() {
        char[][] path = new char[3][3];
        int actual = EditDistance.findNow("abc", "bac", 2, 2, path);
        int expected = 1; //copy + twiddle
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsTripleCharSTripleCharT() {
        String actual = EditDistance.find("abc", "bac", 2, 2);
        String expected = "crr"; //copy + twiddle
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourCharSTripleCharT() {
        char[][] path = new char[4][3];
        int actual = EditDistance.findNow("abcd", "bac", 3, 2, path);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsFourCharSTripleCharT() {
        String actual = EditDistance.find("abcd", "bac", 3, 2);
        String expected = "rrcd";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fiveCharSFiveCharT() {
        char[][] path = new char[5][5];
        int actual = EditDistance.findNow("abcde", "bacef", 4, 4, path);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsFiveCharSFiveCharT() {
        String actual = EditDistance.find("abcde", "bacef", 4, 4);
        String expected = "rrcrr";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fiveCharSTwoCharT() {
        char[][] path = new char[5][2];
        int actual = EditDistance.findNow("cdeab", "ba", 4, 1, path);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsFiveCharSTwoCharT() {
        String actual = EditDistance.find("cdeab", "ba", 4, 1);
        String expected = "icdddd"; // insert a, copy b and delete a,e,d,c
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
}