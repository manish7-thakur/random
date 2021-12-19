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

    static public String serialize(TreeNode root) {
      StringBuilder b = new StringBuilder();
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()) {
        TreeNode curr = queue.remove();
        if(curr != null) {
          b.append(curr.val);
          queue.add(curr.left);
          queue.add(curr.right);
        } else b.append("n");
        if(!queue.isEmpty()) b.append(",");
      }
      return b.toString();
    }

    static public TreeNode deserialize(String data) {
      if(data == null || data.isEmpty() || data.equals("n")) return null;
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

    static public TreeNode deserializeS(String data) {
      if(data == null || data.isEmpty() || data.equals("n")) return null;
      String[] nodes = data.split(",");
      int i = 0;
      Queue<TreeNode> queue = new LinkedList<>();
      TreeNode root = createNode(nodes[i]);
      queue.add(root);
      i++;
      while(i < nodes.length) {
        TreeNode current = queue.remove();
        current.left = createNode(nodes[i]);
        if(current.left != null) queue.add(current.left);
        if(++i >= nodes.length) break;
        current.right = createNode(nodes[i]);
        if(current.right != null) queue.add(current.right);
        i++;
      }
      return root;
    }

    static private TreeNode createNode(String s) {
      if(!s.equals("n")) return new TreeNode(Integer.parseInt(s));
      return null;
    }


    static public boolean isValidSerialization(String preorder) {
      if(preorder.equals("#")) return true;
      Stack<Boolean> stack = new Stack<>();
      String[] items = preorder.split(",");
      if(!items[0].equals("#")) {
        stack.push(false);
      }
      for(int i = 1; i < items.length; i++) {
        if(stack.isEmpty()) return false;
        if(!stack.peek()) {
          stack.pop();
          stack.push(true);
        }
        else stack.pop();
        if(!items[i].equals("#")) stack.push(false);
      }
      return stack.isEmpty();
    }

    static public boolean isValidSerialization(String preorder) {
      Stack<String> stack = new Stack<>();
      String[] items = preorder.split(",");
      stack.push(items[0]);
      for(int i = 1; i < items.length; i++) {
        if(items[i].equals("#")) {
          if(stack.isEmpty()) return false;
        } else stack.push(items[i]);
      }
      return stack.peek().equals("#");
    }
}
