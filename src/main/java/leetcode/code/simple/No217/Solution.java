package leetcode.code.simple.No217;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhaochao
 * @date 2021/5/26 20:19
 */
public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
