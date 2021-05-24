package leetcode.code.simple.No171;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author zhaochao
 * @date 2021/5/24 11:42
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int data = solution.titleToNumber("AA");
        System.out.println();

    }


    public int titleToNumber(String columnTitle) {

        char[] data = columnTitle.toCharArray();
        int sum = 0;
        for (int i = data.length - 1; i > -1; i--) {
            sum = sum + (int) Math.pow(26, data.length - 1 - i) * (data[i]-64);
        }
        return sum;
    }
}
