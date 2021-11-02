import java.util.*;

public class BinaryTreeInverter {
    public static void invert(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        invert(root.left);
        invert(root.right);
    }
    
    public static List<Integer> rightSideView(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      if(root == null) return res;
      LinkedList<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()) {
        int count = queue.size();
        while(count > 0) {
          TreeNode item = queue.poll();
          if(item.left != null) queue.add(item.left);
          if(item.right != null) queue.add(item.right);
          count--;
          if(count == 0) res.add(item.val);
        }
      }
      return res;
    }
}
