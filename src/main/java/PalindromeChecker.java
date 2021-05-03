import java.util.Stack;

public class PalindromeChecker {
    static boolean isPalindrome(CharNode head) {
        CharNode curr = head;
        Stack<Character> stack = new Stack<>();
        while (curr != null) {
            stack.push(curr.data);
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            if (curr.data != stack.pop()) {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }

    /**
     * Class to wrap a pointer, basically c language **CharNode syntax
     */
    static class P {
        CharNode next;
    }

    static boolean isPalindromeRec(CharNode node) {
        P head = new P();
        head.next = node;
        return isPalindrome(node, head);
    }

    private static boolean isPalindrome(CharNode head, P start) {
        if (head == null) {
            return true;
        }
        if (!isPalindrome(head.next, start)) {
            return false;
        }
        if (head.data != start.next.data) {
            return false;
        }
        start.next = start.next.next;
        return true;
    }
}