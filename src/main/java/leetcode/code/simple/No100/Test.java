package leetcode.code.simple.No100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochao
 * @date 2021/5/15 16:54
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();


        TreeNode T1 = new TreeNode();
        TreeNode T2 = new TreeNode();
        TreeNode T3 = new TreeNode();

        T1.left = null;
        T1.right = T3;
        T1.val = 1;

//        T2.left = T3;
//        T2.right = null;
//        T2.val = 2;


        T3.right = null;
        T3.left = null;
        T3.val = 1;


        TreeNode T4 = new TreeNode();
        TreeNode T5 = new TreeNode();

        T4.left = T5;
        T4.val = 1;

        T5.val = 1;

        test.isSameTree(T1, T4);
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if ((p == null || q == null)) {
            return false;
        }

        List<Integer> pListZhongxu = zhongxu(p, new ArrayList<>());
        List<Integer> qListZhongxu = zhongxu(q, new ArrayList<>());

        if (pListZhongxu.size() != qListZhongxu.size()) {
            return false;
        }
        for (int i = 0; i < pListZhongxu.size(); i++) {
            if (!pListZhongxu.get(i).equals(qListZhongxu.get(i))) {
                return false;
            }
        }


        //在空叉填数，一个遍历顺序就可以做筛选，如果单纯的中序/先序/后序输出,无法判定二叉树是否相等（叉上有重复数字）
//        List<Integer> pListXianxu = xianxu(p, new ArrayList<>());
//        List<Integer> qListXianxu = xianxu(q, new ArrayList<>());
//        if (pListXianxu.size() != qListXianxu.size()) {
//            return false;
//        }
//        for (int i = 0; i < pListXianxu.size(); i++) {
//            if (!pListXianxu.get(i).equals(qListXianxu.get(i))) {
//                return false;
//            }
//        }

        return true;

    }


    private List<Integer> zhongxu(TreeNode root, List<Integer> data) {
        if (root.left != null) {
            zhongxu(root.left, data);
        } else {
            data.add(-1);
        }

        data.add(root.val);


        if (root.right != null) {
            zhongxu(root.right, data);
        }
        {
            data.add(-1);
        }
        return data;
    }


    private List<Integer> xianxu(TreeNode root, List<Integer> data) {
        data.add(root.val);

        if (root.left != null) {
            zhongxu(root.left, data);
        }
        {
            data.add(-1);
        }


        if (root.right != null) {
            zhongxu(root.right, data);
        }
        {
            data.add(-1);
        }
        return data;
    }


}
