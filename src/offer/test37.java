package offer;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * @author zhouliang
 *
 */
class test37 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null || pHead2 == null) {
			return null;
		}
		int length1 = 0;
		int length2 = 0;
		ListNode temp = pHead1;
		while (temp != null) {
			temp = temp.next;
			length1++;
		}
		ListNode list1 = pHead1;
		ListNode list2 = pHead2;
		temp = pHead2;
		while (temp != null) {
			temp = temp.next;
			length2++;
		}
		int leave = 0;
		if(length1>length2){
			int step = length1 - length2;
			leave = length2;
			while(step>0){
				list1 = list1.next;
				step--;
			}
		}else{
			int step = length2 - length1;
			leave = length1; 
			while(step>0){
				list2 = list2.next;
				step--;
			}
		}
		while(leave>0 && list1!=null && list2!=null){
			if(list1.val == list2.val){
				return new ListNode(list1.val);
			}else{
				list1 = list1.next;
				list2 = list2.next;
			}
		}
    	return null;
    }
}
