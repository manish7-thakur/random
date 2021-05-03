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
}