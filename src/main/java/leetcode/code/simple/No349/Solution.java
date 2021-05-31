package leetcode.code.simple.No349;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhaochao
 * @date 2021/5/31 14:29
 */
public class Solution {


    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int[] data=new int[nums1.length>=nums2.length?nums1.length:nums2.length];

        //分别放set
        for (int i1:nums1){

            set1.add(i1);
        }

        for (int i1:nums2){
            if(set1.contains(i1)){
                set2.add(i1);
            }
        }

        //然后遍历
        int[] rdata=new int[set2.size()];
        int index=0;
        for (int ll:set2){
            rdata[index]=ll;
            index++;
        }
        return rdata;
    }
}
