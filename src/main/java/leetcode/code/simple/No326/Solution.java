package leetcode.code.simple.No326;

/**
 * @author zhaochao
 * @date 2021/5/31 11:56
 */
public class Solution {

    public boolean isPowerOfThree(int n) {

        if (n==1){
            return true;
        }else if (n<1){
            return false;
        }
        if (n%3!=0){
            return false;
        }else {
            return isPowerOfThree(n/3);
        }

    }
}
