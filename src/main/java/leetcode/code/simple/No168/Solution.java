package leetcode.code.simple.No168;

/**
 * @author zhaochao
 * @date 2021/5/22 17:27
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String data = solution.convertToTitle(701);
        System.out.println();

    }

    public String convertToTitle(int columnNumber) {

        String data = convert(columnNumber, "");
        return convert(columnNumber, "");


    }

    private String convert(int columnNumber, String st) {

        if (columnNumber < 27) {
            char data = (char) (64 + columnNumber);
            return String.valueOf(data) + st;
        } else {
            int gaowei = columnNumber / 26;
            int diewei = columnNumber % 26;
            if (diewei == 0) {
                diewei = 26;
                gaowei--;
            }
            st = (char) (64 + diewei) + st;
            return convert(gaowei, st);

        }
    }

}
