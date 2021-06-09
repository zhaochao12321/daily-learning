package leetcode.code.simple.No401写的不好需要优化;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochao
 * @date 2021/6/2 12:17
 */
class Solution {


    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            if (Integer.bitCount(i) > num) {
                continue;
            }
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(j) > num) {
                    continue;
                }
                int cnt = Integer.bitCount(i) + Integer.bitCount(j);
                if (cnt == num) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i).append(':');
                    if (j < 10) {
                        sb.append('0');
                    }
                    sb.append(j);
                    res.add(sb.toString());
                }
            }
        }

        return res;
    }
}