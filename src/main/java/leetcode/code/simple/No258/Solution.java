package leetcode.code.simple.No258;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochao
 * @date 2021/5/29 15:05
 */
public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();
        int data = solution.addDigits(38);
        System.out.println();
    }


    /**
     * 牛逼方法
     *
     * @param num
     * @return
     */
//    class Solution {
//        public int addDigits(int num) {
//            return (num - 1) % 9 + 1;
//        }
//    }
    public int addDigits(int num) {

        List<Integer> list = new ArrayList<>();
        return middle(num, list);
    }


    private int middle(int i, List<Integer> ii) {
        if (i < 10) {
            return i;
        }

        while (i > 0) {
            ii.add(i % 10);
            i = i / 10;
        }

        int sum = 0;
        for (int m : ii) {
            sum = sum + m;
        }
        List<Integer> list = new ArrayList<>();
        return middle(sum, list);
    }
}
