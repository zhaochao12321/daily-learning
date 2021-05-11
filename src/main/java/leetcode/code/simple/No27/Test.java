package leetcode.code.simple.No27;

/**
 * @author zhaochao
 * @date 2021/5/11 19:28
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        int[] aa = {3, 2, 2, 3};
        int data = test.removeElement(aa, 3);
        System.out.println("");
    }

    public int removeElement(int[] nums, int val) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }

        }
        return index;
    }


}
