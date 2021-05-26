package leetcode.code.simple.No226;

/**
 * @author zhaochao
 * @date 2021/5/26 20:54
 * <p>
 * 递归
 */
public class Solution {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }


}
