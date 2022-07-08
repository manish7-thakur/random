import java.util.*;

public class BSTIterator {
   private Stack<TreeNode> stack;
   public BSTIterator(TreeNode root) {
     stack = new Stack<>();
     initStack(root);
   }
   public boolean hasNext() {
     return !stack.isEmpty();
   }
   public int next() {
     TreeNode top = stack.pop();
     initStack(top.right);
     return top.val;
   }
   private void initStack(TreeNode node) {
     while(node != null) {
       stack.push(node);
       node = node.left;
     }
   }
}
