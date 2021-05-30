import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraverser {
    static List<Integer> traverse(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
                TreeNode curr = queue.poll();
                res.add(curr.value);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
        }
        return res;
    }
}