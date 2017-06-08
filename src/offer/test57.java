package offer;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * @author zhouliang
 *
 */
class test57 {
    public static ListNode deleteDuplication(ListNode pHead)
    {
    	if(pHead==null){
    		return null;
    	}
    	if(pHead.next == null){
    		return pHead;
    	}
    	ListNode current = pHead;
    	ListNode preNode = null;
    	ListNode newHead = null;
    	while(current.next != null){  		
    		if(current.val == current.next.val){		
    			while(current.next!=null && current.val == current.next.val){
    				current = current.next;
    			}
    			current = current.next;
    			if(current == null){
    				if(preNode != null){
            			preNode.next = current; 
        			}    			
        			preNode = current;
        			break;
    			}
    			if(current.next==null || current.val != current.next.val){
    				if(preNode != null){
            			preNode.next = current; 
        			}    			
        			preNode = current;
        			if(newHead == null){
        				newHead = preNode;
        			}
    			} 		
    		}else{
    			preNode = current;
    			if(newHead == null){
    				newHead = preNode;
    			}
    			current = current.next;
    		}
    	}
    	return newHead;
    }
    
    public static void main(String[] args) {
    	ListNode temp = new ListNode(1);
    	ListNode temp1 = new ListNode(1);
    	ListNode temp2 = new ListNode(1);
    	ListNode temp3 = new ListNode(1);
    	ListNode temp4 = new ListNode(3);
    	ListNode temp5 = new ListNode(3);
    	ListNode temp6 = new ListNode(4);
    	temp.next  = temp1;
    	temp1.next = temp2;
    	temp2.next = temp3;
    	temp3.next = temp4;
    	temp4.next = temp5;
    	temp5.next = temp6;
    	ListNode newNode  = deleteDuplication(new ListNode(1));
    	while(newNode!=null){
    		System.out.println(newNode.val);
    		newNode = newNode.next;
    	}
	}
}
