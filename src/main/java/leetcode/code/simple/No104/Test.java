package leetcode.code.simple.No104;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/17 19:58
 * 看这题第一反应就是递归
 */
public class Test {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {

        Map<TreeNode, Integer> map = new HashMap<>();

        return maxDepth(root, map);
    }

    int maxDepth(TreeNode root, Map<TreeNode, Integer> map) {

        int deepest = 0;

        if (root == null) {
            return deepest;
        }

        //避免重复计算
        if (map.containsKey(root)) {
            return map.get(root);
        }

        if (root.left != null && root.right != null) {
            deepest = maxDepth(root.left, map) > maxDepth(root.right, map) ? maxDepth(root.left, map) + 1 : maxDepth(root.right, map) + 1;
        } else if (root.left != null && root.right == null) {
            deepest = maxDepth(root.left, map) + 1;
        } else if (root.left == null && root.right != null) {
            deepest = maxDepth(root.right, map) + 1;
        } else {
            deepest = 1;
        }

        map.put(root, deepest);

        return deepest;
    }
}
