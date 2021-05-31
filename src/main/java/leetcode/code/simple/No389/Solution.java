package leetcode.code.simple.No389;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/31 20:25
 */
public class Solution {


    public char findTheDifference(String s, String t) {
        char [] ss=s.toCharArray();
        char [] tt=t.toCharArray();

        Map<Character, Integer> map=new HashMap<>();

        for (Character sss:ss){
            if (map.containsKey(sss)){

                map.put(sss,map.get(sss)+1);
            }else {
                map.put(sss,1);
            }
        }


        for (Character ttt:tt){
            if (!map.containsKey(ttt)){
                return ttt;
            }
            else {
                if (map.get(ttt)==1){
                    map.remove(ttt);
                }else {
                    map.put(ttt,map.get(ttt)-1);
                }
            }
        }
        return 'a';
    }

}
