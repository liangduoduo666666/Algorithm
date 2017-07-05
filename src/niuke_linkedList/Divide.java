package niuke_linkedList;

/**
 * ����һ������������Ҫ��һ���ض���ֵ��ɶ����ķֻ���ʹ��С�ڵ������ֵ�Ľ���Ƶ�ǰ�棬 ���ڸ�ֵ�Ľ���ں��棬ͬʱ��֤�������ڲ���λ�ù�ϵ���䡣
 * ����һ�������ͷ���head��ͬʱ������ֵval���뷵��һ������ ʹС�ڵ������Ľ����ǰ�����ڵ��������ں󣬱�֤���ֵ���ظ��� ����������
 * {1,4,2,5},3 {1,2,4,5}
 * 
 * @author zhouliang
 *
 */
class Divide {
	public ListNode listDivide(ListNode head, int pivot) {
		ListNode sH = null; // small head
		ListNode sT = null; // small tail
		ListNode bH = null; // big head
		ListNode bT = null; // big tail
		ListNode next = null; // save next node
		while (head != null) {
			next = head.next;
			head.next = null;
			if (head.val <= pivot) {
				if (sH == null) {
					sH = head;
					sT = head;
				} else {
					sT.next = head;
					sT = head;
				}
			}else {
				if (bH == null) {
					bH = head;
					bT = head;
				} else {
					bT.next = head;
					bT = head;
				}
			}
			head = next;
		}
		if (sT != null) {
			sT.next = bH;
		}
		return sH != null ? sH : bH;
	}
}
