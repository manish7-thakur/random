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
    public void findSeqDoubleCharString() {
        String s = "aa";
        String actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        String expected = "aa";
        Assert.assertEquals(expected, actual);
        s = "ab";
        actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        expected = "b";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tripleCharStringLast2CharPalindrome() {
        String s = "baa";
        int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        int expected = 2;
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
    public void findSeqTripleCharString() {
        String s = "baa";
        String actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        String expected = "aa";
        Assert.assertEquals(expected, actual);
        s = "aab";
        actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        expected = "aa";
        Assert.assertEquals(expected, actual);
        s = "aba";
        actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        expected = "aba";
        Assert.assertEquals(expected, actual);
        s = "abc";
        actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        expected = "c";
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
        s = "abac";
        actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
        expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findSeqFourCharString() {
        String s = "bcac";
        String actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        String expected = "cac";
        Assert.assertEquals(expected, actual);
        s = "abcd";
        actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        expected = "d";
        Assert.assertEquals(expected, actual);
        s = "abac";
        actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        expected = "aba";
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
    public void findSeqFiveCharString() {
        String s = "abcda";
        String actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        String expected = "ada";
        Assert.assertEquals(expected, actual);
        s = "abcba";
        actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        expected = "abcba";
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
    public void findSeqMultiCharString() {
        String s = "character";
        String actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
        String expected = "carac";
        Assert.assertEquals(expected, actual);

       s = "waeiborhphyoybeiwa";
       actual = LongestPalindromicSubsequence.findSeq(s, s.length() - 1);
       expected = "aibohphobia";
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