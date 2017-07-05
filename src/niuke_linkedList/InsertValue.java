package niuke_linkedList;

/**
��һ������val������ڽڵ�ֵ����Ļ��������в���һ���ڵ�ֵΪval�Ľڵ㣬���ұ�֤������ε�������Ȼ����
�����������Ϣ����Ԫ�ص�ֵA����Ӧ��nxtָ���Ԫ�ر��ͬʱ����val���빹���������������������ֵ��
����������
[1,3,4,5,7],[1,2,3,4,0],2
���أ�{1,2,3,4,5,7}
 * @author zhouliang
 *
 */
class InsertValue {
    public static  ListNode insert(int[] A, int[] nxt, int val) {
        // write code here
    	if (A == null || A.length == 0) {
            return new ListNode(val);
        }
        // ������������
        ListNode root = new ListNode(A[0]);
        root.next = root;
        ListNode cur = root;
        for (int i = 0; i < A.length - 1; i++) {
            ListNode node = new ListNode(A[nxt[i]]);  
            // �������Ŀ���ﲢ����Ҫ����nextָ�룬������֡��������:���ĳ����ӡ��̫������ݡ� ����ִ���
            //node.next = cur.next;
            cur.next = node;
            cur = cur.next;
        }
        ListNode node = new ListNode(val);

        if(root.next == root){

        	if(root.val>node.val){
            	root.next = null;
            	node.next = root;
        		return node;
        	}else{
            	root.next = node;
            	node.next = null;
        		return root;
        	}
        }
        // �������
        ListNode pre = root;
        ListNode next = root.next;
        if (root.val >= val) {
            node.next = root;
            //cur.next = node;
            return node;
        }
        while (next != null && val > next.val) {
            pre = next;
            next = next.next;
        }
        node.next = next;
        pre.next = node;
        return root;

    }
    

    
    public static void main(String[] args) {
    	int[] A = {1,3,4,5};
    	int[] nex = {1,2,3,4,0};
    	ListNode head = insert(A,nex,6);
    	while(head!=null){
    		System.out.println(head.val);
    		head = head.next;
    	}
	}
}
