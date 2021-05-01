import java.util.ArrayList;

public class LowestCommonAncesterFinder {
    static int forBST(TreeNode curr, int a, int b) {
        ArrayList<Integer> ancestersA = new ArrayList<>();
        if (findAncestors(curr, ancestersA, a)) return -1;
        ArrayList<Integer> ancestersB = new ArrayList<>();
        if (findAncestors(curr, ancestersB, b)) return -1;
        return findCommonAncestor(ancestersA, ancestersB);
    }

    private static int findCommonAncestor(ArrayList<Integer> ancestersA, ArrayList<Integer> ancestersB) {
        int i;
        for (i = 0; i < ancestersA.size() && i < ancestersB.size(); i++) {
            if (ancestersA.get(i) != ancestersB.get(i)) {
                return ancestersA.get(i - 1);
            }
        }
        return ancestersA.get(i - 1);
    }

    private static boolean findAncestors(TreeNode traverser, ArrayList<Integer> ancesters, int value) {
        while (traverser != null && traverser.value != value) {
            ancesters.add(traverser.value);
            if (value < traverser.value) {
                traverser = traverser.left;
            } else {
                traverser = traverser.right;
            }
        }
        if (traverser == null) {
            return true;
        }
        ancesters.add(traverser.value);
        return false;
    }


    private static boolean findBTAncestors(TreeNode traverser, ArrayList<Integer> ancesters, int value) {
        if (traverser == null) {
            return false;
        }
        ancesters.add(traverser.value);
        if (traverser.value == value) {
            return true;
        }
        if (findBTAncestors(traverser.left, ancesters, value) || findBTAncestors(traverser.right, ancesters, value))
            return true;
        ancesters.remove(ancesters.size() - 1);
        return false;
    }

    static int forBinaryTree(TreeNode curr, int a, int b) {
        ArrayList<Integer> ancestersA = new ArrayList<>();
        if (!findBTAncestors(curr, ancestersA, a)) return -1;
        ArrayList<Integer> ancestersB = new ArrayList<>();
        if (!findBTAncestors(curr, ancestersB, b)) return -1;
        return findCommonAncestor(ancestersA, ancestersB);
    }
}