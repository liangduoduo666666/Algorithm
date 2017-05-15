package offer;

public class test17 {
    public static ListNode Merge(ListNode list1,ListNode list2) {
    	if(list1==null && list2==null){
    		return null;
    	}
    	ListNode head = new ListNode(-1);
    	ListNode root = head;
    	while(list1!=null && list2!=null){
    		if(list1.val<list2.val){   		
    			head.next = list1;
    			head = head.next;
    			list1 = list1.next;
    		}else{
    			head.next = list2;
    			head = head.next;
    			list2 = list2.next;
    		}    	
    	}
    	if(list1!=null){
    		head.next = list1;
    	}
    	if(list2!=null){
    		head.next = list2;
    	}
        return root.next;
    }
    public static void main(String[] args) {
    	ListNode a = new ListNode(1);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(5);
		a.next = b;
		b.next = c;
		
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(4);
		ListNode f = new ListNode(6);
		d.next = e;
		e.next = f;
		
		ListNode i = Merge(a,d);
		System.out.println(i.val);
	}
}
