package leetcode.code.simple.No28;

/**
 * @author zhaochao
 * @date 2021/5/11 20:14
 */
public class Test {


    public static void main(String[] args) {
        Test test = new Test();
        String s1 = "aabbcc";
        String s2 = "bbb";
        int start = test.strStr(s1, s2);
        System.out.println("");

    }

    public int strStr(String haystack, String needle) {
        if ("".equals(haystack) && "".equals(needle)) {
            return 0;
        }
        char[] haystackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();

        int haystackCharLength = haystackChar.length;
        int needleCharLength = needleChar.length;

        int start = -1;
        for (int i = 0; i < haystackCharLength; i++) {
            int offset = 0;
            for (int j = 0; j < needleCharLength; j++) {
                if (i + offset < haystackCharLength && needleChar[j] == haystackChar[i + offset]) {
                    offset++;

                } else {
                    break;
                }
            }
            if (offset == needleCharLength) {
                start = i;
                break;
            }
        }
        return start;
    }
}
