package leetcode.code.simple.No69需要优化;

/**
 * @author zhaochao
 * @date 2021/5/14 15:42
 */
public class Test {


    public static void main(String[] args) {
        Test test = new Test();
        int no = test.mySqrt(10);
        System.out.println("");

    }

    public int mySqrt(int x) {
        int data = 0;
        if (x == 0) {
            return 0;
        } else if (x >= 1 && x < 4) {
            return 1;
        } else if (4 <= x && x < 9) {
            return 2;
        } else {
            for (int n = 2; n <= x / 2; n++) {
                if (n * n == x) {
                    data = n;
                    break;
                } else if (n * n < x && (n + 1) * (n + 1) > x) {
                    data = n ;
                    break;
                }
            }
        }
        return data;
    }
}
