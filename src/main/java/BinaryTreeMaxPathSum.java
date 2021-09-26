public class BinaryTreeMaxPathSum {
  static int result = Integer.MIN_VALUE;
  static public int maxPathSum(TreeNode root) {
    result = Integer.MIN_VALUE;
    maxPathSumRec(root);
    return result;
  }
  static public int maxPathSumRec(TreeNode root) {
    if(root == null) {
      return 0;
    }
    int leftSubtreeSum = maxPathSumRec(root.left);
    int rigthSubtreeSum = maxPathSumRec(root.right);
    int max = Math.max(leftSubtreeSum, rigthSubtreeSum);
    max = Math.max(max + root.val, root.val);
    max = Math.max(max, leftSubtreeSum + rigthSubtreeSum + root.val);
    result = Math.max(max, result);
    return Math.max(root.val + Math.max(leftSubtreeSum, rigthSubtreeSum), Math.max(root.val, root.val + leftSubtreeSum + rigthSubtreeSum));
  }
}
