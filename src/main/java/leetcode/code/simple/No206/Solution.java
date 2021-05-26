package leetcode.code.simple.No206;

import java.util.List;

/**
 * @author zhaochao
 * @date 2021/5/26 15:25
 */
public class Solution {


    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        int[] dataInt = new int[5000];
        int index = -1;
        while (head != null) {
            index++;
            dataInt[index] = head.val;
            head = head.next;
        }

        ListNode data = new ListNode();
        ListNode ii = data;
        for (int i = index; i > -1; i--) {
            if (i == index) {
                ii.val = dataInt[i];
            } else {
                ListNode mm = new ListNode(dataInt[i]);
                ii.next = mm;
                ii = ii.next;
            }
        }

        return data;
    }
}
