package leetcode.code.simple.No144;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochao
 * @date 2021/5/22 13:07
 * <p>
 * <p>
 * 进阶：递归算法很简单，你可以通过迭代算法完成吗？
 */
public class Test {
//    TreeNode

    public List<Integer> preorderTraversal(TreeNode root) {


        List<Integer> data = new ArrayList<>();

        if (root == null) {
            return data;
        }
        return digui(root, data);


    }

    private List<Integer> digui(TreeNode root, List<Integer> data) {
        data.add(root.val);

        if (root.left != null) {
            digui(root.left, data);
        }
        if (root.right != null) {
            digui(root.right, data);
        }
        return data;
    }

}
