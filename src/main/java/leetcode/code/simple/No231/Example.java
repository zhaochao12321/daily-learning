package leetcode.code.simple.No231;

/**
 * @author zhaochao
 * @date 2021/5/26 21:36
 */
public class Example {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }

        while (n > 0) {
            if (n == 2) {
                return true;
            }
            if (n % 2 > 0) {
                return false;
            }
            n = n / 2;
        }

        if (n <= 0) {
            return false;
        }
        return true;
    }
}
