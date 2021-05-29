package leetcode.code.simple.No268;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zhaochao
 * @date 2021/5/29 15:50
 */
public class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> data = new HashSet<>();

        for (int i : nums) {
            data.add(i);
        }

        for (int ii = 0; ii < nums.length + 1; ii++) {
            if (!data.contains(ii)) {
                return ii;
            }
        }

        return 0;

    }
}
