package leetcode.code.simple.No453写的不对;

/**
 * @author zhaochao
 * @date 2021/6/7 19:47
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] i = {1, 2, 3};
        int data = solution.minMoves(i);
        System.out.println();
    }

    public int minMoves(int[] nums) {
        int i = 1;
        int n = nums.length;
        while (true) {
            if (((n - 1) * i) % n == 0) {
                return i;
            }
            i++;
        }
    }

}
