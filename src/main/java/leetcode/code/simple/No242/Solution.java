package leetcode.code.simple.No242;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/29 9:57
 */
public class Solution {


    public static void main(String[] args) {
        String a = "anagram";
        String b = "nagaram";

        Solution solution = new Solution();
        boolean data = solution.isAnagram(a, b);
        System.out.println();

    }

    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Map<Character, Integer> data = new HashMap<>();
        for (char i : ss) {
            if (data.containsKey(i)) {
                data.put(i, data.get(i) + 1);
            } else {
                data.put(i, 1);
            }
        }

        for (char j : tt) {
            if (!data.containsKey(j)) {
                return false;
            } else {
                if (data.get(j) == 1) {
                    data.remove(j);
                } else {
                    data.put(j, data.get(j) - 1);
                }
            }
        }

        if (data.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
