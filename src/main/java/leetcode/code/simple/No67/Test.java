package leetcode.code.simple.No67;

/**
 * @author zhaochao
 * @date 2021/5/14 11:55
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        String a = "101111";
        String b = "10";
        String data = test.addBinary(a, b);
        System.out.println(data);
    }

    public String addBinary(String a, String b) {
        // 二进制转十进制再转二进制可以搞，但是效率有很大损耗，直接干二进制相加
        //区两数的最大位数+1为结果数组的最大长度
        int no = a.length() > b.length() ? a.length() + 1 : b.length() + 1;
        char[] bb = b.toCharArray();
        char[] aa = a.toCharArray();

        //a的操作坐标
        int aIndex = a.length() - 1;
        //b的操作坐标
        int bIndex = b.length() - 1;
        //进位
        int jw = 0;

        int[] data = new int[no];

        while (aIndex > -1 && bIndex > -1) {
            //char 转int Character.getNumericValue()
            if (Character.getNumericValue(aa[aIndex]) + Character.getNumericValue(bb[bIndex]) + jw > 1) {

                data[no - 1] = (Character.getNumericValue(aa[aIndex]) + Character.getNumericValue(bb[bIndex]) + jw - 2);
                jw = 1;
            } else {
                data[no - 1] = Character.getNumericValue(aa[aIndex]) + Character.getNumericValue(bb[bIndex]) + jw;
                jw = 0;
            }
            //两个加数和一个和都往前移位
            no--;
            aIndex--;
            bIndex--;
        }

        //公共位相加后的善后
        //等位数相加
        if (aIndex == -1 && bIndex == -1) {
            if (jw == 1) {
                data[0] = 1;
            }
            //b长
        } else if (aIndex == -1) {
            while (bIndex > -1) {
                if (Character.getNumericValue(bb[bIndex]) == 1 && jw == 1) {
                    data[no - 1] = 0;
                    jw = 1;
                } else {
                    data[no - 1] = Character.getNumericValue(bb[bIndex]) + jw;
                    jw = 0;
                }
                bIndex--;
                no--;
            }
            //a长
        } else {
            while (aIndex > -1) {
                if (Character.getNumericValue(aa[aIndex]) == 1 && jw == 1) {
                    data[no - 1] = 0;
                    jw = 1;
                } else {
                    data[no - 1] = Character.getNumericValue(aa[aIndex]) + jw;
                    jw = 0;
                }
                aIndex--;
                no--;
            }
        }

        if (jw == 1) {
            data[0] = 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            //首位为0跳过
            if (i == 0 && data[i] == 0) {
                continue;
            }
            sb.append(data[i]);
        }
        return String.valueOf(sb);
    }
}
