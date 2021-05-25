package leetcode.code.simple.No203;

/**
 * @author zhaochao
 * @date 2021/5/25 10:14
 */
public class Solution {

    public static void main(String[] args) {
//        1,2,6,3,4,5,6
        ListNode L1 = new ListNode(1);
        ListNode L2 = new ListNode(2);
        ListNode L3 = new ListNode(6);
        ListNode L4 = new ListNode(3);
        ListNode L5 = new ListNode(4);
        ListNode L6 = new ListNode(5);
        ListNode L7 = new ListNode(6);

        L1.next = L2;
        L2.next = L3;
        L3.next = L4;
        L4.next = L5;
        L5.next = L6;
        L6.next = L7;

        Solution solution = new Solution();
        solution.removeElements(L1, 6);

    }

    public ListNode removeElements(ListNode head, int val) {

        ListNode ahead;
        //找头结点
        while (head != null && head.val == val) {
            head = head.next;
        }
        //记录真实的头结点
        ahead = head;

        while (head != null) {
            if (head.next != null) {
                if (head.next.val == val) {
                    head.next = head.next.next;
                } else {
                    head = head.next;
                }
            } else {
                break;
            }
        }
        return ahead;
    }
}
