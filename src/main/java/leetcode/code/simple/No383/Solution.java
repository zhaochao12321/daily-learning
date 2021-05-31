package leetcode.code.simple.No383;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/31 19:22
 */
public class Solution {



    public boolean canConstruct(String ransomNote, String magazine) {
        char[] mm = magazine.toCharArray();
        char[] rr = ransomNote.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (Character character : mm) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }

        for (Character character : rr) {
            if (!map.containsKey(character)){
                return false;
            }
            if (map.get(character)==1){
                map.remove(character);
            }else {
                map.put(character,map.get(character)-1);
            }
        }
        return true;
    }
}
