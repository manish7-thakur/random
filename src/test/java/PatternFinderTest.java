import org.junit.*;

public class PatternFinderTest {
    @Test
    public void findPatternEmptyText() {
        int actual = PatternFinder.find("", "a");
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternSingleCharText() {
        int actual = PatternFinder.find("a", "a");
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternDoubleCharText() {
        int actual = PatternFinder.find("ab", "b");
        int expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("ab", "ab");
        expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternTripleCharText() {
        int actual = PatternFinder.find("abc", "c");
        int expected = 2;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("cab", "ab");
        expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("abc", "ab");
        expected = 0;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("abc", "ac");
        expected = -1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("aac", "ac");
        expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("aaa", "ac");
        expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternFourCharText() {
        int actual = PatternFinder.find("abcd", "d");
        int expected = 3;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("cdab", "ab");
        expected = 2;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("abdc", "acb");
        expected = -1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("adbc", "db");
        expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("adabc", "db");
        expected = -1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("dddbc", "db");
        expected = 2;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("dbdbc", "dbc");
        expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternFiveCharText() {
        int actual = PatternFinder.find("ababe", "abe");
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternMultiCharText() {
        int actual = PatternFinder.find("abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392j", "abd@htr(kyus%#392j");
        int expected = 340;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternWithGapEmptyText() {
        boolean actual = PatternFinder.findWithGap("", "*", -1, 0);
        Assert.assertTrue(actual);
        actual = PatternFinder.findWithGap("", "", -1, -1);
        Assert.assertTrue(actual);
    }

    @Test
    public void findPatternWithGapSingleCharText() {
        boolean actual = PatternFinder.findWithGap("a", "a", 0, 0);
        Assert.assertTrue(actual);
        actual = PatternFinder.findWithGap("a", "*", 0, 0);
        Assert.assertTrue(actual);
        actual = PatternFinder.findWithGap("a", "a*", 0, 1);
        Assert.assertTrue(actual);
        actual = PatternFinder.findWithGap("a", "*a", 0, 1);
        Assert.assertTrue(actual);
    }


}