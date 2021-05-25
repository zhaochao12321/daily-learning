package leetcode.code.simple.No190没思路;

/**
 * @author zhaochao
 * @date 2021/5/24 16:33
 */
public class Solution {

    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        char[] charData = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = charData.length - 1; i > -1; i--) {
            sb.append(charData[i]);
        }

        String ss = sb.toString();

        return 0;
//        return ss;
    }
}
