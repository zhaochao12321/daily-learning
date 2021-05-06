package leetcode.code.simple.No13;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/6 20:16
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 */
public class Test {


    public static void main(String[] args) {
        Test test = new Test();
        int data = test.romanToInt("LVIII");
        System.out.println("");
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(8);
        map.put(Character.valueOf('I'), 1);
        map.put(Character.valueOf('V'), 5);
        map.put(Character.valueOf('X'), 10);
        map.put(Character.valueOf('L'), 50);
        map.put(Character.valueOf('C'), 100);
        map.put(Character.valueOf('D'), 500);
        map.put(Character.valueOf('M'), 1000);

        int total = 0;
        int index = 0;
        char[] charFromString = s.toCharArray();

        while (index < charFromString.length) {
            //不存在后一位的情况
            if (index + 1 == charFromString.length) {
                total = total + map.get(charFromString[index]);
                index++;
            } else {
                if ('I' == charFromString[index] && ('V' == charFromString[index + 1] || 'X' == charFromString[index + 1])) {
                    total = total + map.get(charFromString[index + 1]) - map.get(charFromString[index]);
                    index = index + 2;
                } else if ('X' == charFromString[index] && ('L' == charFromString[index + 1] || 'C' == charFromString[index + 1])) {
                    total = total + map.get(charFromString[index + 1]) - map.get(charFromString[index]);
                    index = index + 2;
                } else if ('C' == charFromString[index] && ('D' == charFromString[index + 1] || 'M' == charFromString[index + 1])) {
                    total = total + map.get(charFromString[index + 1]) - map.get(charFromString[index]);
                    index = index + 2;
                } else {
                    total = total + map.get(charFromString[index]);
                    index++;
                }

            }

        }
        return total;
    }
}
