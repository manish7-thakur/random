import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class BinaryTreeLevelAvg {
    public static List<Integer> calcAvgs(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        Queue<List<TreeNode>> arrayQueue = new ArrayDeque<>();
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(node);
        arrayQueue.add(nodeList);
        calc(arrayQueue, list);
        return list;
    }

    private static void calc(Queue<List<TreeNode>> queue, List<Integer> list) {
        int sum = 0;
        List<TreeNode> nodeList;
        while (!queue.isEmpty()) {
            sum = 0;
            nodeList = queue.remove();
            List<TreeNode> newLevelNodeList = new ArrayList<>();
            for (TreeNode node : nodeList) {
                sum += node.value;
                if (node.left != null) {
                    newLevelNodeList.add(node.left);
                }
                if (node.right != null) {
                    newLevelNodeList.add(node.right);
                }
            }
            list.add(sum / nodeList.size());
            if (!newLevelNodeList.isEmpty()) {
                queue.add(newLevelNodeList);
            }
        }
    }
}