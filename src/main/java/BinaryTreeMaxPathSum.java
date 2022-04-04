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
    int rightSubtreeSum = maxPathSumRec(root.right);
    int max = Math.max(leftSubtreeSum, rightSubtreeSum);
    int curr = Math.max(max + root.val, root.val);
    max = Math.max(curr, leftSubtreeSum + rightSubtreeSum + root.val);
    result = Math.max(max, result);
    return curr;
  }
}
