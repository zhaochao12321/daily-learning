package leetcode.code.simple.No121需要优化_已优化;

/**
 * @author zhaochao
 * @date 2021/5/21 16:11
 */
public class Test {

    /**
     * 这个算法不好，得优化,
     *
     * @param prices
     * @return
     */
//    public int maxProfit(int[] prices) {
//        if (prices.length < 2) {
//            return 0;
//        }
//        int max = 0;
//        for (int i = prices.length - 1; i > -1; i--) {
//            for (int j = i - 1; j > -1; j--) {
//                if (prices[i] - prices[j] > max) {
//                    max = prices[i] - prices[j];
//                }
//
//            }
//
//        }
//        if (max < 0) {
//            return 0;
//        } else {
//            return max;
//        }
//    }
    public int maxProfit(int[] prices) {
        int min = 0;
        int data = 0;

        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                min = prices[i];
            } else if (prices[i] < min) {
                min = prices[i];
            }

            if (prices[i] - min > data) {
                data = prices[i] - min;
            }
        }

        return data;
    }

}
