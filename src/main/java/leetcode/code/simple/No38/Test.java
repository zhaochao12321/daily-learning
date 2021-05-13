package leetcode.code.simple.No38;

/**
 * @author zhaochao
 * @date 2021/5/13 16:05
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        String s = test.countAndSay(10);
        System.out.println("");
    }


    public String countAndSay(int n) {

        String s = "1";
        for (int i = 0; i < n - 1; i++) {
            s = count(s);
        }

        return s;
    }

    private String count(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int number = 0;
        for (int i = 0; i < c.length; i++) {

            if (i == 0 || c[i - 1] != c[i]) {
                number = 1;
            } else if (c[i - 1] == c[i]) {
                number++;
            }
            //插个数，插本数
            if (i == c.length - 1 || c[i + 1] != c[i]) {
                sb.append(number);
                sb.append(c[i]);
            }
        }


        return sb.toString();
    }
}
