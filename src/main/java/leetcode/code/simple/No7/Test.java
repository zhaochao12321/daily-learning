package leetcode.code.simple.No7;

/**
 * @author zhaochao
 * @date 2021/4/28 21:49
 */
public class Test {


    public static void main(String[] args) {
        Test test = new Test();
        int m = test.reverse(-123);
        System.out.println(m);
    }


//    public int reverse(int x) {
//        if (-10 < x && x < 0) {
//            return -x;
//        } else if (0 <= x && x < 10) {
//            return x;
//        }
//        if (x < 0) {
//            x = -x;
//            return Integer.valueOf(this.transform(x)) * (-1);
//        }
//        return Integer.valueOf(this.transform(x));
//    }
//
//    private String transform(int x) {
//        String str = String.valueOf(x);
//        char[] ch = str.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for (int i = ch.length - 1; i >= 0; i--) {
//            sb.append(ch[i]);
//        }
//        if ((Long.valueOf(sb.toString()) > Math.pow(2, 31) - 1) || Long.valueOf(sb.toString()) < -Math.pow(2, 31)) {
//            return "0";
//        }
//        return sb.toString();
//    }


    public int reverse(int x) {
        //看正负
        boolean xx = x < 0 ? true : false;
        int max = 10;
        if (-max < x && x < max) {
            return x;

        }
//        if ("-2147483648".equals(String.valueOf(x))) {
//            return 0;
//        }
        //之前有无非零位
        boolean zero = false;
        //返回值的绝对值
        int data = 0;
//        int m = Math.abs(x);
//        while (Math.abs(x) >= max) {
        while (x != 0) {
            //之前有非零位
            if (zero) {
                //边界测试
                if (judge(data, x)) {
                    return 0;
                }
                data = 10 * data + Math.abs(x) % 10;
                x = x / 10;
            } else {
                if (Math.abs(x) % 10 == 0) {
                    x = x / 10;
                } else {
                    data = Math.abs(x) % 10;
                    x = x / 10;
                    zero = true;
                }
            }
        }

        if (xx) {
            return -data;
        }
        return data;
    }


    boolean judge(int data, int x) {

        if (data > (Math.pow(2, 31) - 1 - (Math.abs(x) % 10)) / 10 || data < ((-Math.pow(2, 31)) - (Math.abs(x) % 10)) / 10) {
            return true;
        }
        return false;
    }
}
