package leetcode.code.simple.No58;

/**
 * @author zhaochao
 * @date 2021/5/14 10:37
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        String s = "";
        int number = test.lengthOfLastWord(s);
        System.out.println(" ");
    }


    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0 || s.trim().length() == 0) {
            return 0;
        }
        String[] ss = s.split(" ");
        return ss[ss.length - 1].length();
    }


}
