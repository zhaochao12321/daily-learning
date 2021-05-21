package leetcode.code.simple.No119;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochao
 * @date 2021/5/21 14:50
 */
public class Test {


    public List<Integer> getRow(int rowIndex) {

        return getR(rowIndex + 1);
    }


    private List<Integer> getR(int rowIndex) {

        if (rowIndex == 1) {
            List<Integer> data = new ArrayList<>();
            data.add(1);
            return data;
        } else {
            List<Integer> pre = getR(rowIndex - 1);
            List<Integer> data = new ArrayList<>();
            for (int i = 0; i < rowIndex; i++) {
                if (i == 0) {
                    data.add(1);
                } else if (i == rowIndex - 1) {
                    data.add(1);
                } else {
                    data.add(pre.get(i - 1) + pre.get(i));
                }
            }
            return data;
        }
    }
}
