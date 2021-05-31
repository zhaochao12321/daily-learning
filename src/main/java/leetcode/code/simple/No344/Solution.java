package leetcode.code.simple.No344;

/**
 * @author zhaochao
 * @date 2021/5/31 13:48
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution=new Solution();
       char[] a={'h','e','l','l','o'};
        solution.reverseString(a);
        System.out.println();
    }
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while (left<right){
            Character data=null;
            data=s[left];
            s[left]=s[right];
            s[right]=data;
            left++;
            right--;
        }
    }
}
