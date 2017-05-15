package offer;


class test16 {
    public static ListNode ReverseList(ListNode head) {
    	if(head == null){
    		return null;
    	}
    	ListNode prev = null;
    	ListNode next = null;
    	while(head!=null){
    		next = head.next;
    		head.next = prev;
    		prev = head;
    		head = next;
    	}
    	return prev;
    }
    
    public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		a.next = b;
		b.next = c;
		ListNode result = ReverseList(a);
		System.out.println(result.val);
	}
}
