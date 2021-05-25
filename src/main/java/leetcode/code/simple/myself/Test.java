package leetcode.code.simple.myself;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

/**
 * @author zhaochao
 * @date 2021/4/28 20:20
 */
public class Test {


    public static void main(String[] args) {

//        map 遍历
//             for (Map.Entry<Long, List<LeBeansRecordDetailPojo>> entry : map.entrySet()) {
//        }


        Test test = new Test();
        String data = test.getCharFromString("abcbccbFGSFHDGFJHFHKJFGJKGJKJKFGHJFFRb");
        System.out.println(data);
    }

    public String getCharFromString(String var) {

        char[] input = var.toCharArray();
        //每个字符出现次数
        Map<Character, Integer> No = new HashMap<>();
        //每个字数下的字符数
        Map<Integer, List<Character>> charOnNo = new LinkedHashMap<>();
        //出现的最大数
        int max = 0;

        for (char in : input) {
            //如果该字符没出现过
            if (!No.containsKey(in)) {
                //无别的字符出现过一次
                if (charOnNo.get(1) == null) {
                    List<Character> aa = new ArrayList<>();
                    aa.add(in);
                    charOnNo.put(1, aa);

                } else {
                    charOnNo.get(1).add(in);
                }
                //维护最大次数
                if (1 > max) {
                    max = 1;
                }
                //维护字节位置信息
                No.put(in, 1);
                //如果该字符出现过
            } else {
                //不转成对象直接把char转int,报数组越界
//                charOnNo.get(No.get(in)).remove(in);
                List<Character> mm = charOnNo.get(No.get(in));
                mm.remove(Character.valueOf(in));
                if (charOnNo.get(No.get(in) + 1) == null) {
                    List<Character> bb = new LinkedList<>();
                    bb.add(in);
                    charOnNo.put(No.get(in) + 1, bb);
                } else {
                    charOnNo.get(No.get(in) + 1).add(in);
                }
                //维护最大次数
                if (No.get(in) + 1 > max) {
                    max = No.get(in) + 1;
                }
                //维护字节位置信息
                No.put(in, No.get(in) + 1);

            }
        }

        StringBuilder data = new StringBuilder();
        for (int i = max; i > 0; i--) {
            if (!charOnNo.containsKey(i) || charOnNo.get(i).size() == 0) {
                continue;
            } else {
                for (Character char1 : charOnNo.get(i)) {
                    for (int j = i; j > 0; j--) {
                        data.append(char1);
                    }
                }
            }
        }
        return data.toString();

    }
}
