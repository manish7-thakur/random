import java.util.ArrayList;

public class BinaryTreeTurner {
    public static TreeNode upsideDown(TreeNode root) {
        ArrayList<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        collectNodes(nodes);
        int i = nodes.size() - 1;
        TreeNode newRoot = nodes.get(i);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.remove(i);
            if (!nodes.isEmpty()) {
                TreeNode left = nodes.remove(--i);
                left.left = null;
                left.right = null;
                node.left = left;
            }
            if (!nodes.isEmpty()) {
                TreeNode right = nodes.get(--i);
                right.right = null;
                right.left = null;
                node.right = right;
            }
        }
        return newRoot;
    }

    public static void collectNodes(ArrayList<TreeNode> nodes) {
        for (int i = 0; i < nodes.size(); i++) {
            TreeNode node = nodes.get(i);
            if (node.right != null) {
                nodes.add(node.right);
            }
            if (node.left != null) {
                nodes.add(node.left);
            }
        }
    }
}