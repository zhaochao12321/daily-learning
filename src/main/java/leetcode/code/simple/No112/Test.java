package leetcode.code.simple.No112;

import java.util.Map;
import java.util.function.IntFunction;

/**
 * @author zhaochao
 * @date 2021/5/19 17:57
 */
public class Test {


    public boolean hasPathSum(TreeNode root, int targetSum) {

        boolean data = false;

        if (root == null) {
            return false;
        }

        targetSum = targetSum - root.val;
//        if (targetSum < 0) {
//            return false;
//        }

        if (root.left != null && root.right != null) {
            data = hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
        } else if (root.left != null && root.right == null) {
            data = hasPathSum(root.left, targetSum);
        } else if (root.right != null && root.left == null) {
            data = hasPathSum(root.right, targetSum);
        }

        if (root.left == null && root.right == null) {
            if (targetSum == 0) {
                data = true;
            } else {
                data = false;
            }
        }
        return data;
    }


}
