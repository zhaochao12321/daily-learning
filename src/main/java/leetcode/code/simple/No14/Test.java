package leetcode.code.simple.No14;

/**
 * @author zhaochao
 * @date 2021/5/6 20:52
 */
public class Test {


    public String longestCommonPrefix(String[] strs) {
        int maxLong = getMaxLong(strs);
        int end = 0;
        for (int i = 0; i < maxLong; i++) {


        }
        return "";
    }

    private int getMaxLong(String[] strs) {
        int l = 0;
        for (String s : strs) {
            if (l < s.length()) {
                l = s.length();
            }

        }
        return l;
    }
}
