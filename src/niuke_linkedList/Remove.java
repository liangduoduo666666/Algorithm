package niuke_linkedList;

/**
ʵ��һ���㷨��ɾ�����������м��ĳ����㣬�ٶ���ֻ�ܷ��ʸý�㡣
������ɾ����ͷ�ڵ��Ҫɾ�������֣���ִ��ɾ������������ɾ�����ͷ��㡣������û���ظ�����
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
