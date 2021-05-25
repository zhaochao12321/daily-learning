package leetcode.code.simple.No191性能不好待优化;

/**
 * @author zhaochao
 * @date 2021/5/25 9:52
 */
public class Solution {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        char[] charData = s.toCharArray();
        int data = 0;

        for (int i = charData.length - 1; i > -1; i--) {
            if ('1' == charData[i]) {
                data++;
            }
        }
        return data;
    }
}
