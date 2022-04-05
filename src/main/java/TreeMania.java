import java.util.*;
import java.util.stream.*;
public class TreeMania {
  public static int maxDepth(TreeNode root) {
    if(root == null) return 0;
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }

  public static boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val != q.val) return false;
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }
  public static boolean isSameTreeIter(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    Queue<TreeNode> pq = new LinkedList<>();
    Queue<TreeNode> qq = new LinkedList<>();
    pq.add(p);
    qq.add(q);
    return isQueueElemSame(pq, qq);
  }
  static boolean comparable(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val != q.val) return false;
    return true;
  }
  static boolean isQueueElemSame(Queue<TreeNode> pq, Queue<TreeNode> qq) {
    while(!pq.isEmpty() && !qq.isEmpty()) {
      TreeNode p = pq.remove();
      TreeNode q = qq.remove();
      if(p.val != q.val) return false;
      if(!comparable(p.left, q.left)) return false;
      if(!comparable(p.right, q.right)) return false;
      if(p.left != null && q.left != null) {
        pq.add(p.left);
        qq.add(q.left);
      }
      if(p.right != null && q.right != null) {
        pq.add(p.right);
        qq.add(q.right);
      }
    }
    return true;
  }
  static TreeNode invertTree(TreeNode root) {
    if(root == null) return root;
    TreeNode temp = invertTree(root.right);
    root.right = invertTree(root.left);
    root.left = temp;
    return root;
  }
  static List<List<Integer>> levelOrder(TreeNode root) {
    if(root == null) return List.of();
    var res = new ArrayList<List<Integer>>();
    var q = new LinkedList<TreeNode>();
    q.add(root);
    while(!q.isEmpty()) {
      var list = new ArrayList<Integer>();
      int size = q.size();
      for(int i = 0; i < size; i++) {
        TreeNode node = q.remove();
        if(node.left != null) q.add(node.left);
        if(node.right != null) q.add(node.right);
        list.add(node.val);
      }
      res.add(list);
    }
    return res;
  }
  static boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if(root == null && subRoot == null) return true;
    if(root == null || subRoot == null) return false;
    if(isSubtreeCheck(root, subRoot)) return true;
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }
  static boolean isSubtreeCheck(TreeNode root, TreeNode subRoot) {
    if(root == null && subRoot == null) return true;
    if(root == null || subRoot == null) return false;
    if(root.val != subRoot.val) return false;
    return isSubtreeCheck(root.left, subRoot.left) && isSubtreeCheck(root.right, subRoot.right);
  }
  static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    var pathP = new ArrayList<TreeNode>();
    pathToNode(root, p, pathP);
    var pathQ = new ArrayList<TreeNode>();
    pathToNode(root, q, pathQ);
    int i;
    for(i = 0; i < pathP.size() && i < pathQ.size(); i++) {
      if(pathP.get(i) != pathQ.get(i)) return pathP.get(i - 1);
    }
    return pathP.get(i - 1);
  }
  static boolean pathToNode(TreeNode root, TreeNode node, List<TreeNode> path) {
    if(root == null) return false;
    path.add(root);
    if(root.val == node.val) return true;
    boolean present = pathToNode(root.left, node, path);
    if(present) return true;
    present = pathToNode(root.right, node, path);
    if(present) return true;
    path.remove(path.size() - 1);
    return present;
  }
}
