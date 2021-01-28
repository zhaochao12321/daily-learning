package leetcode;

/**
 * @Author: zhaochao
 * @Date: 2021/1/25 21:01
 */


import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 你可以按任意顺序返回答案。
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class No1 {
    public static void main(String[] args) {

        int target = 16;
        int num[] = new int[]{3, 4, 5, 6, 8, 8, 8, 8, 7, 6, 9};
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(num[i])) {
                map.get(num[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(num[i], list);
            }
        }
        Set<Integer> qu = new HashSet<>();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (map.containsKey(target - entry.getKey())) {
                if (qu.contains(entry.getKey()) || qu.contains(target - entry.getKey())) {
                    continue;
                } else {
                    qu.add(entry.getKey());
                    qu.add(target - entry.getKey());
                }
                for (Integer integer : map.get(entry.getKey())) {
                    for (Integer integer1 : map.get(target - entry.getKey())) {
                        System.out.print("{" + integer + " " + integer1 + "}");
                    }
                }
                map.entrySet().remove(entry.getKey());
                map.entrySet().remove(target - entry.getKey());
            }
        }
    }
}
