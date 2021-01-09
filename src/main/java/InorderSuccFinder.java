public class InorderSuccFinder {
    public static int find(TreeNode root, int value) {
        TreeNode parent = new TreeNode(-1, null, null);
        return findNow(root, value, parent);
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
        TreeNode succ = node;
        while (succ.left != null) {
            succ = succ.left;
        }
        return succ.value;
    }
}