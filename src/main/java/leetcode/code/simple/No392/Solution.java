package leetcode.code.simple.No392;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/31 21:20
 */
public class Solution {

    public static void main(String[] args) {
        String s= "abc";
        String t= "ahbgdc";
        Solution solution=new Solution();
        solution.isSubsequence(s,t);
    }

    /**
     * 判断 s 是否为 t 的子序列。
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        char [] tt=t.toCharArray();
        char [] ss=s.toCharArray();

        Map<Character, Integer> map=new HashMap<>();
       int indext=0;
       int indexs=0;
        while (indexs<ss.length && indext<tt.length){
            if (tt[indext]==ss[indexs]){
                indexs++;
            }
            indext++;

        }
        if(indexs==s.length()){
            return true;
        }
        return false;
    }

}
