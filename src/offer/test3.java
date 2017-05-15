package offer;

import java.util.ArrayList;

class test3 {
	// 3
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (listNode == null) {
			return result;
		}
		int index = 0;
		while (listNode != null) {
			result.add(result.size() - index, listNode.val);
			index++;
			listNode = listNode.next;
		}
		return result;
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		printListFromTailToHead(n1);
	}
}

