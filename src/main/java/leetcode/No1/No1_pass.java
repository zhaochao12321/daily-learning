package leetcode.No1;

import java.util.*;

public class No1_pass {

    public static void main(String[] args) {

        No1_pass no1_pass = new No1_pass();

        no1_pass.twoSum(new int[]{1, 2, 4, 6, 7, 8, 9, 0}, 8);
        System.out.println();


    }


    public int[] twoSum(int[] nums, int target) {
        int targetNums[] = {0, 0};
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
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
                        if (integer != integer1) {
                            targetNums[0] = integer;
                            targetNums[1] = integer1;
                        }
                    }
                }
                map.entrySet().remove(entry.getKey());
                map.entrySet().remove(target - entry.getKey());
            }
        }

        return targetNums;
    }
}
