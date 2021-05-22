package leetcode.code.simple.No145;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochao
 * @date 2021/5/22 13:53
 */
public class Test {


    public List<Integer> postorderTraversal(TreeNode root) {


        List<Integer> data = new ArrayList<>();

        if (root == null) {
            return data;
        }
        return digui(root, data);


    }


    private List<Integer> digui(TreeNode root, List<Integer> data) {


        if (root.left != null) {
            digui(root.left, data);
        }
        if (root.right != null) {
            digui(root.right, data);
        }

        data.add(root.val);
        return data;
    }



}
