import java.util.*;

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
}
