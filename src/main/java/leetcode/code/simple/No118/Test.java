package leetcode.code.simple.No118;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/19 19:06
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.generate(5);
    }


    public List<List<Integer>> generate(int numRows) {

        Map<Integer, List<Integer>> cache = new HashMap<>();
        List<List<Integer>> data = new ArrayList<>();

        for (int i = 1; i < numRows + 1; i++) {
            if (cache.containsKey(i)) {
                data.add(cache.get(i));
            } else {
                List<Integer> midd = generateNew(i);
                data.add(midd);
                cache.put(i, midd);
            }
        }

        return data;

    }


    private List<Integer> generateNew(int numRows) {

        if (numRows == 1) {
            List<Integer> data = new ArrayList<>();
            data.add(1);
            return data;
        } else {
            List<Integer> pre = generateNew(numRows - 1);
            List<Integer> data = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                if (i == 0) {
                    data.add(1);
                } else if (i == numRows-1) {
                    data.add(1);
                } else {
                    data.add(pre.get(i - 1) + pre.get(i));
                }
            }
            return data;
        }
    }

}
