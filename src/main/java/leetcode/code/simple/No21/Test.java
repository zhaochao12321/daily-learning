package leetcode.code.simple.No21;

/**
 * @author zhaochao
 * @date 2021/5/10 17:51
 */
public class Test {

    public static void main(String[] args) {

        ListNode L1 = new ListNode();
        L1.val = 1;
        ListNode L2 = new ListNode();
        L2.val = 3;
        ListNode L3 = new ListNode();
        L3.val = 5;
        ListNode L4 = new ListNode();
        L4.val = 7;

        L1.next = L2;
        L2.next = L3;
        L3.next = L4;


        ListNode L5 = new ListNode();
        L5.val = 2;
        ListNode L6 = new ListNode();
        L6.val = 4;
        ListNode L7 = new ListNode();
        L7.val = 6;

        L5.next = L6;
        L6.next = L7;


        Test test = new Test();
        ListNode data = test.mergeTwoLists(L1, L5);
        System.out.println("");

    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //头
        ListNode data = new ListNode();
        ListNode index = data;

        while (l1 != null && l2 != null) {

            ListNode mid = null;
            if (l1.val <= l2.val) {
                index.next = l1;
                index = index.next;
                l1 = l1.next;

            } else {
                index.next = l2;
                index = index.next;
                l2 = l2.next;
            }
        }

        if (l1 == null) {
            index.next = l2;
        } else {
            index.next = l1;
        }
        return data.next;
    }
}
