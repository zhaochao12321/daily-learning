package leetcode;

/**
 * @Author: zhaochao
 * @Date: 2021/1/28 18:11
 */

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 * <p>
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 * <p>
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *  
 * <p>
 * 提示：
 * <p>
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class No2 {


    public static void main(String[] args) {


    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode top=null;
            ListNode end = top;
            int jinWei = 0;
            int value = 0;
            //两链都有数
            while (l1 != null && l2 != null) {
                //本位
                value = l1.val + l2.val + jinWei > 9 ? l1.val + l2.val + jinWei - 10 : l1.val + l2.val + jinWei;
                //进位
                jinWei = l1.val + l2.val + jinWei > 9 ? 1 : 0;
                //头节点
                if (end == null) {
                    end = new ListNode(value);
                    top = end;
                } else {
                    end.next = new ListNode(value);
                    end = end.next;
                }

                l1 = l1.next;
                l2 = l2.next;
            }
            //l1还没完
            if (l1 != null && l2 == null) {
                while (l1 != null) {
                    //本位
                    value = l1.val + jinWei > 9 ? l1.val + jinWei - 10 : l1.val + jinWei;
                    //进位
                    jinWei = l1.val  + jinWei > 9 ? 1 : 0;
                    end.next = new ListNode(value);
                    end = end.next;
                    l1 = l1.next;
                }
                //l2还没完
            } else if (l1 == null && l2 != null) {
                while (l2 != null) {
                    //本位
                    value = l2.val + jinWei > 9 ? l2.val + jinWei - 10 : l2.val + jinWei;
                    //进位
                    jinWei = l2.val  + jinWei > 9 ? 1 : 0;
                    end.next = new ListNode(value);
                    end = end.next;
                    l2 = l2.next;

                }
            }
            if (l1 ==null && l2==null &&jinWei == 1) {
                end.next = new ListNode(1);
            }


            return top;
        }
    }


