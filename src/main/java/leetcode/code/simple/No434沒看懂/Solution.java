package leetcode.code.simple.No434沒看懂;

/**
 * @author zhaochao
 * @date 2021/6/7 15:07
 * <p>
 * 破玩意儿直接用多个空格排除
 * "\s+" 是正则表达式，表示多个空格。
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int data = solution.countSegments(", , , ,        a, eaefa");
        int data = solution.countSegments("Hello, my name is John");
        System.out.println();

    }

    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }

}
