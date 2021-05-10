package leetcode.code.simple.No20;

import java.util.*;

/**
 * @author zhaochao
 * @date 2021/5/7 18:49
 * 思路：实现一个栈
 * 通宵
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        boolean aa = test.isValid("()[]{}");
        System.out.println("");
    }


    public boolean isValid(String string) {
        boolean data;
        Map<Character, Character> map = new HashMap<>();

        map.put(Character.valueOf(')'), Character.valueOf('('));
        map.put(Character.valueOf('}'), Character.valueOf('{'));
        map.put(Character.valueOf(']'), Character.valueOf('['));

        char[] chars = string.toCharArray();

        //左括号堆栈
        List<Character> stack = new ArrayList<>();
        //左半边栈
        for (char s : chars) {

            if (!map.containsKey(s)) {
                stack.add(s);
            } else {
                if (stack.size() < 1) {
                    return false;
                } else if (map.get(s).equals(stack.get(stack.size() - 1))) {

                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            }
        }
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }

    }
}
