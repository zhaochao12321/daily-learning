package leetcode.code.simple.No35;

import sun.plugin2.main.server.WindowsHelper;

import java.util.function.IntFunction;

/**
 * @author zhaochao
 * @date 2021/5/13 14:34
 */
public class Test {


    public static void main(String[] args) {
        Test test = new Test();
        int[] nums = {1, 5, 8, 9, 12};
        int target = 7;
        int data = test.searchInsert(nums, target);
        System.out.println("");

    }


    public int searchInsert(int[] nums, int target) {

        if (nums.length == 0) {
            return 0;
        } else if (target > nums[nums.length - 1]) {
            return nums.length;
        } else if (target <= nums[0]) {
            return 0;
        }
        int indexL = 0;
        int indexR = nums.length - 1;
        int indexM = 0;

        while (indexR > indexL + 1) {
            indexM = (indexR + indexL) / 2;

            if (nums[indexM] == target) {
                return indexM;
            } else if (nums[indexM] > target) {
                indexR = indexM;
            } else {
                indexL = indexM;
            }
        }
        return indexR;

    }


}
