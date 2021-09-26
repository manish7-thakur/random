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
    int max1 = Math.max(leftSubtreeSum, rigthSubtreeSum);
    int max2 = Math.max(max1 + root.val, root.val);
    int max4 = Math.max(max2, leftSubtreeSum + rigthSubtreeSum + root.val);
    result = Math.max(max4, result);
    return Math.max(root.val + Math.max(leftSubtreeSum, rigthSubtreeSum), Math.max(root.val, root.val + leftSubtreeSum + rigthSubtreeSum));
  }
}
