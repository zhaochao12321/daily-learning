package leetcode;

/**
 * @Author: zhaochao
 * @Date: 2021/2/8 13:53
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
 * <p>
 * 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * 示例 2：
 * <p>
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 * 示例 3：
 * <p>
 * 输入：nums1 = [0,0], nums2 = [0,0]
 * 输出：0.00000
 * 示例 4：
 * <p>
 * 输入：nums1 = [], nums2 = [1]
 * 输出：1.00000
 * 示例 5：
 * <p>
 * 输入：nums1 = [2], nums2 = []
 * 输出：2.00000
 *  
 * <p>
 * 提示：
 * <p>
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */
public class No4 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {2, 3};
        No4 no4 = new No4();
        Double c = no4.findMedianSortedArrays(a, b);
        System.out.print(c);
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int index1 = 0;
        int index2 = 0;
        //总数为偶
        if ((len1 + len2) % 2 == 0) {
            while (index1 < len1 && index2 < len2 && (index1 + index2) < (len1 + len2 - 2) / 2) {
                if (nums1[index1] <= nums2[index2]) {
                    index1++;
                } else {
                    index2++;
                }
            }
            //如果总步数已经凑齐
            if (((index1 + index2) == (len1 + len2 - 2) / 2)) {
                if (len1 == 0) {
                    return (nums2[index2] + nums2[index2 + 1]) / 2.0;
                } else if (len2 == 0) {
                    return (nums1[index1] + nums1[index1 + 1]) / 2.0;

                } else {
                    return (nums1[index1] + nums2[index2]) / 2.0;
                }
            }
            //有一个走完了
            else {
                //哪个到了，nums1到头了
                if (index1 == len1) {

                    return (nums2[(len1 + len2 - 2) / 2 - len1] + nums2[(len1 + len2 - 2) / 2 - len1 + 1]) / 2;
                } else {
                    return (nums1[(len1 + len2 - 2) / 2 - len2] + nums1[(len1 + len2 - 2) / 2 - len2 + 1]) / 2;
                }

            }


        }
        //总数为奇
        else {
            //如果总步数已经凑齐
            while (index1 < len1 && index2 < len2 && (index1 + index2) < (len1 + len2 - 2) / 2 + 1) {
                if (nums1[index1] <= nums2[index2]) {
                    index1++;
                } else {
                    index2++;
                }
            }


            //如果两个都没做完
            if (((index1 + index2) == (len1 + len2 - 1) / 2)) {
                if (len1 == 0) {
                    return nums2[index2];
                } else if (len2 == 0) {
                    return nums1[index1];
                } else {
                    return nums1[index1] > nums2[index2] ? nums2[index2] : nums1[index1];
                }

            }

            //有一个走完了
            else {
                //哪个到了，nums1到头了
                if (index1 == len1) {
                    return nums2[(len1 + len2 - 2 + 1) / 2 - len1];
                } else {
                    return nums1[(len1 + len2 - 2 + 1) / 2 - len2];
                }

            }
        }

    }
}
