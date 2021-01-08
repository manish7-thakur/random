import java.util.ArrayList;

public class BinaryTreeTurner {
    public static TreeNode upsideDown(TreeNode root) {
        ArrayList<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        collectNodes(nodes);
        for (int i = nodes.size() - 1; i >= 0; i -= 2) {
            TreeNode node = nodes.get(i);
            if (i - 1 >= 0) {
                TreeNode left = nodes.get(i - 1);
                node.left = left;
                left.left = null;
                left.right = null;
            }
            if (i - 2 >= 0) {
                TreeNode right = nodes.get(i - 2);
                right.right = null;
                right.left = null;
                node.right = right;
            }

        }
        return nodes.get(nodes.size() - 1);
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