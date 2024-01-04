import java.util.ArrayList;

public class BinaryTreeTurner {
    public static TreeNode upsideDown(TreeNode root) {
        ArrayList<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        collectNodes(nodes);
        int i = nodes.size() - 1;
        while(i > 0) {
            TreeNode node = nodes.get(i);
            TreeNode left = nodes.get(--i);
            left.left = null;
            left.right = null;
            node.left = left;
            if (i > 0) {
                TreeNode right = nodes.get(--i);
                right.right = null;
                right.left = null;
                node.right = right;
            }
        }
        TreeNode newRoot = nodes.get(nodes.size() - 1);
        nodes.clear();
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