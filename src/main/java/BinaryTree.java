import java.util.*;

public class BinaryTree {
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
      Deque<TreeNode> queue = new LinkedList<>();
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

    static public TreeNode deserialize(String data) {
      int i = 0;
      int commaIdx = data.indexOf(",", i);
      commaIdx = commaIdx < 0 ? data.length(): commaIdx;
      TreeNode root = new TreeNode(Integer.parseInt(data.substring(i, commaIdx)));
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()) {
        TreeNode current = queue.remove();
        i = commaIdx + 1;
        if(i >= data.length()) break;
        commaIdx = data.indexOf(",", i);
        commaIdx = commaIdx < 0 ? data.length() : commaIdx;
        String num = data.substring(i, commaIdx);
        if(!num.equals("n")) {
          TreeNode leftChild = new TreeNode(Integer.parseInt(num));
          current.left = leftChild;
          queue.add(leftChild);
        }
        i = commaIdx + 1;
        if(i >= data.length()) break;
        commaIdx = data.indexOf(",", i);
        commaIdx = commaIdx < 0 ? data.length() : commaIdx;
        num = data.substring(i, commaIdx);
        if(!num.equals("n")) {
          TreeNode rightChild = new TreeNode(Integer.parseInt(num));
          current.right = rightChild;
          queue.add(rightChild);
        }
      }
      return root;
    }
}
