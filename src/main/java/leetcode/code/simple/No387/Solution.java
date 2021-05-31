package leetcode.code.simple.No387;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/31 20:02
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution=new Solution();
        int aa = solution.firstUniqChar("leetcode");
        System.out.println();
    }

    public int firstUniqChar(String s) {
        //记录每位的重复情况
        int[] index=new int[s.length()];
        //记录每个字符第一次出现的位置
        Map<Character, Integer> map=new HashMap<>();

       char[] ss=s.toCharArray();
       for (int i=0;i<ss.length;i++){
           if (map.containsKey(ss[i])){
               index[map.get(ss[i])]=1;
               index[i]=1;
           }else {
               map.put(ss[i],i);
           }

       }
       for (int i=0;i<index.length;i++){
           if (index[i]!=1){
               return i;
           }
        }
        return -1;
    }

}
