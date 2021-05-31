package leetcode.code.simple.No374;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

/**
 * @author zhaochao
 * @date 2021/5/31 19:04
 */
public class Solution  extends GuessGame{
    public static void main(String[] args) {

        Solution solution=new Solution();
       int data= solution.guessNumber(10);
        System.out.println();
    }

    public int guessNumber(int n) {

        int left=0;
        int right=n;
        int mid=0;
        while (left<right){

            if (guess(left)==0){
                return left;
            }else if (guess(right)==0){
                return right;
            }
            mid=(left+(right-left)/2);
            if (guess(mid)>0){
                left=mid;
            }

            else if (guess(mid)<0){
                right=mid;
            }else {
                return mid;
            }
        }
        return 0;
    }
}
