package leetcode.code.simple.No9;

/**
 * @author zhaochao
 * @date 2021/4/30 18:22
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        boolean data = test.isPalindrome(454454);
        System.out.println();
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        char[] chars = String.valueOf(x).toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start <= end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
