package leetcode.code.simple.No101有种假对称没排除;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochao
 * @date 2021/5/15 17:36
 */
public class Test {


    public static void main(String[] args) {
        Test test = new Test();


        TreeNode T1 = new TreeNode();
        TreeNode T2 = new TreeNode();
        TreeNode T3 = new TreeNode();
        TreeNode T4 = new TreeNode();
        TreeNode T5 = new TreeNode();
        TreeNode T6 = new TreeNode();
        TreeNode T7 = new TreeNode();

        /*    [1,2,2,2,null,2] */
        T1.val = 1;
        T2.val = 2;
        T3.val = 2;
        T4.val = 2;
        T5.val = 4;
        T6.val = 2;
//        T7.val = 3;

        T1.left = T2;
        T1.right = T3;

        T2.left = T4;
        T2.right = null;

        T3.left = T6;
//        T3.right = T7;


        boolean data = test.isSymmetric(T1);
        System.out.println("");

    }


    public boolean isSymmetric(TreeNode root) {

        if (root != null) {
            return duichen(root);
        }
        return true;
    }

    /**
     * 这种是每个节点下的分支都对称，和题意不相符
     *
     * @param root
     * @return
     */
//    private boolean duichen(TreeNode root) {
//
//        if (root.left != null && root.right != null) {
//            return duichen(root.left) && duichen(root.right) && root.left.val == root.right.val;
//
//        } else if (root.left == null && root.right == null) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }

    /**
     * 中心对称
     *
     * @param root
     * @return
     */
    private boolean duichen(TreeNode root) {
        List<Integer> data = zhongxu(root, new ArrayList<>());
        if (data.size() % 2 == 0) {
            return false;
        }

        return zhongxinduichen(data);

    }

    /**
     * List 是否中心对称
     *
     * @param data
     * @return
     */
    private boolean zhongxinduichen(List<Integer> data) {
        int indexMax = data.size() / 2;

        for (int i = 1; i + indexMax < data.size(); i++) {
            if (!data.get(indexMax - i).equals(data.get(i + indexMax))) {
                return false;
            }

        }

        return true;

    }

    /**
     * 中序排列
     *
     * @param root
     * @param data
     * @return
     */
    private List<Integer> zhongxu(TreeNode root, List<Integer> data) {
        if (root.left != null) {
            zhongxu(root.left, data);
        }
        else {
            data.add(-1);
        }

        data.add(root.val);


        if (root.right != null) {
            zhongxu(root.right, data);
        }
       else  {
            data.add(-1);
        }
        return data;
    }

}
