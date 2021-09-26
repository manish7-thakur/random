public class BinaryTreeMaxPathSum {
  static public int maxPathSum(TreeNode root) {
    if(root == null) {
      return 0;
    }
    int leftSubtreeSum = maxPathSum(root.left);
    int rigthSubtreeSum = maxPathSum(root.right);
    int max = Math.max(leftSubtreeSum, rigthSubtreeSum);
    return Math.max(leftSubtreeSum + rigthSubtreeSum + root.val, max);
  }
}
