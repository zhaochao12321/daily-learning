package leetcode.code.simple.No263;

/**
 * @author zhaochao
 * @date 2021/5/29 15:26
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean n1 = solution.isUgly(6);
        boolean n2 = solution.isUgly(8);
        boolean n3 = solution.isUgly(14);
        System.out.println();
    }


    public boolean isUgly(int n) {

        if (n == 1) {
            return true;
        } else if (n == 0) {
            return false;
        }
        if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0) {
            return false;
        }

        boolean n1 = false;
        boolean n2 = false;
        boolean n3 = false;
        if (n % 2 == 0) {
            n1 = isUgly(n / 2);
        }

        if (n % 3 == 0) {
            n2 = isUgly(n / 3);
        }

        if (n % 5 == 0) {
            n3 = isUgly(n / 5);
        }

        return n1 || n2 || n3;
    }
}
