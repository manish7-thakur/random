public class BinaryTreeMania2 {
  static boolean hasPathSum(TreeNode root, int targetSum) {
    int currSum = 0;
    if(root == null) return false;
    return hasPathSumRec(root, currSum, targetSum);
  }
  static boolean hasPathSumRec(TreeNode root, int currSum, int targetSum) {
    if(root == null) return false;
    if(root.left == null && root.right == null && currSum + root.val == targetSum) return true;
    if(hasPathSumRec(root.left, currSum + root.val, targetSum)) return true;
    if(hasPathSumRec(root.right, currSum + root.val, targetSum)) return true;
    return false;
  }
}
