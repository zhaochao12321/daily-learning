package leetcode.code.simple.No70;

/**
 * @author zhaochao
 * @date 2021/5/15 10:02
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        int no = test.climbStairs(6);
        System.out.println("");
    }


    public int climbStairs(int n) {
        int[] me = new int[n];
        int aa = transform(n, me);
        return transform(n, me);

    }

    private int transform(int n, int[] me) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        if (me[n - 1] == 0) {
            me[n - 1] = transform(n - 1, me) + transform(n - 2, me);
        }
        return me[n - 1];
    }
}
