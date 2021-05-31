package leetcode.code.simple.No345;

import java.rmi.UnmarshalException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zhaochao
 * @date 2021/5/31 14:04
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution= new Solution();
       String data= solution.reverseVowels(".,");
       System.out.println();
    }



    public String reverseVowels(String s) {
        char[] ss=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        Set<Character> data=new HashSet<>();
        data.add('a');
        data.add('A');
        data.add('e');
        data.add('E');
        data.add('i');
        data.add('I');
        data.add('o');
        data.add('O');
        data.add('u');
        data.add('U');


        while (left<right){

            while (left<ss.length && !data.contains(ss[left])){
                left++;

            }
            while (right>-1 && !data.contains(ss[right])){
                right--;
            }
                if (left<right){
                    Character mid=null;
                    mid=ss[left];
                    ss[left]=ss[right];
                    ss[right]=mid;
                    left++;
                    right--;
                }

        }
        return String.valueOf(ss);
    }
}
