package niuke_linkedList;

import java.util.Stack;

/**
有一个单链表，请设计一个算法，使得每K个节点之间逆序，
如果最后不够K个节点一组，则不调整最后几个节点。
例如链表1->2->3->4->5->6->7->8->null，K=3这个例子。
调整后为，3->2->1->6->5->4->7->8->null。因为K==3，
所以每三个节点之间逆序，但其中的7，8不调整，因为只有两个节点不够一组。
给定一个单链表的头指针head,同时给定K值，返回逆序后的链表的头指针。
 * @author zhouliang
 *
 */
class KInverse {
    public ListNode inverse(ListNode head, int k) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(head.val);
        int count = 1;
        ListNode curHead = head;
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
            stack.push(temp.val);
            count++;
            if(count == k) {
                while(!stack.isEmpty()) {
                    curHead.val = stack.pop();
                    curHead = curHead.next;
                }
                count = 0;
            }
        }
        return head;
    }
}
