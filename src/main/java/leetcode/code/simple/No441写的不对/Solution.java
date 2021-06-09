package leetcode.code.simple.No441写的不对;

/**
 * @author zhaochao
 * @date 2021/6/7 17:19
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int data = solution.arrangeCoins(3);
        System.out.println();
    }

    public int arrangeCoins(int n) {
        if (n == 1 || n==2) {
            return 1;
        }
        if (n ==3) {
            return 2;
        }

        int reData = 0;
        for (int i = 1; i < n; i++) {

            if (qiannxianghe(i) > n) {
                reData = i - 1;
                break;
            }


        }
        return reData;
    }

    private int qiannxianghe(int n) {
        int a1 = 1;
        int an = n;
        int d = 1;

        int data = n * a1 + (n * (n - 1)) / 2;

        return data;


    }

    /**
     * 偶数项前项和
     *
     * @param n
     * @return
     */
    private int ou(int n) {

        return n * (1 + n) / 2;

    }

    /**
     * 奇数项前n项和
     *
     * @param n
     * @return
     */
    private int ji(int n) {
//        (a+nd)(n+1)
//        (a+nd)(n+1)
        return (1 + n) * (n + 1);
    }

}
