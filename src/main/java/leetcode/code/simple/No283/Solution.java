package leetcode.code.simple.No283;

/**
 * @author zhaochao
 * @date 2021/5/29 16:30
 */
public class Solution {


    public static void main(String[] args) {
//        int[] a = {0, 1, 0, 3, 12};
        int[] a = {1, 0, 1};
        Solution solution = new Solution();
        solution.moveZeroes(a);
        System.out.println();
    }

    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;

        while (left < nums.length && right < nums.length && left <= right) {
            left = leftZero(left, nums);
            right = leftNoZero(left, nums);
            if (left < right) {
                nums[left] = nums[right];
                nums[right] = 0;
            } else {
                break;
            }
        }
    }

    /**
     * 从后找非零，这样的话非零顺序变了
     *
     * @param right
     * @param nums
     * @return
     */
    private int rigthNoZero(int right, int[] nums) {
        for (int i = right; i > -1; i--) {
            if (nums[i] != 0) {
                return i;
            }
        }
        return 0;
    }

    /**
     * 从左边找非零
     *
     * @param left
     * @param nums
     * @return
     */
    private int leftNoZero(int left, int[] nums) {
        for (int i = left; i < nums.length; i++) {
            if (nums[i] != 0) {
                return i;
            }
        }
        return 0;
    }


    /**
     * 从前找零
     *
     * @param left
     * @param nums
     * @return
     */
    private int leftZero(int left, int[] nums) {
        for (int i = left; i < nums.length; i++) {
            if (nums[i] == 0) {
                return i;
            }
        }
        return 0;
    }
}
