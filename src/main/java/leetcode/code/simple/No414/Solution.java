package leetcode.code.simple.No414;

/**
 * @author zhaochao
 * @date 2021/6/5 17:34
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] data = {1, 2, -2147483648};
        solution.thirdMax(data);
    }

    public int thirdMax(int[] nums) {

        int max1 = -1;
        boolean max1b = false;
        int max2 = -1;
        boolean max2b = false;
        int max3 = -1;
        boolean max3b = false;
        for (int ss : nums) {
            if (!max1b) {
                max1 = ss;
                max1b = true;
                continue;
            }
            if (ss > max1) {
                int mid = max1;
                max1 = ss;
                ss = mid;
                max1b = true;
            } else if (ss == max1) {
                continue;
            }
            if (!max2b) {
                max2b = true;
                max2 = ss;
                continue;
            }
            if (ss > max2) {
                int mid = max2;
                max2 = ss;
                ss = mid;
                max2b = true;
            } else if (ss == max2) {
                continue;
            }

            if (!max3b) {
                max3b = true;
                max3 = ss;
                continue;
            }
            if (ss > max3) {
                max3 = ss;
                max3b = true;
            }

        }
        if (max3b) {
            return max3;
        } else {
            return max1;
        }

    }

}
