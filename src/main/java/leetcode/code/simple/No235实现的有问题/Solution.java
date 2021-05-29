package leetcode.code.simple.No235实现的有问题;

/**
 * @author zhaochao
 * @date 2021/5/27 20:10
 */
public class Solution {
    public static void main(String[] args) {
//        TreeNode root1 = new TreeNode(6);
//        TreeNode root2 = new TreeNode(2);
//        TreeNode root3 = new TreeNode(8);
//        TreeNode root4 = new TreeNode(0);
//        TreeNode root5 = new TreeNode(4);
//        TreeNode root6 = new TreeNode(7);
//        TreeNode root7 = new TreeNode(9);
//        TreeNode root8 = new TreeNode(3);
//        TreeNode root9 = new TreeNode(5);
//
//        root1.left = root2;
//        root1.right = root3;
//        root2.left = root4;
//        root2.right = root5;
//        root3.left = root6;
//        root3.right = root7;
//        root5.left = root8;
//        root5.right = root9;
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(1);
        root1.right = root2;

        Solution solution = new Solution();
        TreeNode data = solution.lowestCommonAncestor(root1, root1, root2);
        System.out.println("");
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p) {
            if (digui(root, q)) {
                return root;
            }
        }

        if (root == q) {
            if (digui(root, p)) {
                return root;
            }
        }

        //如果做分支下有p
        if (p == root.left) {
            if (digui(root.left, q)) {
                return root.left;
            }
            if (digui(root.right, q)) {
                return root;
            }
        }

        if (q == root.left) {
            if (digui(root.left, p)) {
                return root.left;
            }
            if (digui(root.right, p)) {
                return root;
            }
        }


        if (p == root.right) {
            if (digui(root.right, q)) {
                return root.right;
            }
            if (digui(root.left, q)) {
                return root;
            }
        }


        if (q == root.right) {
            if (digui(root.right, p)) {

                return root.right;
            }
            if (digui(root.left, p)) {
                return root;
            }
        }
        TreeNode ll = lowestCommonAncestor(root.left, p, q);
        TreeNode rr = lowestCommonAncestor(root.right, p, q);

        if (ll != null) {
            return ll;
        } else {
            return rr;
        }
    }

    private boolean digui(TreeNode root, TreeNode m) {
        if (root == null) {
            return false;
        }
        if (root == m) {
            return true;
        } else {
            return digui(root.left, m) || digui(root.right, m);
        }
    }


}
