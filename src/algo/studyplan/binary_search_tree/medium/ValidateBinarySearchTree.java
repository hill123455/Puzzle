package studyplan.binary_search_tree.medium;

import studyplan.divide_conquer.TreeNode;

public class ValidateBinarySearchTree {

    // https://leetcode.com/problems/validate-binary-search-tree/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    Integer prev;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {return true;}

        if (!isValidBST(root.left)) {return false;}
        if (prev != null) {
            if (prev >= root.val) {return false;}
        }

        prev = root.val;
        return isValidBST(root.right);

    }

    public boolean isValidBST2(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer min, Integer max) {
        if(node == null) return true;

        if((min!= null && node.val < min) || (max!= null && node.val > max)) return false;

        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
