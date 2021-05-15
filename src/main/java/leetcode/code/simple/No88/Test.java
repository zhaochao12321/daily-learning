package leetcode.code.simple.No88;

import java.util.Arrays;

/**
 * @author zhaochao
 * @date 2021/5/15 13:39
 */
public class Test {


    public static void main(String[] args) {
        Test test = new Test();
//        int[] nums1 = {22, 33, 44, 0, 0, 0};
        int[] nums1 = {0};
//        int m = 3;
        int m = 0;
//        int[] nums2 = {2, 5, 6};
        int[] nums2 = {1};
//        int n = 3;
        int n = 1;

        test.merge(nums1, m, nums2, n);
        System.out.println("");
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int index = m + n - 1;
        boolean mm = true;
        if (m == 1) {
            mm = false;
        } else if (m == 0) {
            nums1 = nums2;
            mm = false;
        }
        while ((m > 0 || n > 0) && mm) {

            nums1[index] = nums1[m - 1] > nums2[n - 1] ? nums1[m - 1] : nums2[n - 1];
            index--;
            if (nums1[m - 1] > nums2[n - 1] && m > 0) {
                m--;
            } else if (n > 0) {
                n--;
            }

            //nums1 的数据全部插入了，直接复制复制nums2的剩余数据即可
            if (m == 0) {
                while (n > 0) {
                    nums1[index] = nums2[n - 1];
                    index--;
                    n--;
                }
                break;
                //nums2 的数据全部插入了，直接跳出就可以了
            } else if (n == 0) {
                break;
            }
        }

    }


//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//
//        for (int i = 0; i < n; i++) {
//            nums1[m + i] = nums2[i];
//        }
//
//        Arrays.sort(nums1);
//
//    }

}
