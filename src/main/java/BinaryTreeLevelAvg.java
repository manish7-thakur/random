import java.util.*;

class BinaryTreeLevelAvg {
    public static List<Integer> calcAvgs(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        calc(queue, list);
        return list;
    }

    private static void calc(LinkedList<TreeNode> queue, List<Integer> list) {
        int sum = 0;
        int count = 0;
        while (!queue.isEmpty()) {
            sum = 0;
            count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                sum += node.value;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(sum / count);
        }
    }
}