package leetcode.code.simple.No219;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/26 20:26
 */
public class Solution {


    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
