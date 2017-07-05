package niuke_linkedList;

/**
实现一个算法，删除单向链表中间的某个结点，假定你只能访问该结点。
给定带删除的头节点和要删除的数字，请执行删除操作，返回删除后的头结点。链表中没有重复数字
 * @author zhouliang
 *
 */
class Remove {
    public static ListNode removeNode(ListNode pNode, int delVal) {
    	if(pNode == null){
    		return null;
    	}
        if(pNode.val == delVal){
            return pNode.next;
        }
        ListNode pre = pNode;
        ListNode current = pre.next;
    	while(current!=null){
    		if(current.val == delVal){
    	    	pre.next = current.next;
                break;
    		}else{
                pre = current;
                current = current.next;
            }
    	}
    	return pNode;
    }
    
    public static void main(String[] args) {
    	ListNode head = new ListNode(1);
    	ListNode head1 = new ListNode(2);
    	ListNode head2 = new ListNode(3);
    	head.next = head1;
    	head1.next = head2;
    	head = removeNode(head,3);
    	while(head!=null){
    		System.out.println(head.val);
    		head = head.next;
    	}
	}
}
