package leetcode.code.simple.No160需要优化;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochao
 * @date 2021/5/22 15:02
 */
public class Test {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //遍历headA,放map
        //遍历headB,有headA的节点直接返回
        Map<ListNode, Integer> data = new HashMap<>();

        while (headA != null) {
            data.put(headA, 1);
            headA = headA.next;
        }

        while (headB != null) {
            if (data.containsKey(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
