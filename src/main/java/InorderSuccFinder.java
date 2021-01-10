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
        if((max != null && root.value >= max ) || (min != null && root.value <= min)) {
            return false;
        }
        return validate(root.left, root.value, min) && validate(root.right, max, root.value);
    }

    public static int findNow(TreeNode root, int value, TreeNode parent) {
        if (root == null) {
            return -1;
        }
        if (value < root.value) {
            return findNow(root.left, value, root);
        } else if (value > root.value) {
            return findNow(root.right, value, parent);
        }
        if (root.right != null) {
            return findSucc(root.right);
        } else {
            return parent.value;
        }
    }

    public static int findSucc(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.value;
    }
}