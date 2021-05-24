package leetcode.code.simple.No169;


import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/24 11:29
 */
public class Solution {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> data = new HashMap<>();
        for (int no : nums) {
            if (data.containsKey(no)) {
                data.put(no, data.get(no) + 1);
            } else {
                data.put(no, 1);
            }
        }

        for (int key : data.keySet()) {
            if (data.get(key) > nums.length / 2) {
                return key;
            }
        }
        return 0;

    }


}
