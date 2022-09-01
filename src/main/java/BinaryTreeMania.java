import java.util.*;
import static java.util.stream.Collectors.*;
import java.util.concurrent.atomic.*;
import java.util.stream.IntStream;

public class BinaryTreeMania {
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
      Map<Integer, Set<Integer>> map = new HashMap<>();
      if(n < 2) return List.of(0);
      for(int[] arr: edges) {
        map.computeIfAbsent(arr[0], k -> new HashSet<>()).add(arr[1]);
        map.computeIfAbsent(arr[1], k -> new HashSet<>()).add(arr[0]);
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
          int neighbour = map.get(leaf).iterator().next();
          map.get(neighbour).remove(leaf);
          if(map.get(neighbour).size() == 1) newLeaves.add(neighbour);
        });
        leaves.clear();
        leaves.addAll(newLeaves);
      }
      return leaves;
    }
    static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
      if(root1 == null) return root2;
      if(root2 == null) return root1;
      root1.val += root2.val;
      root1.left = mergeTrees(root1.left, root2.left);
      root1.right = mergeTrees(root1.right, root2.right);
      return root1;
    }
    static int diameterOfBinaryTree(TreeNode root) {
      AtomicInteger res = new AtomicInteger();
      diameterOfBinaryTreeRec(root, res);
      return res.intValue();
    }
    static int diameterOfBinaryTreeRec(TreeNode root, AtomicInteger res) {
      if(root == null) return 0;
      int left = diameterOfBinaryTreeRec(root.left, res);
      int right = diameterOfBinaryTreeRec(root.right, res);
      int curr = left + right;
      if(curr > res.get()) res.set(curr);
      return 1 + Math.max(left, right);
    }
    static int getMinimumDifference(TreeNode root) {
      AtomicInteger lastNum = new AtomicInteger(Integer.MAX_VALUE);
      AtomicInteger res = new AtomicInteger(Integer.MAX_VALUE);
      getMinDiffRec(root, lastNum, res);
      return res.get();
    }
    static void getMinDiffRec(TreeNode root, AtomicInteger lastNum, AtomicInteger res) {
      if(root == null) return;
      getMinDiffRec(root.left, lastNum, res);
      int diff = Math.abs(root.val - lastNum.get());
      lastNum.set(root.val);
      if(diff < res.intValue()) res.set(diff);
      getMinDiffRec(root.right, lastNum, res);
    }
    static TreeNode sortedArrayToBST(int[] nums) {
      return sortedArrayToBSTRec(nums, 0, nums.length - 1);
    }
    static TreeNode sortedArrayToBSTRec(int[] nums, int l, int h) {
      if(l > h) return null;
      int m = (l + h) / 2;
      TreeNode root = new TreeNode(nums[m]);
      root.right = sortedArrayToBSTRec(nums, m + 1, h);
      root.left = sortedArrayToBSTRec(nums, l, m - 1);
      return root;
    }
    static boolean isSameTree(TreeNode p, TreeNode q) {
      if(p == null && q == null) return true;
      if(p == null || q == null) return false;
      if(p.val != q.val) return false;
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    static int maxDepth(NaryNode root) {
      if(root == null) return 0;
      int max = 1;
      List<NaryNode> children = root.children == null ? List.of() : root.children;
      for(NaryNode node : children) {
        max = Math.max(max, 1 + maxDepth(node));
      }
      return max;
    }
    static boolean isSymmetric(TreeNode root) {
      return isSymmetricRec(root.left, root.right);
    }

    static boolean isSymmetricRec(TreeNode node1, TreeNode node2) {
      if(node1 == null && node2 == null) return true;
      if(node1 == null || node2 == null || node1.val != node2.val) return false;
      return isSymmetricRec(node1.left, node2.right) && isSymmetricRec(node1.right, node2.left);
    }

    static int distributeCoins(TreeNode root) {
      AtomicInteger res = new AtomicInteger();
      distributeCoinsRec(root, res);
      return res.get();
    }

    static int distributeCoinsRec(TreeNode root, AtomicInteger res) {
      if(root == null) return 0;
      int l = distributeCoinsRec(root.left, res);
      int r = distributeCoinsRec(root.right, res);
      res.getAndAdd(Math.abs(l) + Math.abs(r));
      int excessTotal = root.val + l + r - 1;
      return excessTotal;
    }
    static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> res = new ArrayList<>();
      LinkedList<TreeNode> queue = new LinkedList<>();
      if(root != null) queue.add(root);
      boolean left = true;
      while(!queue.isEmpty()) {
        int count = queue.size();
        List<Integer> items = new ArrayList<>();
        if(left) {
          while(count > 0) {
            TreeNode node = queue.remove();
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
            items.add(node.val);
            count--;
          }
        } else {
          while(count > 0) {
            TreeNode node = queue.removeLast();
            if(node.right != null) queue.addFirst(node.right);
            if(node.left != null) queue.addFirst(node.left);
            items.add(node.val);
            count--;
          }
        }
        left = !left;
        res.add(items);
      }
      return res;
    }
    static int maxLevelSum(TreeNode root) {
      int maxLevel = 0, maxSum = Integer.MIN_VALUE, level = 1;
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()) {
        int count = queue.size();
        int sum = 0;
        while(count > 0) {
          TreeNode node = queue.remove();
          sum += node.val;
          if(node.left != null) queue.add(node.left);
          if(node.right != null) queue.add(node.right);
          count--;
        }
        if(sum > maxSum) {
          maxLevel = level;
          maxSum = sum;
        }
        level++;
      }
      return maxLevel;
    }
}
