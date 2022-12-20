import java.util.*;

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

  static List<String> binaryTreePaths(TreeNode root) {
    List<String> res = new ArrayList<>();
    binaryTreePathsRec(root, "", res);
    return res;
  }

  static void binaryTreePathsRec(TreeNode root, String currPath, List<String> res) {
    if(root == null) return;
    if(root.left == null && root.right == null) {
      res.add(currPath + root.val);
      return;
    }
    binaryTreePathsRec(root.left, currPath + root.val + "->", res);
    binaryTreePathsRec(root.right, currPath + root.val + "->", res);
  }
}
