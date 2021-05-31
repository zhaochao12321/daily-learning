package leetcode.code.simple.No350;

import java.util.*;

/**
 * @author zhaochao
 * @date 2021/5/31 15:08
 */
public class Solution {


    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> d1 = new HashMap<>();
        Set<Integer> d2=new HashSet<>();

        for (int n1:nums1){
            if (!d1.containsKey(n1)){
                d1.put(n1,1);
            }else {
                d1.put(n1,d1.get(n1)+1);
            }
        }
        List<Integer> dataIn=new ArrayList<>();
        for (int n1:nums2){
            if(d1.containsKey(n1)){
                dataIn.add(n1);
                if (d1.get(n1)==1){
                    d1.remove(n1);
                }else {
                    d1.put(n1,d1.get(n1)-1);
                }
            }
        }
        int[] redata=new int[dataIn.size()];
        int index=0;
        for (int ii:dataIn){
            redata[index]=ii;
            index++;
        }
        return redata;
    }
}
