import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheckerTest {
    @Test
    public void testPalindrome() {
        CharNode head = new CharNode('a', new CharNode('a', null));
        boolean actual = PalindromeChecker.isPalindromeRec(head);
        Assert.assertTrue(actual);

        head = new CharNode('a', new CharNode('b', null));
        actual = PalindromeChecker.isPalindromeRec(head);
        Assert.assertFalse(actual);

        head = new CharNode('a', new CharNode('b', new CharNode('a', null)));
        actual = PalindromeChecker.isPalindrome(head);
        Assert.assertTrue(actual);

        head = new CharNode('a', new CharNode('b', new CharNode('b', new CharNode('a', null))));
        actual = PalindromeChecker.isPalindromeRec(head);
        Assert.assertTrue(actual);

        head = new CharNode('a', new CharNode('b', new CharNode('a', new CharNode('b', null))));
        actual = PalindromeChecker.isPalindromeRec(head);
        Assert.assertFalse(actual);

        head = new CharNode('a', new CharNode('b', new CharNode('c', new CharNode('b', new CharNode('a', null)))));
        actual = PalindromeChecker.isPalindromeRec(head);
        Assert.assertTrue(actual);
    }
}