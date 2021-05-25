package leetcode.code.simple.No205;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/25 20:31
 */
public class Solution {

    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        Solution solution = new Solution();
        solution.isIsomorphic(s, t);
    }


    public boolean isIsomorphic(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        boolean data = true;
        for (int i = 0; i < ss.length; i++) {
            if (map1.containsKey(ss[i]) || map2.containsKey(tt[i])) {
                if (map1.get(ss[i]) == null || map2.get(tt[i]) == null || tt[i] != map1.get(ss[i]) || ss[i] != map2.get(tt[i])) {
                    data = false;
                    break;
                }
            } else {
                map1.put(ss[i], tt[i]);
                map2.put(tt[i], ss[i]);
            }
        }
        return data;

    }
}
