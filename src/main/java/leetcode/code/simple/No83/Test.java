package leetcode.code.simple.No83;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/15 12:06
 */
public class Test {

    public static void main(String[] args) {
        ListNode L1 = new ListNode();
        ListNode L2 = new ListNode();
        ListNode L3 = new ListNode();
        ListNode L4 = new ListNode();
        ListNode L5 = new ListNode();
        ListNode L6 = new ListNode();
        L1.val = 0;
        L2.val = 0;
        L3.val = 0;
        L4.val = 0;
        L5.val = 0;
        L6.val = 0;


        L1.next = L2;
        L2.next = L3;
        L3.next = L4;
        L4.next = L5;
        L5.next = L6;


        Test test = new Test();
        ListNode data = test.deleteDuplicates(L1);
        System.out.println("");
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode index = head;
        Map<Integer, Integer> h = new HashMap<>();
        h.put(index.val, index.val);

        while (index.next != null) {
            if (h.containsKey(index.next.val)) {
                index.next = index.next.next;

            } else {
                h.put(index.next.val, index.next.val);
                index = index.next;
            }

        }
        return head;
    }


}
