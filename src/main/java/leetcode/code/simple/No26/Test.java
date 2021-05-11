package leetcode.code.simple.No26;

/**
 * @author zhaochao
 * @date 2021/5/11 17:04
 */
public class Test {


    public static void main(String[] args) {
        int[] aa = {1, 1, 1, 1, 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 7, 7, 7, 7, 7, 8, 8, 8,};
        Test test = new Test();
        int length = test.removeDuplicates(aa);
        System.out.println(length);
    }

    public int removeDuplicates(int[] nums) {

        if (nums.length < 2) {
            return nums.length;
        }
        int length = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                length++;
                nums[length-1] = nums[i+1];
            }
        }

        return length;
    }


}
