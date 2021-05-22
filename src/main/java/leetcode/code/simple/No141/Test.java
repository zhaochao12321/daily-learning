package leetcode.code.simple.No141;

/**
 * @author zhaochao
 * @date 2021/5/22 12:39
 */
public class Test {

//    public boolean hasCycle(ListNode head) {
//        //保证没有空指针
//        if (head == null || head.next == null) {
//            return false;
//        }
//        ListNode head_1 = head;
//        ListNode head_2 = head.next.next;
//
//        while (true) {
//            if (head_1 == null || head_2 == null) {
//                return true;
//            }
//
//            if (head_1 == head_2) {
//                return true;
//            } else {
//                //防止空指针
//                if (head_2.next == null) {
//                    return false;
//                } else {
//                    head_1 = head_1.next;
//                    head_2 = head_2.next.next;
//                }
//            }
//        }
//    }





    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }



}
