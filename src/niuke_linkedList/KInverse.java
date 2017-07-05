package niuke_linkedList;

import java.util.Stack;

/**
��һ�������������һ���㷨��ʹ��ÿK���ڵ�֮������
�����󲻹�K���ڵ�һ�飬�򲻵�����󼸸��ڵ㡣
��������1->2->3->4->5->6->7->8->null��K=3������ӡ�
������Ϊ��3->2->1->6->5->4->7->8->null����ΪK==3��
����ÿ�����ڵ�֮�����򣬵����е�7��8����������Ϊֻ�������ڵ㲻��һ�顣
����һ���������ͷָ��head,ͬʱ����Kֵ�����������������ͷָ�롣
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
