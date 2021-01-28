import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubsequenceTest {
    @Test
    public void singleCharString() {
        String s = "a";
        int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

   @Test
    public void findSeqSingleCharString() {
        String s = "a";
        String actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        String expected = "a";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doubleCharStringPalindrome() {
        String s = "aa";
        int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        int expected = 2;
        Assert.assertEquals(expected, actual);
        s = "ab";
        actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doubleCharStringNonpalindrome() {
        String s = "ab";
        int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tripleCharStringLast2CharPalindrome() {
        String s = "baa";
        int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        int expected = 2;
        Assert.assertEquals(expected, actual);
        s = "abac";
        actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        expected = 3;
        Assert.assertEquals(expected, actual);
        s = "aab";
        actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        expected = 2;
        Assert.assertEquals(expected, actual);
        s = "aba";
        actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        expected = 3;
        Assert.assertEquals(expected, actual);
        s = "abc";
        actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourCharString() {
        String s = "bcac";
        int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        int expected = 3;
        Assert.assertEquals(expected, actual);
        s = "abcd";
        actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fiveCharString() {
        String s = "abcda";
        int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        int expected = 3;
        Assert.assertEquals(expected, actual);

        s = "abcba";
        actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiCharString() {
        String s = "character";
        int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        int expected = 5;
        Assert.assertEquals(expected, actual);
        s = "waeiborhpthyoybeiwa";
        actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        expected = 11; //aibohphobia
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void readSubsequenceOneCrossOne() {
        char[][] path = new char[][]{{'m'}};
        String actual = LongestPalindromicSubsequence.buildSubSequence(path, 0, 0, "a");
        String expected = "a";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void readSubsequenceTwoCrossTwo() {
        char[][] path = new char[][]{
            {'m', 'l'},
            {'m', 'l'}};
        String actual = LongestPalindromicSubsequence.buildSubSequence(path, 0, 1, "ba");
        String expected = "b";
        Assert.assertEquals(expected, actual);

        path = new char[][]{
            {'m', 'd'},
            {'m', 'm'}};
         actual = LongestPalindromicSubsequence.buildSubSequence(path, 0, 1, "ba");
         expected = "a";
        Assert.assertEquals(expected, actual);
    }
}