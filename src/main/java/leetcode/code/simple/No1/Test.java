package leetcode.code.simple.No1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.IntFunction;

/**
 * @author zhaochao
 * @date 2021/4/25 14:46
 */
public class Test {
    public static void main(String[] args) {
        int[] mm = {3,3};
        int target = 6;
        Test.twoSum(mm, target);

    }

    public static int[] twoSum(int[] nums, int target) {
        //<数值，位置>
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                Set<Integer> set = new HashSet<>();
                set.add(i);
                map.put(nums[i], set);
            } else {

                map.get(nums[i]).add(i);
            }

        }
        //遍历map可以，在遍历过程中需要增删元素的情况下不能这么玩
        for (Map.Entry<Integer, Set<Integer>> en : map.entrySet()) {
            for (Integer n : en.getValue()) {
                if (map.get(target - en.getKey()) != null) {
                    for (Integer m : map.get(target - en.getKey())) {

                        if (!n.equals(m)) {
                            int[] a = {n, m};
                            return a;
                        }
                    }
                }
            }
        }
        return null;
    }
}
