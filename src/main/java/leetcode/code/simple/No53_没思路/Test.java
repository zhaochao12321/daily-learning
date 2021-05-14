package leetcode.code.simple.No53_没思路;

/**
 * @author zhaochao
 * @date 2021/5/13 17:11
 */
public class Test {


    public static void main(String[] args) {
        Test test = new Test();
        int[] a = {1,-6,9,0,-5,-8,-2};
        int data = test.maxSubArray(a);
        System.out.println(data);
    }


    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }


}
