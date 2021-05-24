package leetcode.code.simple.No172超时_优化;

import java.math.BigDecimal;

/**
 * @author zhaochao
 * @date 2021/5/24 12:02
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int data = solution.trailingZeroes(7163);
        System.out.println("");
    }


    public int trailingZeroes(int n) {

        BigDecimal data = new BigDecimal(1);

        for (int i = 1; i < n + 1; i++) {
            data = data.multiply(new BigDecimal(i));

        }
        char[] stringBigDecimal = data.toString().toCharArray();
        int dataInt = 0;
        for (int i = stringBigDecimal.length - 1; i > -1; i--) {
            if (stringBigDecimal[i] == '0') {
                dataInt++;
            } else {
                break;
            }
        }
        return dataInt;
    }
}
