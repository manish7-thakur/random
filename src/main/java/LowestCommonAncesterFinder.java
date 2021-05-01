import java.util.ArrayList;

public class LowestCommonAncesterFinder {
    static int forBST(TreeNode curr, int a, int b) {
        ArrayList<Integer> ancestersA = new ArrayList<>();
        if (findAncestors(curr, ancestersA, a)) return -1;
        ArrayList<Integer> ancestersB = new ArrayList<>();
        if (findAncestors(curr, ancestersB, b)) return -1;
        int i = ancestersA.size() - 1;
        int j = ancestersB.size() - 1;
        while (i >= 0 && j >= 0 && ancestersA.get(i) != ancestersB.get(j)) {
            i--;
            j--;
        }
        if (i >= 0) {
            return ancestersA.get(i);
        } else {
            return ancestersB.get(j);
        }
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
        return false;
    }


    private static boolean findBTAncestors(TreeNode traverser, ArrayList<Integer> ancesters, int value) {
        if (traverser == null) {
            return false;
        }
        if (traverser.value == value) {
            return true;
        }
        ancesters.add(traverser.value);
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
        int i = ancestersA.size() - 1;
        int j = ancestersB.size() - 1;
        while (i >= 0 && j >= 0 && ancestersA.get(i) != ancestersB.get(j)) {
            i--;
            j--;
        }
        if (i >= 0) {
            return ancestersA.get(i);
        } else {
            return ancestersB.get(j);
        }
    }
}