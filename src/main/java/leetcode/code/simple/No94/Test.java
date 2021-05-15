package leetcode.code.simple.No94;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochao
 * @date 2021/5/15 15:09
 */
public class Test {

    public static void main(String[] args) {
        TreeNode T1 = new TreeNode();
        TreeNode T2 = new TreeNode();
        TreeNode T3 = new TreeNode();

        T1.left = null;
        T1.right = T2;
        T1.val = 1;

        T2.left = T3;
        T2.right = null;
        T2.val = 2;


        T3.right = null;
        T3.left = null;
        T3.val = 3;

        Test test = new Test();
        List<Integer> data = test.inorderTraversal(T1);
        System.out.println("");

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> data = new ArrayList<>();
        if (root == null) {
            return data;
        }

        digui(root, data);
        System.out.println("");

        return data;
    }

    private List<Integer> digui(TreeNode root, List<Integer> data) {
        if (root.left != null) {
            digui(root.left, data);
        }

        data.add(root.val);


        if (root.right != null) {
            digui(root.right, data);
        }
        return data;
    }
}
