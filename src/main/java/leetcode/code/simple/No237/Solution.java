package leetcode.code.simple.No237;

/**
 * @author zhaochao
 * @date 2021/5/29 9:40
 * <p>
 * 破题有点绕，其实就是删除头结点，等于是用第二个节点的值覆盖第一个节点，有点像脑筋急转弯
 */
public class Solution {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
