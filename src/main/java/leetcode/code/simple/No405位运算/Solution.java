package leetcode.code.simple.No405位运算;

/**
 * @author zhaochao
 * @date 2021/6/5 16:04
 * <p>
 * 位运算
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String data = solution.toHex(-10);
        System.out.println();

    }


    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 8 && num != 0) {//int整数一共32位，4位为一个十六进制，因此int可以转为8位16进制，小于8则没有转完
            sb.append(chars[num & 0xf]);//0xf就是1111，每次num和1111作与运算，得到的结果就是num的最后四位的十进制表示，从
            //chars中查阅对应的十六进制
            num >>= 4;//右移四位，进行下一位十六进制的查找
        }
        return sb.reverse().toString();//sb的顺序和真正的十六进制的数顺序相反，所以要reverse
    }
}
//    public String toHex(int num) {
//        return Integer.toHexString(num).toString();
//
//        if (num == 0) {
//            return "0";
//        }
//
//        Map<Integer, String> map = new HashMap<>();
//        map.put(10, "a");
//        map.put(11, "b");
//        map.put(12, "c");
//        map.put(13, "d");
//        map.put(14, "e");
//        map.put(15, "f");
//        String sb = new String();
//
//        if (num < 0) {
//            double dd = Math.pow(16, 9) + num;
//            System.out.println(dd);
//            int i = 1;
//            while (i < 9) {
//                int di = (int) dd % 16;
//
//                if (di < 10) {
//                    sb = di + sb;
//                } else {
//                    sb = map.get(di) + sb;
//                }
//                dd = dd / 16;
//                i++;
//            }
//            return sb;
//
//
//        }
//
//
//        while (num > 0) {
//            int di = num % 16;
//
//            if (di < 10) {
//                sb = di + sb;
//            } else {
//                sb = map.get(di) + sb;
//            }
//            num = num / 16;
//        }
//        return sb;
//
//
//    }



