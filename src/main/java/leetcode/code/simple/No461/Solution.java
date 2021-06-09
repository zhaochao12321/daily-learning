package leetcode.code.simple.No461;

/**
 * @author zhaochao
 * @date 2021/6/7 20:59
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int data = solution.hammingDistance(3, 5);
        System.out.println();
    }

    public int hammingDistance(int x, int y) {
//        int reData = 0;
//        String xx = Integer.toBinaryString(x);
//        String yy = Integer.toBinaryString(y);
//        int xindex = xx.length() - 1;
//        int yindex = yy.length() - 1;
//        while (xindex > -1 && yindex > -1) {
//            int xxx = xx.charAt(xindex) + 0;
//            int yyy = yy.charAt(yindex) + 0;
//            System.out.println(xxx & yyy);
//            System.out.println(1 & 1);
//            reData = reData + xx.charAt(xindex) & yy.charAt(yindex);
//            xindex--;
//            yindex--;
//        }
//
//        return reData;
        System.out.println(x ^ y);

        return Integer.bitCount(x ^ y);
    }
}
