package offer;

/**
 * 一个链表中包含环，请找出该链表的环的入口结点。
 * 
 * @author zhouliang
 *
 */
class test56 {
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		ListNode meetingNode = meetingNode(pHead);
		if(meetingNode == null){
			return null;
		}
		int step = 1;
		ListNode temp = meetingNode;
		while(temp.next != meetingNode){
			temp = temp.next;
			step++;
		}
		temp = pHead;
		for(int i=0; i<step; i++){
			temp = temp.next;
		}
		ListNode temp2 = pHead;
		while(temp != temp2){
			temp = temp.next;
			temp2 = temp2.next;
		}
		return temp;
	}
	
	public ListNode meetingNode(ListNode pHead){
		if(pHead == null){
			return null;
		}
		ListNode slow = pHead.next;
		if(slow == null){
			return null;
		}
		ListNode fast = slow.next;
		while(fast !=null && slow !=null){
			if(fast == slow ){
				return slow;
			}
			slow = slow.next;
			fast = fast.next;
			if(fast!=null){
				fast = fast.next;
			}
		}
		return null;
	}
}
