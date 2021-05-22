package leetcode.code.simple.No136需要优化;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhaochao
 * @date 2021/5/22 12:19
 */
public class Test {


    public int singleNumber(int[] nums) {
        Set<Integer> has = new HashSet<>();

        for (int aa : nums) {
            if (has.contains(aa)) {
                has.remove(aa);
            } else {
                has.add(aa);
            }
        }

        for (int str : has) {

            return str;
        }
        return 0;
    }
}
