package leetcode.code.simple.No111_没思路;

/**
 * @author zhaochao
 * @date 2021/5/15 15:12
 */
public class TreeNode {

    int val;
    leetcode.code.simple.No104.TreeNode left;
    leetcode.code.simple.No104.TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, leetcode.code.simple.No104.TreeNode left, leetcode.code.simple.No104.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
