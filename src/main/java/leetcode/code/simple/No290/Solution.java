package leetcode.code.simple.No290;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/29 17:12
 */
public class Solution {


    public boolean wordPattern(String pattern, String s) {
        char[] aa = pattern.toCharArray();
        String[] bb = s.split(" ");

        if (aa.length != bb.length) {
            return false;
        }

        Map<Character, String> data = new HashMap<>();
        Map<String, Character> data1 = new HashMap<>();

        for (int i = 0; i < aa.length; i++) {

            if (data.containsKey(aa[i])) {
                if (!data.get(aa[i]).equals(bb[i])) {
                    return false;
                }
            } else {
                data.put(aa[i], bb[i]);
            }

            if (data1.containsKey(bb[i])) {
                if (!data1.get(bb[i]).equals(aa[i])) {
                    return false;
                }
            } else {
                data1.put(bb[i], aa[i]);
            }

        }
        return true;
    }
}
