package leetcode.code.simple.No66;

/**
 * @author zhaochao
 * @date 2021/5/14 10:51
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        int[] digits = {9, 9, 9, 9, 9};
        int[] data = test.plusOne(digits);
        System.out.println("");
    }

    public int[] plusOne(int[] digits) {
        int add = 1;
        int jw = 0;

        for (int i = digits.length - 1; i > -1; i--) {
            //最低位处理
            if (i == digits.length - 1) {
                if (digits[i] < 9) {
                    digits[i] = digits[i] + 1;
                    break;
                } else {
                    digits[i] = digits[i] + 1 - 10;
                    jw++;
                }
                //其他位处理
            } else {
                if (digits[i] + jw < 10) {
                    digits[i] = digits[i] + jw;
                    jw = 0;
                    break;
                } else {
                    digits[i] = digits[i] + jw - 10;
                    jw = 1;
                }
            }
            //最高位处理，第一位可能是最高位，其他位也可能是最高位，所有不互斥
            if (i == 0 && jw == 1) {
                return pingjie(digits);
            }

        }
        return digits;
    }

    private int[] pingjie(int[] digits) {
        int[] data = new int[digits.length + 1];

        data[0] = 1;

        for (int i = 0; i < digits.length; i++) {
            data[i + 1] = digits[i];
        }
        return data;
    }


}
