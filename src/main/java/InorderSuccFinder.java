public class InorderSuccFinder {
    public static int find(TreeNode root, int value) {
        TreeNode parent = new TreeNode(-1, null, null);
        return findNow(root, value, parent);
    }
    public static boolean  isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
    static boolean  validate(TreeNode root, Integer max, Integer min) {
        if(root == null) {
            return true;
        }
        if((max != null && root.val >= max ) || (min != null && root.val <= min)) {
            return false;
        }
        return validate(root.left, root.val, min) && validate(root.right, max, root.val);
    }

    public static int findNow(TreeNode root, int value, TreeNode parent) {
        if (root == null) {
            return -1;
        }
        if (value < root.val) {
            return findNow(root.left, value, root);
        } else if (value > root.val) {
            return findNow(root.right, value, parent);
        }
        if (root.right != null) {
            return findSucc(root.right);
        } else {
            return parent.val;
        }
    }

    public static int findSucc(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.val;
    }
}