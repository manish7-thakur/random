import java.util.*;
import static java.util.stream.Collectors.*;
import java.util.concurrent.atomic.*;
import java.util.stream.IntStream;

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

    static List<Integer> minHeightTrees(int n, int[][] edges) {
      Map<Integer, List<Integer>> map = new HashMap<>();
      if(n < 2) return List.of(0);
      for(int[] arr: edges) {
        map.computeIfAbsent(arr[0], k -> new ArrayList<>()).add(arr[1]);
        map.computeIfAbsent(arr[1], k -> new ArrayList<>()).add(arr[0]);
      }
      List<Integer> leaves = new ArrayList<>();
      map.forEach((k, v) -> {
        if(v.size() == 1) leaves.add(k);
      });
      int remainingNodes = n;
      while(remainingNodes > 2) {
        remainingNodes -= leaves.size();
        List<Integer> newLeaves = new ArrayList<>();
        leaves.forEach(leaf -> {
          int neighbour = map.get(leaf).get(0);
          map.get(neighbour).remove(leaf);
          if(map.get(neighbour).size() == 1) newLeaves.add(neighbour);
        });
        leaves.clear();
        leaves.addAll(newLeaves);
      }
      return leaves;
    }

    static int maxHeight(int n, Map<Integer, List<Integer>> map, Set<Integer> visited) {
      if(visited.contains(n)) return 0;
      visited.add(n);
      int max = map.get(n).stream().mapToInt(v -> 1 + maxHeight(v, map, visited)).max().orElse(Integer.MAX_VALUE);
      return max;
    }
}
