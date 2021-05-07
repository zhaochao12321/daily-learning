package leetcode.code.simple.No14;

/**
 * @author zhaochao
 * @date 2021/5/6 20:52
 * 思路：变成二维数组搞一搞
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        String[] s = new String[4];
        s[0] = "ac";
        s[1] = "acsdsds";
        s[2] = "acs";
        s[3] = "acdfdsfd";
        String data = test.longestCommonPrefix(s);
        System.out.println("");
    }


    public String longestCommonPrefix(String[] str) {
        if (str.length == 1) {
            return str[0];
        }
        //最大字符串长度
        int maxLong = getMaxLong(str);
        int lowLong = getLowLong(str);
        int end = -1;
        boolean jump = false;
        char[][] chars = new char[str.length][maxLong];

        //放入二维数组
        for (int i = 0; i < str.length; i++) {
            chars[i] = str[i].toCharArray();
        }

        for (int m = 0; m < lowLong; m++) {
            if (jump) {
                break;
            }
            for (int n = 0; n < str.length - 1; n++) {
                if (chars[n][m] == chars[n + 1][m]) {
                    if (n + 1 == str.length - 1) {
                        end = m;
                    }
                } else {
                    jump = true;
                    break;
                }
            }
        }

        if (end == -1) {
            return "";
        }
        return str[0].substring(0, end + 1);
    }

    private int getLowLong(String[] str) {
        int l = 0;
        if (str.length >= 1) {
            l = str[0].length();
            for (String s : str) {
                if (l > s.length()) {
                    l = s.length();
                }

            }

        }
        return l;
    }

    /**
     * 最大字符串长度
     *
     * @param str
     * @return
     */
    private int getMaxLong(String[] str) {
        int l = 0;
        for (String s : str) {
            if (l < s.length()) {
                l = s.length();
            }
        }
        return l;
    }
}
